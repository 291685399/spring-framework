package com.wyj.learning.build.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wyj.learning.build.aop")
@EnableAspectJAutoProxy
public class AppConfig {
}
