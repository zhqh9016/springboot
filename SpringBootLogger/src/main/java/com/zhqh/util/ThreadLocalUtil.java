package com.zhqh.util;

public class ThreadLocalUtil {
	
	private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
	
	public static ThreadLocal<String> getInstance(){
		 return threadLocal;
	}

}
