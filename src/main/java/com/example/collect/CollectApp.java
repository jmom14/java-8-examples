package com.example.collect;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.ApiStream;
import com.example.modelo.Student;

public class CollectApp {
	
	public static List<Student> students;
	
	public static void main(String[] args) {
		
		students = ApiStream.populateList();
		//students.forEach(System.out::println);
		//getSubjects(students);
		joining(students);
		sumByCollectors(students);
		toAnyCollection(students);
		getAverage(students);
	}
	
	public static List<String> getSubjects(List<Student> students){
		return students.stream().map(Student::getSubject).peek(System.out::println).collect(Collectors.toList());
	}
	
	public static Map<Long, String> toMap(List<Student> students){
		return students.stream().collect(Collectors.toMap(Student::getId, Student::getName));
	}
	
	public static void joining(List<Student> students) {
		String stringJoined = students.stream().map(Student::getName).collect(Collectors.joining(", "));
		System.out.println(stringJoined);
	}
	
	public static void sumByCollectors(List<Student> students) {
		//Long result = givenList.stream().collect(counting());
		Optional<Integer> sum = students.stream().map(Student::getAge).collect(Collectors.reducing(Integer::sum));
		System.out.println(sum.get());
	}
	
	public static void toAnyCollection(List<Student> students) {
		List<String> list = students.stream().map(Student::getSubject).collect(Collectors.toCollection(LinkedList::new));
		list.forEach(System.out::println);
	}
	
	public static void getAverage(List<Student> students) {
		 Double average = students.stream().collect(Collectors.averagingDouble(Student::getAge));
		System.out.println("Average: " + average);
	}

}
