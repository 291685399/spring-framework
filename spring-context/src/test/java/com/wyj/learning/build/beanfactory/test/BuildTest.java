package com.wyj.learning.build.beanfactory.test;

import com.wyj.learning.build.beanfactory.bean.TestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author wyj
 * @create 2019-09-01 9:26
 */
public class BuildTest {

	@Test
	public void test(){
		System.out.println("Hello Spring");
	}

	@Test
	public void testBean(){
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
		TestBean testBean=(TestBean) beanFactory.getBean("testBean");
		System.out.println(testBean.getStr());
	}

}
