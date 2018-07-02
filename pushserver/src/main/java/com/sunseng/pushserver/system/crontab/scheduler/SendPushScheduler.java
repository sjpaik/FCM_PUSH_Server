package com.sunseng.pushserver.system.crontab.scheduler;

import org.springframework.beans.factory.annotation.Autowired;

import com.sunseng.pushserver.push.service.PushService;

public class SendPushScheduler {
	
	@Autowired
	private PushService pushService;

}
