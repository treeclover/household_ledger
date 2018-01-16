package com.house.model.service;

import java.sql.SQLException;

import com.house.model.dao.UserDAO;
import com.house.model.dao.UserDAOImpl;
import com.house.model.dto.UserDTO;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO = new UserDAOImpl();

	@Override
	public UserDTO loginCheck(UserDTO userDTO) throws SQLException {    // 로그인 잘 됐는지 체크만 
		UserDTO dbUserDTO = userDAO.loginCheck(userDTO);
		if(dbUserDTO==null) {
			throw new SQLException("정보를 다시 확인해주세요.");
			}
		return dbUserDTO;
		}
	
	@Override
	public int memberInsert(UserDTO userDTO) throws SQLException {        	//id체크를 한다.
		boolean result = userDAO.memberbyIdCheck(userDTO.getUserId());
		if(result)throw new SQLException(userDTO.getUserId()+" 는 중복입니다.");//서블릿의 catch이동
		
		int re = userDAO.memberInsert(userDTO);
		if(re==0) throw new SQLException("등록되지 않았습니다.");
		return re;
		}
	
	@Override
	public int memberDelete(String userId) throws SQLException {
		int re = userDAO.memberDelete(userId);
		if(re==0) throw new SQLException("삭제되지 않았습니다.");//servlet의 catch이동
		return re;
	}
	
}
