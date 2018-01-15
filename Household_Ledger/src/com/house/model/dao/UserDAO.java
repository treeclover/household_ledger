package com.house.model.dao;

import java.sql.SQLException;

import com.house.model.dto.UserDTO;


public interface UserDAO {
	UserDTO loginCheck(UserDTO userDTO) throws SQLException;
}
