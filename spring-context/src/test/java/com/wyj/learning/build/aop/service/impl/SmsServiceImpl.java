package com.wyj.learning.build.aop.service.impl;

import com.wyj.learning.build.aop.service.SmsService;
import org.springframework.stereotype.Service;

@Service("smsService")
public class SmsServiceImpl implements SmsService {

	@Override
	public String sendMessage(String message) {
		try {
			System.out.println(String.format("短信发送成功，短信发送的内容为 '%s'", message));
		} catch (Exception e) {
			return "失败";
		}
		return "成功";
	}

}
