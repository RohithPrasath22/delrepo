package com.del.spring;

public class MySingleton {

	private static MySingleton ms;

	private MySingleton() {
		super();
		if (ms == null)
			ms = new MySingleton();
	}

	public static MySingleton getInstance() {
		return ms;
	}

}
