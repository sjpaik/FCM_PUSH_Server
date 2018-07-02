package com.sunseng.pushserver.fcm.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FCM Response Model 
 * @author sjpaik
 */
public class FCMResponseModel implements Serializable {

	private static final long serialVersionUID = 1L;

	// Multicast Message ID
	@JsonProperty("multicast_id")
	private Long multicastId;
	
	// Success Message Count
	@JsonProperty("success")
	private int success;
	
	// Error Message Count
	@JsonProperty("failure")
	private int failure;
	
	// Canonical ID Count
	@JsonProperty("canonical_ids")
	private int canonicalIds;
	
	// Message Status List
	@JsonProperty("result")
	private List<FCMResultModel> result;

	public Long getMulticastId() {
		return multicastId;
	}

	public void setMulticastId(Long multicastId) {
		this.multicastId = multicastId;
	}

	public int getSuccess() {
		return success;
	}

	public void setSuccess(int success) {
		this.success = success;
	}

	public int getFailure() {
		return failure;
	}

	public void setFailure(int failure) {
		this.failure = failure;
	}

	public int getCanonicalIds() {
		return canonicalIds;
	}

	public void setCanonicalIds(int canonicalIds) {
		this.canonicalIds = canonicalIds;
	}

	public List<FCMResultModel> getResult() {
		return result;
	}

	public void setResult(List<FCMResultModel> result) {
		this.result = result;
	}
	
}
