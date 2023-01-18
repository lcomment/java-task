package com.test02;

public class Human {
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	public Human() {}
	public Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	
	
}
