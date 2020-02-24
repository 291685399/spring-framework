package com.wyj.learning.build.applicationcontext.test;

import com.wyj.learning.build.applicationcontext.config.AppConfig;
import com.wyj.learning.build.applicationcontext.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wyj
 * @create 2019-09-14 14:06
 */
public class BuildTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TestService testService = (TestService) applicationContext.getBean("testService");
		System.out.println(testService.sout());
	}
}