package com.house.model.service;

import java.sql.SQLException;
import java.util.List;

import com.house.model.dao.BoardDAOImpl;
import com.house.model.dto.BoardDTO;

public class BoardService {

	static BoardDAOImpl bdaoi = new BoardDAOImpl();

	public static int insert(BoardDTO bdto) throws SQLException {
		int result = bdaoi.insert(bdto);
		if (result == 0)
			throw new SQLException("등록되지 않았습니다.");
		return result;
	}

	public static int delete(int idx) throws SQLException {
		// 비밀번호 검증
		// BoardDTO bdto = new BoardDTO();

		int result = bdaoi.delete(idx);
		if (result == 0)
			throw new SQLException("게시물이 삭제되지 않았습니다.");
		return result;
	}

	public static List<BoardDTO> selectAll() throws SQLException {
		return bdaoi.selectAll();
	}
	
	public static BoardDTO selectByViewCount(int idx, boolean flag) throws SQLException{
		 
		if(flag) {
		  int result = bdaoi.updateByReadNum(idx);
		  if(result==0)new SQLException("게시물 조회수 증가하는데 오류가 발생했습니다.");
		 }
		 
		  BoardDTO bt = bdaoi.selectByIdx(idx);
		  if(bdaoi==null) 
			  new SQLException(idx+"게시물은 존재하지 않습니다.");
		  return bt;
	  }

	public static int update(BoardDTO bdto) throws SQLException{
		BoardDTO bDto= bdaoi.selectByIdx(bdto.getIdx());
		  if(!bDto.getUserId().equals(bdaoi.update(bDto))) {
			  throw new SQLException("내용을 다시 확인 해주세요.");
		  }
		  int result = bdaoi.update(bdto);
		  if(result==0)throw new SQLException("게시물이 수정되지 않았습니다.");
		  return result;
	  }
}
