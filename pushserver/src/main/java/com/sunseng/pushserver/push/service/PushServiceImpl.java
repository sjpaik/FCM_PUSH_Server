package com.sunseng.pushserver.push.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sunseng.pushserver.push.model.PushSendDetailModel;

/**
 * Push Service Impl
 * @author sjpaik
 */
@Service
public class PushServiceImpl implements PushService {
	
	@Override
	public List<PushSendDetailModel> selectSendPushList() {
		return null;
	}

}
