package com.house.model.service;

import java.sql.SQLException;
import java.util.List;

import com.house.model.dao.RMoneyDAO;
import com.house.model.dao.RMoneyDAOImpl;
import com.house.model.dto.RMoneyDTO;

public class RMoneyService {
	private static RMoneyDAO dao = new RMoneyDAOImpl();
	
	public static List<RMoneyDTO> selectAll(String userId) throws SQLException {
		List<RMoneyDTO> list = dao.selectAll(userId);
		
		if(list == null) {
			throw new SQLException("값을 찾지 못하였습니다.");
		}
		
		return list;
	}
}
