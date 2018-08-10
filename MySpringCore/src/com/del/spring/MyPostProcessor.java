package com.del.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String name) throws BeansException {
		System.out.println("....after intit"+"  , "+obj+"  , "+name);
		if(obj instanceof Vehicle) {
			Vehicle v = (Vehicle) obj;
			v.setTyre(5);
		}
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String name) throws BeansException {
		System.out.println(".....before init"+"  , "+obj+"  , "+name);
		return obj;
	}

}
