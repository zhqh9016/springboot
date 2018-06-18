package com.zhqh.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zhqh.util.ThreadLocalUtil;

public class LogInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion");
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("postHandle");
		ThreadLocalUtil.getInstance().remove();
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		
		String systemCode = arg0.getParameter("systemCode");
		System.out.println("preHandle start");
		System.out.println(systemCode);
		System.out.println("preHandle end");
		ThreadLocal<String> instance = ThreadLocalUtil.getInstance();
		instance.set(systemCode);
		
		return true;
	}

}
