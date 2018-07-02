package com.sunseng.pushserver.push.service;

import java.util.List;

import com.sunseng.pushserver.push.model.PushSendDetailModel;

/**
 * Push Service Interface
 * @author sjpaik
 */
public interface PushService {
	
	/**
	 * 푸시 발송 리스트 조회
	 * @return List<PushSendDetailModel>
	 */
	public List<PushSendDetailModel> selectSendPushList();

}
