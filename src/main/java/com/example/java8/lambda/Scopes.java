package com.example.java8.lambda;

public class Scopes {

	public double testLocalVariable() {
		double num = 3;
		Operation op = new Operation() {
			@Override
			public double calculate(double v1, double v2) {
				return num + v1 + v2;
			}
		};
		return op.calculate(10, 12);
	}

}
