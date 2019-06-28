package com.example.java8.lambda;

@FunctionalInterface
public interface Operation {
	
	/*This is a funtional interface because 
	only can have one method */
	
	double calculate(double v1, double v2);

}
