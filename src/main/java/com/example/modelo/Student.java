
package com.example.modelo;

import java.util.Date;

public class Student extends Person{
           	
	private String subject;
	private double grade;
	private int age;

    public Student(long id, String name, String lastName, Date birthDate, String subject, double grade, int age) {
        super(id, name, lastName, birthDate);
        this.subject = subject;
        this.grade = grade;
        this.age = age;
    }                

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "subject=" + subject + ", grade=" + grade + ", age=" + age;
    }


        
        
        
        
    
}
