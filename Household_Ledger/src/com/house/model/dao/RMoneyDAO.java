package com.house.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.house.model.dto.RMoneyDTO;

public interface RMoneyDAO {

	List<RMoneyDTO> selectAll(String userId) throws SQLException;
	
	
	
}
