package com.example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApp {
	
	private List<String> list = Arrays.asList("Abecedario","Palabra","Cañon","Metodologia", "Cabernicola", "Computadora");
	private List<String> nums = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
	
	public static void main(String[] args) {
		
		StreamApp app = new StreamApp();
		//app.populateList();
		//app.filter();
		//app.sort();
		//app.transform();
		//app.limit();
		//System.out.println(app.count());
		app.testIntStream();
	}
	
	public void filter() {
		list.stream().filter(x -> x.startsWith("C")).peek(System.out::println);
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
	
	public void testIntStream() {		
		List<String> strings = Arrays.asList("smallq_","medium_", "large_");
		strings.stream().map(x -> generate(x)).forEach(System.out::println);	
	}
	
	public List<String> generate(String word){
		return IntStream.range(1, 6).mapToObj( x ->  word.concat(String.valueOf(x))).collect(Collectors.toList());
	}
}