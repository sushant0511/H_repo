package com.java.model;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static List<Employee> myMethod() {
		
		Employee e1=new Employee(1, "Sam", 2345);
		Employee e2=new Employee(2, "Jack", 12334);
		Employee e3=new Employee(3, "Smith", 4567);
		List<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		return list;
		
		
			
	}
}
