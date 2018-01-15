package com.house.model.dto;

public class ReplyDTO {
	private int idx;
	private int replyIndex;
	private String userId;
	private String content;
	private String writeTime;
	
		
	public ReplyDTO() {	}
	
	public ReplyDTO(int idx, int replyIndex, String userId, String content, String writeTime) {
		super();
		this.idx = idx;
		this.replyIndex = replyIndex;
		this.userId = userId;
		this.content = content;
		this.writeTime = writeTime;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getReplyIndex() {
		return replyIndex;
	}
	public void setReplyIndex(int replyIndex) {
		this.replyIndex = replyIndex;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteTime() {
		return writeTime;
	}
	public void setWriteTime(String writeTime) {
		this.writeTime = writeTime;
	}
	
	
}
