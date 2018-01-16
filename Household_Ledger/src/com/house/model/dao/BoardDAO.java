package com.house.model.dao;

import java.sql.SQLException;
import java.util.List;

import com.house.model.dto.BoardDTO;

public interface BoardDAO {
	int insert(BoardDTO	bdto) throws SQLException;
	
	List<BoardDTO> selectAll() throws SQLException;
	
	int updateByReadNum(int idx)throws SQLException;
}
