package com.lti.demo;

public class Person {
	private int id;
	private String personName;
	private double cost;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String personName, double cost) {
		super();
		this.id = id;
		this.personName = personName;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + ", cost=" + cost + "]";
	}

}
