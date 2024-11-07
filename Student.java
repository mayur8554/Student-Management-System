package com.javaconectivity;

public class Student {
	
	
	private int RollNum; 
	private String Name ;
	private int Age ;
	private String Grade ;
	
	public Student() {
	super();
	
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNum, String name, int age, String grade) {
		super();
		this.RollNum = rollNum;
		this.Name = name;
		this.Age = age;
		this.Grade = grade;
	}
	public Student( String name, int age, String grade) {
		super();
		
		this.Name = name;
		this.Age = age;
		this.Grade = grade;
	}
	public int getRollNum() {
		return RollNum;
	}
	public void setRollNum(int rollNum) {
		RollNum = rollNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	@Override
	public String toString() {
		return "Student [RollNum=" + RollNum + ", Name=" + Name + ", Age=" + Age + ", Grade=" + Grade + "]";
	}
	
	
	
	

}
