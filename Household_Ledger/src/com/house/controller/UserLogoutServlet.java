package com.house.controller;
 // 완성
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/logout")
public class UserLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
    	
    	HttpSession session = request.getSession();    // 세션끊고 index로 이동하기  
    	session.invalidate();
    	response.sendRedirect("index.jsp");   	
    } 
}
