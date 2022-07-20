package com.yamlProject.demo.yamlProject.entity;

public class Student {
	private int studentId;
	private String name;
	private int age;
	private String address;
	private String gender;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age =" + age + " address=" + address + ",gender=" + gender + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String name, int age, String address, String gender) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}

