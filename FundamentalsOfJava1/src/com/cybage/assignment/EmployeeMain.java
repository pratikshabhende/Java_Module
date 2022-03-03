package com.cybage.assignment;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee= new Employee();
		employee.setName("Pratiksha Bhende");
		employee.setDepartment("CS");
		employee.setAge(24);
		employee.setId("200");
		System.out.println("Employee 1: [Name:"+""+employee.getName()+","+"Department:"+employee.getDepartment()+","+"Age:"+employee.getAge()+","+"ID:"+employee.getId()+"]");
		
		Employee employee1= new Employee();
		employee1.setName("Renuka Shelar");
		employee1.setDepartment("CS");
		employee1.setAge(26);
		employee1.setId("201");
		System.out.println("Employee 2: [Name:"+""+employee1.getName()+","+"Department:"+employee1.getDepartment()+","+"Age:"+employee1.getAge()+","+"ID:"+employee1.getId()+"]");
	}
}
