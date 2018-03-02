package com.abouzidi.gof;

public class BasicCalculus {

	public float add(float a, float b) {
		return a + b;
	}

	public float sub(float a, float b) {
		return a - b;
	}

	public float mult(float a, float b) {
		return a * b;
	}

	public float div(float a, float b) {
		if (b == 0) {
			throw new IllegalArgumentException("Division by zero");
		}
		return a / b;
	}

}
