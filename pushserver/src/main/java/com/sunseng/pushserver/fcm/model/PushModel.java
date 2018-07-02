package com.sunseng.pushserver.fcm.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Push Model
 * @author sjpaik
 */
public class PushModel implements Serializable {

	private static final long serialVersionUID = 1L;

	// 수신자
	@JsonProperty("registration_ids")
	private List<String> registrationIds;
	
	// 우선순위 (normal / high)
	private String priority;
	
	// 알림 페이로드
	private NotificationModel notification;
	
	public PushModel() {}
	
	public PushModel(List<String> registrationIds, String priority, NotificationModel notification) {
		this.registrationIds = registrationIds;
		this.priority = priority;
		this.notification = notification;
	}

	public List<String> getRegistrationIds() {
		return registrationIds;
	}

	public void setRegistrationIds(List<String> registrationIds) {
		this.registrationIds = registrationIds;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public NotificationModel getNotification() {
		return notification;
	}

	public void setNotification(NotificationModel notification) {
		this.notification = notification;
	}
	
}
