package com.sunseng.pushserver.fcm.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sunseng.pushserver.fcm.model.FCMResponseModel;
import com.sunseng.pushserver.fcm.model.PushModel;

/**
 * FCM Service Impl
 * @author sjpaik
 */
@Service
public class FCMServiceImpl implements FCMService {

	private static final String FCM_URL = "https://fcm.googleapis.com/fcm/send";
	
	@Override
	public FCMResponseModel sendPush(PushModel pushModel, String apikey) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "key=" + apikey);
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<PushModel> requestEntity = new HttpEntity<PushModel>(pushModel, headers);
		
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.postForObject(FCM_URL, requestEntity, FCMResponseModel.class);
	}
	
}
