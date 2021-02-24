package com.erp.core.web;

public class Student {

	private String name;
	private String gender;
	private String stuClass;
	private String rollNo;
	private int age;
	private String sub="1";
	
	public Student(){} 
	public Student(String name, String gender, String stuClass, String rollNo,
			int age, String sub) {
		super();
		this.name = name;
		this.gender = gender;
		this.stuClass = stuClass;
		this.rollNo = rollNo;
		this.age = age;
		this.sub = sub;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
}
