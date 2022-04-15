package com.springboot.springbootappln.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.*;


@Aspect
public class AspectConfig {
	
	//Logging
	private Logger log = LoggerFactory.getLogger(AspectConfig.class);
	
	@Before("execution(* com.springboot.springbootappln.controller.*.*(..))")
	public void logStmtBefore(JoinPoint joinPoint) {
		log.info("executing ()", joinPoint);
	}

}
