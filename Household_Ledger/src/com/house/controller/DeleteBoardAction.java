package com.house.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.model.service.BoardService;

/**
 * Servlet implementation class DeleteBoardAction
 */
@WebServlet("/delete")
public class DeleteBoardAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idx = request.getParameter("idx");
		try {
			if(idx==null) {
				throw new Exception("글번호 반드시입력해주세요.");
			}
			BoardService.delete(Integer.parseInt(idx));
			response.sendRedirect("select");
			return;
			
		}catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		request.getRequestDispatcher("errorView/error.jsp").forward(request, response);
	}

}
