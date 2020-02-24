package com.wyj.learning.build.applicationcontext.config;

import com.wyj.learning.build.applicationcontext.service.HaService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

//@Component
public class MyBeanFactoryPostProcessors implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("testService");
		beanDefinition.setBeanClass(HaService.class);
	}

}
