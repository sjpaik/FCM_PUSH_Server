package com.sunseng.pushserver.fcm.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FCM Result Model
 * @author sjpaik
 */
public class FCMResultModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// Success Message ID
	@JsonProperty("message_id")
	private String messageId;
	
	// 갱신이 필요한 Registration Id
	@JsonProperty("registration_id")
	private String registrationId;
	
	// Error Message
	@JsonProperty("error")
	private String error;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
}
