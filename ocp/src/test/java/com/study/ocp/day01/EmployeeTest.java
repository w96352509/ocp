package com.study.ocp.day01;

import java.util.Date;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "John";
		employee.birth = new Date();
		employee.salary = 50000;
		System.out.printf("name : %s , birth : %s , salary : %d ", employee.name, employee.birth, employee.salary);
		employee.job();
	}
}
