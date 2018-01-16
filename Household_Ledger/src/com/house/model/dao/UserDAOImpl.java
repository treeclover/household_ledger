package com.house.model.dao;
// db에 담을 정보들을 UserDTO에서 가져와서 DB에 등록하는 작업
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.house.model.dto.UserDTO;
import com.house.util.DbUtil;

public class UserDAOImpl implements UserDAO {
	private ResourceBundle resourceBundle = DbUtil.getResourceBundle();   // db열기 

	@Override
	public UserDTO loginCheck(UserDTO userDTO) throws SQLException {    //  로그인 기능
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		UserDTO dbUserDTO=null;
		
		try {
			conn= DbUtil.getConnection();
			pstmt=conn.prepareStatement(resourceBundle.getString("query.userlogin"));
			pstmt.setString(1, userDTO.getUserId());
			pstmt.setString(2, userDTO.getUserPwd());
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dbUserDTO= new UserDTO(rs.getString(1), rs.getString(2));
			}
		}finally {
			DbUtil.dbClose(conn, pstmt, rs);
		}
		
		return dbUserDTO;
	}
	
	@Override
	public int memberInsert(UserDTO userDTO)throws SQLException {  // 회원 삽입 
		Connection conn=null;
		PreparedStatement pstmt=null;
		int result =0;

		try{
			conn = DbUtil.getConnection();   // db에서 얻어온것들을 부르기 위한 연결 
			pstmt=conn.prepareStatement(resourceBundle.getString("query.userinsert")); // ?를 이제 받아와서 set 시키기  (getId getPwd 다 해줬으니까 ) 
			pstmt.setString(1, userDTO.getUserId());
			pstmt.setString(2, userDTO.getUserPwd());
			pstmt.setString(3, userDTO.getName());
			pstmt.setString(4, userDTO.getBirthDate());
			pstmt.setString(5, userDTO.getEmailAddr());
			pstmt.setString(6, userDTO.getDiv());
			result= pstmt.executeUpdate();
		   }
		
		finally{  // DbUtil
			DbUtil.dbClose(conn, pstmt);
		}
		
		return 1;
	}
	
	@Override
	public boolean memberbyIdCheck(String userId)throws SQLException {  // 아이디 맞는지 확인 
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn = DbUtil.getConnection();
			pstmt=conn.prepareStatement(resourceBundle.getString("query.userselect"));
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
			   return true;
			}
			
		}finally {
			DbUtil.dbClose(conn, pstmt, rs);
		}
		
		return false;
	}
	
	@Override
	public int memberDelete(String userId)throws SQLException {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int result=0;
		try {
			conn = DbUtil.getConnection();
			pstmt=conn.prepareStatement(resourceBundle.getString("query.userdelete")); 
			pstmt.setString(1, userId);
			result= pstmt.executeUpdate();
		}finally {
			DbUtil.dbClose(conn, pstmt);
		}
		return 1;
	}

	
}
