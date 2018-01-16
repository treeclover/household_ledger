package com.house.controller;
// 로그인 
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.house.model.dto.UserDTO;
import com.house.model.service.UserService;
import com.house.model.service.UserServiceImpl;

 
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd"); 
		
		UserService userService = new UserServiceImpl();
		try {
			UserDTO userDTO = userService.loginCheck(new UserDTO(userId, userPwd));
			//세션에 정보를 저장완료
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", userDTO.getUserId());
			session.setAttribute("loginPwd", userDTO.getUserPwd()); 
			
			response.sendRedirect("index.jsp");
			return;
			
		}catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg",e.getMessage());
		}
		
		request.getRequestDispatcher("errorView/error.jsp").forward(request, response);
	}

}
