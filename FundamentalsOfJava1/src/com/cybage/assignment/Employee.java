package com.cybage.assignment;

public class Employee {
  private String id;
  private String name;
  private String department;
  private int age;

public Employee() {
	super();
}
public String getId() {
	return id;
}
public void setId(String id) {
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + "]";
}
  
}
