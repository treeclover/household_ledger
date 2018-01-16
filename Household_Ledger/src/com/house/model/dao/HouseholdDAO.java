package com.house.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.house.model.dto.HouseholdDTO;

public interface HouseholdDAO {
	
	public List<HouseholdDTO> selectHouseType(String userId, String ownType) throws SQLException;
	
	public List<HouseholdDTO> selectHouseKind(String userId, String ownKind) throws SQLException;
	
	public List<HouseholdDTO> selectHouseRecord(String userId, String record) throws SQLException;
	
	public List<HouseholdDTO> selectHouseTypeAndRecord(String userId, String ownType, String record) throws SQLException;
	
	public List<HouseholdDTO> selectHouseKindAndRecord(String userId, String ownKind, String record) throws SQLException;

	public List<HouseholdDTO> selectAll(String userId) throws SQLException;

	public List<HouseholdDTO> selectThree(String userId) throws SQLException;
	
}
