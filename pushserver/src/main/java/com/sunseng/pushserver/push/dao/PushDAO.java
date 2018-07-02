package com.sunseng.pushserver.push.dao;

import java.util.List;

import com.sunseng.pushserver.push.model.PushSendDetailModel;

/**
 * Push DAO Interface
 * @author sjpaik
 */
public interface PushDAO {
	
	/**
	 * 푸시 발송 리스트 조회 (최대 1000건)
	 * @return List<PushSendDetailModel>
	 */
	public List<PushSendDetailModel> selectSendPushList();
	
}
