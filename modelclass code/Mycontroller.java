package com.java.model;

import java.util.List;

public class Mycontroller {

	public static void main(String[] args) {
		
		List<Employee> list=Tester.myMethod();
		
		float target=0;  
		String name=null;// 0
		for(Employee x:list)    // x
		{
			if(target<x.getCost())   // 0<2345    2345<12334  12334<4567
			{
				target=x.getCost();   // 12334
				name=x.getName();
			}
		}
		System.out.println("Max salary="+target+" hold by "+name);
		//   10 %
		
		
	}
}
