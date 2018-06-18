package com.zhqh.logger.converter;


import com.zhqh.util.ThreadLocalUtil;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class MyConverter extends ClassicConverter {

	@Override
	public String convert(ILoggingEvent arg0) {
		
		String string = ThreadLocalUtil.getInstance().get();
		System.out.println("myConverter starter");
		System.out.println(string);
		System.out.println("myConverter end");
		return string;
	}

}
