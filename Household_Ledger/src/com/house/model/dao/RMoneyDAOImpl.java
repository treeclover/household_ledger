package com.house.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.house.model.dto.HouseholdDTO;
import com.house.model.dto.RMoneyDTO;
import com.house.util.DbUtil;

public class RMoneyDAOImpl implements RMoneyDAO {
	private ResourceBundle rb = DbUtil.getResourceBundle();

	@Override
	public List<RMoneyDTO> selectAll(String userId) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<RMoneyDTO> list = null;
		
		try {
			conn = DbUtil.getConnection();
			pstmt = conn.prepareStatement(rb.getString("query.selectM"));
			pstmt.setString(1, userId);
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<>();
			
			while(rs.next()) {
				String user_id = rs.getString(1);
				String own_kind = rs.getString(2);
				String own_type = rs.getString(3);
				int own_money = rs.getInt(4);
				list.add(new RMoneyDTO(user_id, own_kind, own_type, own_money));
			}			
		} finally {
			DbUtil.dbClose(conn, pstmt, rs);
		}
		
		return list;
	}

}
