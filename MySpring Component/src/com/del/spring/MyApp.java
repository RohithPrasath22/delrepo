package com.del.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("comp.xml");
		CompBean comp = (CompBean) ctx.getBean("compbean");
		System.out.println(comp.getMessage());
		

	}

}
