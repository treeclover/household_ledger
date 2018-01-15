package com.house.model.dto;

public class BoardDTO {
	private String idx;
	private String userId;
	private String title;
	private String content;
	private int viewCount;
	private String fileName;
	private String writeTime;
	
	
	
	public BoardDTO() { }
	
	public BoardDTO(String idx, String userId, String title, String content, int viewCount, String fileName,
			String writeTime) {
		super();
		this.idx = idx;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.viewCount = viewCount;
		this.fileName = fileName;
		this.writeTime = writeTime;
	}
	public BoardDTO(String idx, String userId, String title, String content, int viewCount, String fileName) {
		super();
		this.idx = idx;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.viewCount = viewCount;
		this.fileName = fileName;
	}
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getWriteTime() {
		return writeTime;
	}
	public void setWriteTime(String writeTime) {
		this.writeTime = writeTime;
	}
	
	
}
