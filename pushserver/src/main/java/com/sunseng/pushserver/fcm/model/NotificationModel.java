package com.sunseng.pushserver.fcm.model;

import java.io.Serializable;

/**
 * Notification Model
 * @author sjpaik
 */
public class NotificationModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// 제목
	private String title;
	// 본문
	private String body;
	// 알림음
	private String sound;
	// 배지(IOS)
	private String badge;
	// 알림 아이콘(Android)
	private String icon;
	
	public NotificationModel() {}
	
	public NotificationModel(String title, String body, String sound, String badge, String icon) {
		this.title = title;
		this.body = body;
		this.sound = sound;
		this.badge = badge;
		this.icon = icon;
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

}
