package com.hw1.model.vo;

public class Person {
	
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {}

	public Person( int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

	public String information() {

		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f/ 몸무게 : %.1f",
				                 name , age, height,weight );
		//string .format 사용해서 printf 구문 처럼 패턴만들어서 사용
	}
	
	
	

}
