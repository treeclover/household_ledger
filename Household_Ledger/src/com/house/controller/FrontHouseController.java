package com.house.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class FrontHouseController
 */
@WebServlet("/house")
public class FrontHouseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, Action> map;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		map = (Map<String, Action>)config.getServletContext().getAttribute("map");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		if(command == null) command = "list";
		System.out.println(command);
		map.get(command).service(request, response);
	}

}
