package com.java.model;

public class Employee {

	int id;
	String name;
	float cost;
	public Employee(int id, String name, float cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getCost() {
		return cost;
	}
	
	
	
}
