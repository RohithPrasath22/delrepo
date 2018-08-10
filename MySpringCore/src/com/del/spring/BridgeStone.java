package com.del.spring;

public class BridgeStone implements Wheel {

	@Override
	public void rotate() {
		System.out.println("wheel(bridgestone) rotates...");

	}
	public void init() {
		System.out.println("init called");
	}
	public void destroy() {
		System.out.println("destroy called");
	}

}
