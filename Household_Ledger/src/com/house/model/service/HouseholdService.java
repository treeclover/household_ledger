package com.house.model.service;

import java.sql.SQLException;
import java.util.List;

import com.house.model.dao.HouseholdDAO;
import com.house.model.dao.HouseholdDAOImpl;
import com.house.model.dto.HouseholdDTO;

public class HouseholdService {
	private static HouseholdDAO dao = new HouseholdDAOImpl();
	
	public static List<HouseholdDTO> selectAll(String userId) throws SQLException {
		List<HouseholdDTO> list = dao.selectAll(userId);

		if(list == null) {
			throw new SQLException("값을 찾지 못하였습니다.");
		}
		
		return list;
	}
	
	public static List<HouseholdDTO> selectHouseType(String userId, String ownType) throws SQLException {
		List<HouseholdDTO> list = dao.selectHouseType(userId, ownType);
		
		if(list == null) {
			throw new SQLException("값을 찾지 못하였습니다.");
		}
		
		return list;
	}
	
	public static List<HouseholdDTO> selectHouseKind(String userId, String ownKind) throws SQLException {
		List<HouseholdDTO> list = dao.selectHouseKind(userId, ownKind);
		
		if(list == null) {
			throw new SQLException("값을 찾지 못하였습니다.");
		}
		
		return list;		
	}
	
	public static List<HouseholdDTO> selectHouseRecord(String userId, String record) throws SQLException {
		List<HouseholdDTO> list = dao.selectHouseRecord(userId, record);
		
		if(list == null) {
			throw new SQLException("값을 찾지 못하였습니다.");
		}
		
		return list;
		
	}
	
	public static List<HouseholdDTO> selectHouseTypeAndRecord(String userId, String ownType, String record) throws SQLException {
		List<HouseholdDTO> list = dao.selectHouseTypeAndRecord(userId, ownType, record);
		
		if(list == null) {
			throw new SQLException("값을 찾지 못하였습니다.");
		}
		
		return list;		
	}
	
	public static List<HouseholdDTO> selectHouseKindAndRecord(String userId, String ownKind, String record) throws SQLException {
		List<HouseholdDTO> list = dao.selectHouseKindAndRecord(userId, ownKind, record);
		
		if(list == null) {
			throw new SQLException("값을 찾지 못하였습니다.");
		}
		
		return list;		
	}

	public static List<HouseholdDTO> selectThree(String userId) throws SQLException {
		List<HouseholdDTO> list = dao.selectThree(userId);
		
		if(list == null) {
			throw new SQLException("값을 찾지 못하였습니다.");
		}
		
		return list;
	}
	
	
	
	
	
}
