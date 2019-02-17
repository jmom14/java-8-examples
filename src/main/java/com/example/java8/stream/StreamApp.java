package com.example.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
	
	private List<String> list;
	private List<String> nums;
	
	public static void main(String[] args) {
		
		StreamApp app = new StreamApp();
		app.populateList();
		//app.filter();
		//app.sort();
		//app.transform();
		//app.limit();
		System.out.println(app.count());
	}
	
	public void populateList() {
		list = new ArrayList<>();
		list.add("Abecedario");
		list.add("Palabra");
		list.add("Cañon");
		list.add("Metodo");
		list.add("Cabernicola");
		list.add("Computadora");
		
		nums = new ArrayList<>();
		nums.add("1");	
		nums.add("2");
		nums.add("3");
	}
	
	public void filter() {
		list.stream().
			filter(x -> x.startsWith("C"))
				.peek(System.out::println);
	}
	
	public void sort() {
		//list.stream().sorted().forEach(System.out::println);
		list.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
				
	}
	
	public void transform(){
		list.stream().map(String::toUpperCase ).forEach(System.out::println);
		nums.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}
	
	public void limit() {
		list.stream().limit(2).forEach(System.out::println);
	}
	
	public long count() {
		return list.stream().count();
	}
	

}
