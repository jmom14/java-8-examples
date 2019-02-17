package com.example.java8.lambda;

public interface IDefault {
	
	public void run();
	
	default public void talk() {
		System.out.println("Gretings y'all");
	}

}
