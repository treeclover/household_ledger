package com.house.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.house.controller.Action;
import com.house.model.dto.HouseholdDTO;
import com.house.model.service.HouseholdService;

public class SelectDetailHouseAction implements Action {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		userId = "aaaa";
		String ownType = request.getParameter("ownType");
		String record = request.getParameter("record");
		String ownKind = request.getParameter("ownKind");
		
		ownType = checkValue(ownType);
		record = checkValue(record);
		ownKind = checkValue(ownKind);
		
		try {
			List<HouseholdDTO> list = new ArrayList<>();
			
			if(ownType.equals("") && record.equals("") && ownKind.equals("")) {
				list = HouseholdService.selectAll(userId);
			} else if(ownType.equals("")) {
				if(record.equals("")) {
					list = HouseholdService.selectHouseKind(userId, ownKind);
				} else {
					list = HouseholdService.selectHouseKindAndRecord(userId, ownKind, record);
				}
			} else {
				if(record.equals("")) {
					list = HouseholdService.selectHouseType(userId, ownType);
				} else {
					list = HouseholdService.selectHouseKindAndRecord(userId, ownType, record);
				}
			}
			request.setAttribute("list", list);
			request.getRequestDispatcher("/house/house.jsp").forward(request, response);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("errMsg", e.getMessage());
		}
		
		request.getRequestDispatcher("/error/error.jsp").forward(request, response);				
		
	}
	
	private String checkValue(String str) {
		if(str==null || str.equals("null") || str.equals("")) {
			return "";
		} else {
			return str;
		}
	}

}
