package com.sunseng.pushserver.fcm.service;

import com.sunseng.pushserver.fcm.model.FCMResponseModel;
import com.sunseng.pushserver.fcm.model.PushModel;

/**
 * FCM Service Interface
 * @author sjpaik
 */
public interface FCMService {

	/**
	 * 푸시 보내기
	 * @param pushModel PushModel
	 * @param apikey String
	 * @return FCMResponseModel
	 */
	public FCMResponseModel sendPush(PushModel pushModel, String apikey);
	
}
