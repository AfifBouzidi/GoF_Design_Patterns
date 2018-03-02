package com.abouzidi.gof;

public class Singleton {

	private static Singleton instance;

	static {
		try {
			instance = new Singleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occurred in creating singleton instance");
		}
	}

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}
}
