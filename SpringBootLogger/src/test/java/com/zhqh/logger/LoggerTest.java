package com.zhqh.logger;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
	
	@Test
	public void fun1(){
		Logger logger = LoggerFactory.getLogger(LoggerTest.class);
		logger.info("jdfkjsadk");
	}

	/**
	 * 占位符测试
	 */
	@Test
	public void fun2(){
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.info("今天是{}年{}月{}日",2018,6,18);
	}
}
