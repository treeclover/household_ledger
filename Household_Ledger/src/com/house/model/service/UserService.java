package com.house.model.service;

import java.sql.SQLException;

import com.house.model.dto.UserDTO;


public interface UserService {
	UserDTO loginCheck(UserDTO userDTO)throws SQLException;
}
