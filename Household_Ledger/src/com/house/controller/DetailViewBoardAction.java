package com.house.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.model.dto.BoardDTO;
import com.house.model.service.BoardService;

public class DetailViewBoardAction implements Action {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flag = request.getParameter("flag");
		boolean state=false;
		if(flag!=null)state=false;
		int idx = Integer.parseInt(request.getParameter("idx"));
		String url="errorView/error.jsp";
		String userId = request.getParameter("userId");
		System.out.println("함수진입");
		try{
			System.out.println("서비스 실행 전");
		   BoardDTO bdto=BoardService.selectByViewCount(idx, state);//조회수증가
		   System.out.println("서비스 실행 후");
		   request.setAttribute("bdto", bdto); 	
		   url="read.jsp";
		}catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMsg", e.getMessage());
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}
}
