package com.house.model.service;

import java.sql.SQLException;

import com.house.model.dto.UserDTO;


public interface UserService {
	UserDTO loginCheck(UserDTO userDTO)throws SQLException; // 
	
	/**
	 *    회원가입
	 *   : 가입하기 전에 id중복체크한다.
	 * 
      *  @return : 0 이면 실패, 1이상이면 성공
	 * */
	public int memberInsert(UserDTO userDTO) throws SQLException;
	 
	public int memberDelete(String userId) throws SQLException;
	
	
}
