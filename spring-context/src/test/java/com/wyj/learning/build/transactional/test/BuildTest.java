package com.wyj.learning.build.transactional.test;

import com.wyj.learning.build.transactional.config.AppConfig;
import com.wyj.learning.build.transactional.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wanyingjing
 * @Create 2020/2/21 2:02 PM
 */
public class BuildTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = applicationContext.getBean(UserService.class);
		Integer userId = 3;
		String userName = "wangwu";
		userService.execute(userId, userName);
	}

}
