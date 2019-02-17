package com.example.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaApp implements IDefault{
	
	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		// app.lambdaExpression1();
		//app.lambdaExpression4();
		app.talk();
		app.contructorReference();
	}

	public void sort() {
		List<String> list = new ArrayList<>();
		list.add("Abecedario");
		list.add("Palabra");
		list.add("Cañon");
		list.add("Metodo");
	}

	public void lambdaExpression1() {
		Operation operation = (double x, double y) -> (x + y) / 2;
		System.out.println(operation.calculate(10, 3));
	}

	public void lambdaExpression2() {
		Operation operation = (double x, double y) -> {
			return (x + y) / 2;
		};
		System.out.println(operation.calculate(10, 20));
	}

	public void lambdaExpression3() {
		Operation operation = (double x, double y) -> {
			int a = 5;
			int b = 5;
			return (a + b) + (x + y);
		};
		System.out.println(operation.calculate(10, 20));
	}
	
	public void lambdaExpression4() {
		Operation operation = (x, y) -> (x + y)/2;
		System.out.println(operation.calculate(3, 3));
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void contructorReference() {
		//1
		IPersona persona1 = new IPersona() {
			@Override
			public Persona crear(int id, String nombre) {
				return new Persona(id,nombre);
			}
		};
		persona1.crear(1, "Jose");
		
		//2
		IPersona persona2 = (x,y) ->(new Persona(x,y));
		Persona pe = persona2.crear(2, "Manuel");
		System.out.println(pe.getId() + " - " + pe.getNombre());
		
		//3
		IPersona persona3 =  Persona::new;
		Persona per = persona3.crear(3, "Ortega");
		System.out.println(per.getId() + " - " + per.getNombre());
		
	}
}
