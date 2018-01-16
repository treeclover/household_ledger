package com.house.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.house.model.service.UserService;
import com.house.model.service.UserServiceImpl;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 현재 세션의 아이디 가져오기 
		HttpSession session = request.getSession();
		String dbId =  (String)session.getAttribute("loginId");
		String dbPwd= (String)session.getAttribute("loginPwd");
		
		// memberDelete에서 입력한 
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
	
		try {
			if(!(userPwd.equals(dbPwd) || userId.equals(dbId)))
			{
				throw new SQLException("정보를 다시 확인해주세요.");
			}
			
			 UserService service =new UserServiceImpl();
			 service.memberDelete(userId);
			 
			 response.sendRedirect("logout");
			 return ;
		}
		
		    
		catch (SQLException e) {
			e.printStackTrace();//서버창
			request.setAttribute("errMsg", e.getMessage());
		}		
		request.getRequestDispatcher("errorView/error.jsp").forward(request, response);	
				
	}

}

