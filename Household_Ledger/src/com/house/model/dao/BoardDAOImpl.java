package com.house.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.house.model.dto.BoardDTO;
import com.house.util.DbUtil;

public class BoardDAOImpl implements BoardDAO {

	private ResourceBundle resourceBundle = DbUtil.getResourceBundle();

	@Override
	public int insert(BoardDTO bdto) throws SQLException {
		Connection con = DbUtil.getConnection();
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = con.prepareStatement(resourceBundle.getString("query.insertBoard"));
			ps.setString(1, bdto.getUserId());
			ps.setString(2, bdto.getTitle());
			ps.setString(3, bdto.getContent());
			ps.setString(4, bdto.getFileName());

			result = ps.executeUpdate();
		} finally {
			DbUtil.dbClose(con, ps);
		}
		return result;
	}

	public int delete(int idx) throws SQLException {
		Connection con = DbUtil.getConnection();
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = con.prepareStatement(resourceBundle.getString("query.deleteBoard"));
			ps.setInt(1, idx);

			result = ps.executeUpdate();
		} finally {
			DbUtil.dbClose(con, ps);
		}
		return result;
	}

	@Override
	public List<BoardDTO> selectAll() throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardDTO> list = new ArrayList<>();
		try {
			conn = DbUtil.getConnection();
			pstmt = conn.prepareStatement(resourceBundle.getString("query.selectBoard"));
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDTO bdto = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getString(6), rs.getString(7));
				System.out.println(bdto.getIdx());
				list.add(bdto);

			}
		} finally {
			DbUtil.dbClose(conn, pstmt, rs);
		}
		return list;
	}

	public BoardDTO selectByIdx(int idx) throws SQLException {
		Connection con = DbUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		BoardDTO bt = null;
		try {
			ps = con.prepareStatement(resourceBundle.getString("query.selectBoardByidx"));
			ps.setInt(1, idx);
			rs = ps.executeQuery();
			if (rs.next()) {
				bt = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6), rs.getString(7));
			}
		} finally {
			DbUtil.dbClose(con, ps, rs);
		}
		return bt;
	}

	@Override
	public int updateByReadNum(int viewCount) throws SQLException {
		Connection con =DbUtil.getConnection();
		PreparedStatement ps =null;
		int result =0;
		try{
			ps = con.prepareStatement(resourceBundle.getString("query.updateBoardByReadnum"));
			ps.setInt(1, viewCount);
			result = ps.executeUpdate();
		}finally{
			DbUtil.dbClose(con, ps);
		}
		return result;
	}

	public int update(BoardDTO bdto) throws SQLException {
		Connection con =DbUtil.getConnection();
		PreparedStatement ps =null;
		int result =0;
		try{
			ps = con.prepareStatement(resourceBundle.getString("query.updateBoard"));
			
			ps.setString(1, bdto.getUserId());
			ps.setString(2, bdto.getTitle());
			ps.setString(3, bdto.getContent());
			ps.setInt(4, bdto.getIdx());
						
			result = ps.executeUpdate();
		}finally{
			DbUtil.dbClose(con, ps);
		}
		return result;
	}
}