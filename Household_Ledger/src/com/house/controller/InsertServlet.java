package com.house.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.model.dto.UserDTO;
import com.house.model.service.UserService;
import com.house.model.service.UserServiceImpl;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 넘어온 값들을 받기
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String name = request.getParameter("name");
		String birthDate = request.getParameter("birthDate");
		String emailAddr = request.getParameter("emailAddr");
		String div = request.getParameter("div");
		
		try {
			if(userId==null || userPwd==null || name==null || birthDate==null || emailAddr==null ||div==null ||
			   userId.equals("") ||userPwd.equals("") ||name.equals("") || birthDate.equals("") ||	emailAddr.equals("")||	div.equals("")) {
				throw new SQLException("값이 충분하지 않습니다.");
				// userId.length() 가 바이트수를 넘으면 
			}
			
			//2. 전송된 값들을 이요하여 MemeberDTO를 생성 
			UserDTO userDTO =
					new UserDTO(userId, userPwd, name, birthDate, emailAddr,div);
			
			UserService service = new UserServiceImpl();
		   service.memberInsert(userDTO); 
		   response.sendRedirect("index.jsp");
		   
		   return;
		}catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg",e.getMessage());
		}
		
		request.getRequestDispatcher("errorView/error.jsp").forward(request, response);
	}
 
}
