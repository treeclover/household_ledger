package com.house.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.model.dto.BoardDTO;
import com.house.model.service.BoardService;

/**
 * Servlet implementation class UpdateBoardAction
 */
@WebServlet("/update")
public class UpdateBoardAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="errorView/error.jsp";
		
		//넘어오는 값들 받기
		
		String userId = request.getParameter("userId");
		String title = request.getParameter("title");
		String content =  request.getParameter("content");
//		String fileName =  request.getParameter("fileName");		
		//유효성 검사
		try{
			System.out.println("성공");
		  if(userId==null || title==null || content==null){
			
			  throw new Exception("입력값이 충분하지 않습니다.");
		  }
		  
		  BoardDTO bdto = new BoardDTO(userId, title, content);
		  BoardService.update(bdto); 
		  url="update";
		}catch(Exception e){
			request.setAttribute("errorMsg", e.getMessage());
		}
		
		request.getRequestDispatcher(url).forward(request, response);

	}
}


