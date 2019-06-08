/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.modelo.Person;
import com.example.modelo.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author josemanuel.ortega
 */
public class ApiStream {

        
    public static void main(String[] args) {
        List<Student> students = populateList();
        //printList(students);
        passingStudents(students);
       //failedStudents(students);
      //studentsBySubject(students, "PHP");
       // numberOf(students);
        //maxGrade(students);
        //minGrade(students);
    }
    
    public static List<Student> populateList(){
        List<Student> out = new ArrayList<>();
        
    out.add(new Student(1, "Javier Ignacio", "Molina Cano",new Date(), "Java 8", 6, 28));
	out.add(new Student(2, "Lillian Eugenia", "Gomez Alvarez",new Date() ,"Java 8", 10, 33));
	out.add(new Student(3, "Sixto Naranjoe", "Maran Alfaro", new Date(),"Java 8", 8.6, 15));
	out.add(new Student(4, "Gerardo Emilio", "Duque Gutierrez",new Date() ,"Java 8", 10, 13));
	out.add(new Student(5, "Jhony Alberto", "Saenz Hurtado", new Date(),"Java 8", 5, 15));
	out.add(new Student(6, "German Antonio", "Lotero Upegui",new Date() ,"Java 8", 8, 34));
	out.add(new Student(7, "Oscar Dario", "Murillo Gonzalez",new Date() ,"Java 8", 8, 32));
	out.add(new Student(8, "Augusto Osorno", "Palacio Martinez",new Date() ,"PHP", 4, 17));
	out.add(new Student(9, "Cesar Oswaldo", "Alzate Agudelo", new Date(),"Java 8", 8, 26));
	out.add(new Student(10, "Gloria Amparo", "Gonzalez Castazo",new Date() ,"PHP", 10, 28));
	out.add(new Student(11, "Jorge Len", "Ruiz Ruiz", new Date(),"Python", 8, 22));
	out.add(new Student(12, "John Jairo", "Duque Garcia",new Date() ,"Java Script", 9.4, 32));
	out.add(new Student(13, "Julio Cesar", "Gonzalez Castalo",new Date() ,"C Sharp", 10, 22));
	out.add(new Student(14, "Gloria Amparo", "Rodas Monsalve",new Date() ,"Ruby", 5, 18));
	out.add(new Student(15, "Gabriel Jaime", "Jimenez Gomez",new Date() ,"Java Script", 10, 18));
        
        
        return out;
    }
    
    public static void printList(Collection<? extends Person> students){
       students.stream()
               .forEach(e -> System.out.println(e));
    }
    
    public static void passingStudents(Collection<Student> students){
        students.stream()
                    .filter(e -> e.getGrade() > 7)
                        .forEach(e -> System.out.println(e));                                
    }
    
    public static void failedStudents(Collection<Student> students){
        students.stream()
                    .filter(e -> e.getGrade() < 7)
                        .forEach(e -> System.out.println(e));       
    }
    
    public static void studentsBySubject(Collection<Student> students, String subject){
        students.stream()
                    .filter(e -> e.getSubject().equals(subject))
                        .forEach(e -> System.out.println(e));       
    }
    
    public static void numberOf(Collection<Student> students){
        System.out.println(students.stream().count());
    }
    
    public static void maxGrade(Collection<Student> students){
        System.out.println(
                students.stream()
                        .max((v1, v2)-> Double
                                .compare(v1.getGrade(), v2.getGrade()))
                                    .get());
    }
    
     public static void minGrade(Collection<Student> students){
        System.out.println(
                students.stream()
                        .min((v1, v2)-> Double
                                .compare(v1.getGrade(), v2.getGrade()))
                                    .get());
    }
    
    
}
