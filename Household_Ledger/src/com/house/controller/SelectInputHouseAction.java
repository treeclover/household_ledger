package com.house.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.model.dto.HouseholdDTO;
import com.house.model.service.HouseholdService;

public class SelectInputHouseAction implements Action {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String rec = request.getParameter("record");
		userId = "aaaa";
		
		try {
			List<HouseholdDTO> list = new ArrayList<>();
			
			list = HouseholdService.selectHouseRecord(userId, rec);
			
			request.setAttribute("record", rec);
			request.setAttribute("list", list);
			request.getRequestDispatcher("/house/record.jsp").forward(request, response);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errMsg", e.getMessage());
		}
		
		request.getRequestDispatcher("/error/error.jsp").forward(request, response);
		
	}
	
}
