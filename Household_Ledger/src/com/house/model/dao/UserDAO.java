package com.house.model.dao;

import java.sql.SQLException;

import com.house.model.dto.UserDTO;


public interface UserDAO {
	UserDTO loginCheck(UserDTO userDTO) throws SQLException;
	
	/**
	 *  2. 회원가입
	 *  insert into Users values(?,?,?,?,?,?);
     *  @return : 0 이면 실패, 1이상이면 성공
	 * */
	int memberInsert(UserDTO userDTO) throws SQLException;
	
	/**
	 *  3. ID중복체크
	 *  select id from Users where user_id=?
	 *  @return : true이면 중복, false이면 사용가능
	 * */
	public boolean memberbyIdCheck(String user_id)throws SQLException ;
	
	/**
	 *  4. 회원 삭제
	 *   delete from Users where user_pwd=?
	 *   @return : 0 이면 실패, 1이상이면 성공
	 * */
 	 int memberDelete(String userId)throws SQLException;
	 
	 
	
}
