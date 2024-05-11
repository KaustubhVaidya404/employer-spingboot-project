package com.example.demo.model;

public class Employer {

	private int id;
	private String name;
	private String department;
	private String post;
	private int salary;
	
	
	public Employer() {}
	
	public Employer(int id, String name, String department, String post, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.post = post;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
