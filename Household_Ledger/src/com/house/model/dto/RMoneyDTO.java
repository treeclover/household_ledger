package com.house.model.dto;

public class RMoneyDTO {
	private String userId;
	private String ownKind;
	private String ownType;
	int ownMoney;
	
	public RMoneyDTO() { }
	
	public RMoneyDTO(String userId, String ownKind, String ownType) {
		super();
		this.userId = userId;
		this.ownKind = ownKind;
		this.ownType = ownType;
	}
	
	public RMoneyDTO(String userId, String ownKind, String ownType, int ownMoney) {
		super();
		this.userId = userId;
		this.ownKind = ownKind;
		this.ownType = ownType;
		this.ownMoney = ownMoney;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOwnKind() {
		return ownKind;
	}
	public void setOwnKind(String ownKind) {
		this.ownKind = ownKind;
	}
	public String getOwnType() {
		return ownType;
	}
	public void setOwnType(String ownType) {
		this.ownType = ownType;
	}
	public int getOwnMoney() {
		return ownMoney;
	}
	public void setOwnMoney(int ownMoney) {
		this.ownMoney = ownMoney;
	}
}
