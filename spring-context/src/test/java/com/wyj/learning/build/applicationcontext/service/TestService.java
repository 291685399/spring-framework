package com.wyj.learning.build.applicationcontext.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wyj
 * @create 2019-09-14 14:10
 */
@Component
public class TestService {

	@Autowired
	private HaService haService;

	public String sout() {
		return "AnnotationConfigApplicationContext容器";
	}

}
