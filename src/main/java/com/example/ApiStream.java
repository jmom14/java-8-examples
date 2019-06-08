/*
 * To change this license header,d choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.example.modelo.Person;
import com.example.modelo.Student;

/**
 *
 * @author josemanuel.ortega
 */
public class ApiStream {

	public static void main(String[] args) {
		List<Student> students = populateList();
		// printList(students);
		// passingStudents(students);
		testPredicate(students);
		testFunction(students);
		testConsumer(students);
		// failedStudents(students);
		// studentsBySubject(students, "PHP");
		// numberOf(students);
		// maxGrade(students);
		// minGrade(students);
	}

	public static List<Student> populateList() {
		List<Student> students = new ArrayList<>();

		students.add(Student.builder().id(1).name("Javier Ignacio").lastName("Molina Cano").birthDate(new Date())
				.subject("Java 8").grade(6).age(28).build());
		students.add(Student.builder().id(2).name("Lillian Eugenia").lastName("Gomez Alvarez").birthDate(new Date())
				.subject("Java 8").grade(10).age(33).build());
		students.add(Student.builder().id(3).name("Sixto Naranjoe").lastName("Maran Alfaro").birthDate(new Date())
				.subject("Java 8").grade(8.6).age(15).build());
		students.add(Student.builder().id(4).name("Gerardo Emilio").lastName("Duque Gutierrez").birthDate(new Date())
				.subject("Java 8").grade(10).age(13).build());
		students.add(Student.builder().id(5).name("Jhony Alberto").lastName("Saenz Hurtado").birthDate(new Date())
				.subject("Java 8").grade(5).age(15).build());
		students.add(Student.builder().id(6).name("German Antonio").lastName("Lotero Upegui").birthDate(new Date())
				.subject("Java 8").grade(8).age(34).build());
		students.add(Student.builder().id(7).name("Oscar Dario").lastName("Murillo Gonzalez").birthDate(new Date())
				.subject("Java 8").grade(8).age(32).build());
		students.add(Student.builder().id(8).name("Augusto Osorno").lastName("Palacio Martinez").birthDate(new Date())
				.subject("PHP").grade(4).age(17).build());
		students.add(Student.builder().id(9).name("Cesar Oswaldo").lastName("Alzate Agudelo").birthDate(new Date())
				.subject("Java 8").grade(8).age(26).build());
		students.add(Student.builder().id(10).name("Gloria Amparo").lastName("Gonzalez Castazo").birthDate(new Date())
				.subject("PHP").grade(10).age(28).build());
		students.add(Student.builder().id(11).name("Jorge Len").lastName("Ruiz Ruiz").birthDate(new Date())
				.subject("Python").grade(8).age(22).build());
		students.add(Student.builder().id(12).name("John Jairo").lastName("Duque Garcia").birthDate(new Date())
				.subject("Python").grade(9.4).age(32).build());
		students.add(Student.builder().id(13).name("Julio Cesar").lastName("Gonzalez Castalo").birthDate(new Date())
				.subject("Python").grade(10).age(22).build());
		students.add(Student.builder().id(14).name("Gloria Amparo").lastName("Rodas Monsalve").birthDate(new Date())
				.subject("Python").grade(5).age(18).build());
		students.add(Student.builder().id(15).name("Gabriel Jaime").lastName("Jimenez Gomez").birthDate(new Date())
				.subject("Python").grade(8.7).age(31).build());
		return students;
	}

	public static void printList(Collection<? extends Person> students) {
		students.stream().forEach(e -> System.out.println(e));
	}

	public static void passingStudents(Collection<Student> students) {
		students.stream().filter(e -> e.getGrade() > 7).forEach(e -> System.out.println(e));
	}

	public static void failedStudents(Collection<Student> students) {
		students.stream().filter(e -> e.getGrade() < 7).forEach(e -> System.out.println(e));
	}

	public static void studentsBySubject(Collection<Student> students, String subject) {
		students.stream().filter(e -> e.getSubject().equals(subject)).forEach(e -> System.out.println(e));
	}

	public static void numberOf(Collection<Student> students) {
		System.out.println(students.stream().count());
	}

	public static void maxGrade(Collection<Student> students) {
		System.out.println(students.stream().max((v1, v2) -> Double.compare(v1.getGrade(), v2.getGrade())).get());
	}

	public static void minGrade(Collection<Student> students) {
		System.out.println(students.stream().min((v1, v2) -> Double.compare(v1.getGrade(), v2.getGrade())).get());
	}

	public static void testPredicate(Collection<Student> students) {
		System.out.println("-- adults -- ");
		students.stream().filter(isAdult).forEach(x -> System.out.println(x));
		System.out.println("\n");

		System.out.println("-- no adults --");
		students.stream().filter(isNotAdult).forEach(x -> System.out.println(x));
		System.out.println("\n");
	}

	public static void testFunction(Collection<Student> students) {
		System.out.println("-- students ages -- ");
		students.stream().map(getAge).forEach(x -> System.out.println(x));
		System.out.println("\n");
	}
	
	public static void testConsumer(Collection<Student> students) {
		System.out.println("-- students info -- ");
		students.stream().forEach(printInfo);
		System.out.println("\n");
	}

	public static Predicate<Student> isAdult = student -> student.getAge() >= 18;

	public static Predicate<Student> isNotAdult = student -> student.getAge() < 18;

	public static Function<Student, Integer> getAge = student -> student.getAge();

	public static Consumer<Student> printInfo = student -> {
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getAge());
	};

}