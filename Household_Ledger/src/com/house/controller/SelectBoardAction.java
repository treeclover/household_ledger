package com.house.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.model.dto.BoardDTO;
import com.house.model.service.BoardService;

/**
 * Servlet implementation class SelectBoardAction
 */
@WebServlet("/select")
public class SelectBoardAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="errorView/error.jsp";
				
		try{	
		 List<BoardDTO> list = BoardService.selectAll();
		 request.setAttribute("list", list);//viewpage에서 ${list}
		 url="list.jsp";
		 
		}catch(SQLException e){
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());//뷰페이지 ${errorMsg}
		}
		
		 request.getRequestDispatcher(url).forward(request, response);
	}

}
