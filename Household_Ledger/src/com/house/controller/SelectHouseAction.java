package com.house.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.model.dto.HouseholdDTO;
import com.house.model.dto.RMoneyDTO;
import com.house.model.service.HouseholdService;
import com.house.model.service.RMoneyService;

public class SelectHouseAction implements Action {
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		userId = "aaaa";
		try {
			List<HouseholdDTO> list = new ArrayList<>();
			List<RMoneyDTO> listMoney = new ArrayList<>();
			
			list = HouseholdService.selectThree(userId);
			listMoney = RMoneyService.selectAll(userId);
			
			request.setAttribute("list", list);
			request.setAttribute("listMoney", listMoney);
			request.getRequestDispatcher("/house/house.jsp").forward(request, response);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errMsg", e.getMessage());
		}
		
		request.getRequestDispatcher("/error/error.jsp").forward(request, response);
	}

}
