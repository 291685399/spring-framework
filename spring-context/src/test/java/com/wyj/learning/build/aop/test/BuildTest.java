package com.wyj.learning.build.aop.test;

import com.wyj.learning.build.aop.config.AppConfig;
import com.wyj.learning.build.aop.service.SmsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BuildTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		SmsService smsService = (SmsService) applicationContext.getBean("smsService");
		String message = smsService.sendMessage("Hello World");
		System.out.println(String.format("短信发送结果为 %s", message));
	}

}
