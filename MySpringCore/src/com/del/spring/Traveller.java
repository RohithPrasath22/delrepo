package com.del.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Traveller {

	public static void main(String[] args) {
		/*ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("travel.xml");*/
		//BeanFactory ctx = new XmlBeanFactory(new ClassPathResource("travel.xml"));
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("travel.xml");
		
		Vehicle v = (Vehicle) ctx.getBean("vehicle");
		v.move();
		ctx.registerShutdownHook();
		
	}

}
