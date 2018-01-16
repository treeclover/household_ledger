package com.house.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.house.model.dto.HouseholdDTO;
import com.house.util.DbUtil;

public class HouseholdDAOImpl implements HouseholdDAO {
	private static ResourceBundle rb = DbUtil.getResourceBundle();

	@Override
	public List<HouseholdDTO> selectAll(String userId) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<HouseholdDTO> list = null;
		
		try {
			conn = DbUtil.getConnection();
			pstmt = conn.prepareStatement(rb.getString("query.select"));
			pstmt.setString(1, userId);
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<>();
			
			while(rs.next()) {
				String user_id = rs.getString(1);
				String own_type = rs.getString(2);
				String rec = rs.getString(3);
				int price = rs.getInt(4);
				int ownMoney = rs.getInt(5);
				String use = rs.getString(6);
				String useTime = rs.getString(7);
				list.add(new HouseholdDTO(user_id, own_type, rec, price, ownMoney, use, useTime));
			}			
		} finally {
			DbUtil.dbClose(conn, pstmt, rs);
		}
		
		return list;
	}
	
	@Override
	public List<HouseholdDTO> selectHouseType(String userId, String ownType) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<HouseholdDTO> list = null;
		
		try {
			conn = DbUtil.getConnection();
			pstmt = conn.prepareStatement(rb.getString("query.selectType"));
			pstmt.setString(1, userId);
			pstmt.setString(2, ownType);
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<>();
			
			while(rs.next()) {
				String user_id = rs.getString(1);
				String own_type = rs.getString(2);
				String rec = rs.getString(3);
				int price = rs.getInt(4);
				int ownMoney = rs.getInt(5);
				String use = rs.getString(6);
				String useTime = rs.getString(7);
				list.add(new HouseholdDTO(user_id, own_type, rec, price, ownMoney, use, useTime));
			}			
		} finally {
			DbUtil.dbClose(conn, pstmt, rs);
		}
		
		return list;
	}

	@Override
	public List<HouseholdDTO> selectHouseKind(String userId, String ownKind) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<HouseholdDTO> list = null;
		
		try {
			conn = DbUtil.getConnection();
			pstmt = conn.prepareStatement(rb.getString("query.selectKind"));
			pstmt.setString(1, userId);
			pstmt.setString(2, ownKind);
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<>();
			
			while(rs.next()) {
				String user_id = rs.getString(1);
				String own_type = rs.getString(2);
				String rec = rs.getString(3);
				int price = rs.getInt(4);
				int ownMoney = rs.getInt(5);
				String use = rs.getString(6);
				String useTime = rs.getString(7);
				list.add(new HouseholdDTO(user_id, own_type, rec, price, ownMoney, use, useTime));
			}			
		} finally {
			DbUtil.dbClose(conn, pstmt, rs);
		}
		
		return list;
	}

	@Override
	public List<HouseholdDTO> selectHouseRecord(String userId, String record) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<HouseholdDTO> list = null;
		
		try {
			conn = DbUtil.getConnection();
			pstmt = conn.prepareStatement(rb.getString("query.selectRec"));
			pstmt.setString(1, userId);
			pstmt.setString(2, record);
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<>();
			
			while(rs.next()) {
				String user_id = rs.getString(1);
				String own_type = rs.getString(2);
				String rec = rs.getString(3);
				int price = rs.getInt(4);
				int ownMoney = rs.getInt(5);
				String use = rs.getString(6);
				String useTime = rs.getString(7);
				list.add(new HouseholdDTO(user_id, own_type, rec, price, ownMoney, use, useTime));
			}			
		} finally {
			DbUtil.dbClose(conn, pstmt, rs);
		}
		
		return list;
	}

	@Override
	public List<HouseholdDTO> selectHouseTypeAndRecord(String userId, String ownType, String record) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<HouseholdDTO> list = null;
		
		try {
			conn = DbUtil.getConnection();
			pstmt = conn.prepareStatement(rb.getString("query.selectTNR"));
			pstmt.setString(1, userId);
			pstmt.setString(2, ownType);
			pstmt.setString(3, record);
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<>();
			
			while(rs.next()) {
				String user_id = rs.getString(1);
				String own_type = rs.getString(2);
				String rec = rs.getString(3);
				int price = rs.getInt(4);
				int ownMoney = rs.getInt(5);
				String use = rs.getString(6);
				String useTime = rs.getString(7);
				list.add(new HouseholdDTO(user_id, own_type, rec, price, ownMoney, use, useTime));
			}			
		} finally {
			DbUtil.dbClose(conn, pstmt, rs);
		}
		
		return list;
	}

	@Override
	public List<HouseholdDTO> selectHouseKindAndRecord(String userId, String ownKind, String record) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<HouseholdDTO> list = null;
		
		try {
			conn = DbUtil.getConnection();
			pstmt = conn.prepareStatement(rb.getString("query.selectKNR"));
			pstmt.setString(1, userId);
			pstmt.setString(2, ownKind);
			pstmt.setString(3, record);
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<>();
			
			while(rs.next()) {
				String user_id = rs.getString(1);
				String own_type = rs.getString(2);
				String rec = rs.getString(3);
				int price = rs.getInt(4);
				int ownMoney = rs.getInt(5);
				String use = rs.getString(6);
				String useTime = rs.getString(7);
				list.add(new HouseholdDTO(user_id, own_type, rec, price, ownMoney, use, useTime));
			}			
		} finally {
			DbUtil.dbClose(conn, pstmt, rs);
		}
		
		return list;
	}

	@Override
	public List<HouseholdDTO> selectThree(String userId) throws SQLException {
		Connection conn = null;
		Connection conn1 = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt1 = null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		List<HouseholdDTO> list = null;
		
		try {
			conn = DbUtil.getConnection();
			pstmt = conn.prepareStatement(rb.getString("query.selectRec3"));
			pstmt.setString(1, userId);
			pstmt.setString(2, "input");
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<>();
			
			while(rs.next()) {
				String user_id = rs.getString(1);
				String own_type = rs.getString(2);
				String rec = rs.getString(3);
				int price = rs.getInt(4);
				int ownMoney = rs.getInt(5);
				String use = rs.getString(6);
				String useTime = rs.getString(7);
				list.add(new HouseholdDTO(user_id, own_type, rec, price, ownMoney, use, useTime));
			}
			
			conn1 = DbUtil.getConnection();
			pstmt1 = conn1.prepareStatement(rb.getString("query.selectRec3"));
			pstmt1.setString(1, userId);
			pstmt1.setString(2, "output");
			
			rs1 = pstmt1.executeQuery();

			while(rs1.next()) {
				String user_id = rs1.getString(1);
				String own_type = rs1.getString(2);
				String rec = rs1.getString(3);
				int price = rs1.getInt(4);
				int ownMoney = rs1.getInt(5);
				String use = rs1.getString(6);
				String useTime = rs1.getString(7);
				list.add(new HouseholdDTO(user_id, own_type, rec, price, ownMoney, use, useTime));
			}
		} finally {
			DbUtil.dbClose(conn, pstmt, rs);
			DbUtil.dbClose(conn1, pstmt1, rs1);
		}
		
		return list;
	}

}
