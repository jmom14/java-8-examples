package com.example.java8.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionApp {

	private List<String> list;

	public static void main(String[] args) {

		CollectionApp app = new CollectionApp();
		app.populateList();
		app.useRemoveIf();
		app.useForEach();

	}

	public void populateList() {
		list = new ArrayList<>();
		list.add("Abecedario");
		list.add("Palabra");
		list.add("Cañon");
		list.add("Metodo");
	}

	public void useForEach() {

		// list.forEach(x -> System.out.println(x));
		list.forEach(System.out::println);
	}

	public void useRemoveIf() {
		// Before
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			if(it.next().equalsIgnoreCase("Metodo")) {
//				it.remove();
//			}			
//		}
		// Now
		list.removeIf(x -> x.equalsIgnoreCase("Metodo"));
	}

	public void useSort() {
		list.sort((x, y) -> x.compareTo(y));
	}
}
