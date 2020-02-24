package com.wyj.learning.build.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component("smsLogAspectJ")
public class SmsLogAspectJ {

	@Pointcut("execution(* com.wyj.learning.build.aop.service.impl.SmsServiceImpl.*(..))")
	public void pointCut() {
	}

	/**
	 * 前置通知
	 *
	 * @param joinPoint
	 */
	@Before(value = "pointCut()")
	public void smsBefore(JoinPoint joinPoint) {
		System.out.println("短信发送前置通知");
	}

	/**
	 * 后置通知
	 *
	 * @param joinPoint
	 */
	@After(value = "pointCut()")
	public void smsAfter(JoinPoint joinPoint) {
		System.out.println("短信发送后置通知");
	}

	/**
	 * 最终通知
	 *
	 * @param joinPoint
	 * @param result
	 */
	@AfterReturning(value = "pointCut()", returning = "result")
	public void smsAfterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("短信发送最终通知");
	}

	/**
	 * 异常通知
	 *
	 * @param joinPoint
	 */
	@AfterThrowing(value = "pointCut()")
	public void smsAfterThrowing(JoinPoint joinPoint) {
		System.out.println("短信发送异常通知");
	}
}
