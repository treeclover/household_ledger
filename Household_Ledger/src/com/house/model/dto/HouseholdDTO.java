package com.house.model.dto;

public class HouseholdDTO {
	private String userId;
	private String ownType;
	private String rec;
	private int price;
	private int ownMoney;
	private String use;
	private String useTime;
	
	
	
	public HouseholdDTO() { }
	
	public HouseholdDTO(String userId, String ownType, String rec, int price, int ownMoney, String use,
			String useTime) {
		super();
		this.userId = userId;
		this.ownType = ownType;
		this.rec = rec;
		this.price = price;
		this.ownMoney = ownMoney;
		this.use = use;
		this.useTime = useTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOwnType() {
		return ownType;
	}
	public void setOwnType(String ownType) {
		this.ownType = ownType;
	}
	public String getRec() {
		return rec;
	}
	public void setRec(String rec) {
		this.rec = rec;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getOwnMoney() {
		return ownMoney;
	}
	public void setOwnMoney(int ownMoney) {
		this.ownMoney = ownMoney;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getUseTime() {
		return useTime;
	}
	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}
	
	
}
