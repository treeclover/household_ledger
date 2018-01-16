package com.house.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.model.dto.HouseholdDTO;
import com.house.model.service.HouseholdService;

public class SelectHouseAction implements Action {
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		userId = "aaaa";		
		try {
			List<HouseholdDTO> list = new ArrayList<>();
			
			list = HouseholdService.selectThree(userId);
			
			request.setAttribute("list", list);
			request.getRequestDispatcher("/house/house.jsp").forward(request, response);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errMsg", e.getMessage());
		}
		
		request.getRequestDispatcher("/error/error.jsp").forward(request, response);
	}

}
