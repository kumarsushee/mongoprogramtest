package com.mongoApplicationmo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="employeeSample")
public class EmployeeModel {
	
	@Id
	private int id;
	
	private String name;
	private int age;
	private String email;
	
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public static void main(String[]args)
	{
		String s="B2c_74884874";
		String d=s.split("_")[0].toUpperCase();
		System.out.println(d);
		
	}
	

}
