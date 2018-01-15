package com.house.model.dto;

public class UserDTO {
	private String userId;
	private String userPwd;
	private String name;
	private String birthDate;
	private String emailAddr;
	private String div;
		
	public UserDTO() { }

	public UserDTO(String userId, String userPwd, String name, String birthDate, String emailAddr) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.birthDate = birthDate;
		this.emailAddr = emailAddr;
	}
	
	public UserDTO(String userId, String userPwd, String name, String birthDate, String emailAddr, String div) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.birthDate = birthDate;
		this.emailAddr = emailAddr;
		this.div = div;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	
	
}
