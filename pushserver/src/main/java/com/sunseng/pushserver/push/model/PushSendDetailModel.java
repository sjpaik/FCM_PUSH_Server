package com.sunseng.pushserver.push.model;

import java.io.Serializable;

/**
 * Push Send Detail Model
 * @author sjpaik
 */
public class PushSendDetailModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// 일련번호
	private int no;
	// 토큰
	private String token;
	// 발송일련번호
	private int masterNo;
	// 상태
	private String status;
	// 등록일시
	private String regDatetime;
	// 제목
	private String title;
	// 본문
	private String body;
	// 알림음
	private String sound;
	// 배지
	private String badge;
	// 알림아이콘
	private String icon;
	// API키
	private String apiKey;
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public int getMasterNo() {
		return masterNo;
	}
	
	public void setMasterNo(int masterNo) {
		this.masterNo = masterNo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getRegDatetime() {
		return regDatetime;
	}
	
	public void setRegDatetime(String regDatetime) {
		this.regDatetime = regDatetime;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public String getSound() {
		return sound;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String getBadge() {
		return badge;
	}
	
	public void setBadge(String badge) {
		this.badge = badge;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public String getApiKey() {
		return apiKey;
	}
	
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

}
