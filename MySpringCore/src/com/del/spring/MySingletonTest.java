package com.del.spring;

public class MySingletonTest {

	public static void main(String[] args) {
		MySingleton ms1 = MySingleton.getInstance();
		MySingleton ms2 = MySingleton.getInstance();
		System.out.println(ms1==ms2);
	}

}
