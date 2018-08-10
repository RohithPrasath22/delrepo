package com.del.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		TextEditor te = (TextEditor) ctx.getBean("texteditor");
		te.spellCheck();
		System.out.println();
	}
}
