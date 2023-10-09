package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.configuration.BeanConfig1;
import com.example.entities.Employee;

public class EmployeeDetailApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig1.class);
		Employee emp1 = context.getBean(Employee.class);
		emp1.setEmployeename("Abhishek Singh");
		emp1.setEmployeeid(20334219);
		emp1.setEmployeeband("B3");
		System.out.println(emp1.toString());

		/*
		 * if scope is Singleton then emp1 value will refer to emp2 (only one instance
		 * is created) then used prototype as scope to create multiple instance
		 */
		Employee emp2 = context.getBean(Employee.class);
		emp2.setEmployeename("Ashish Anand");
		emp2.setEmployeeid(20334220);
		emp2.setEmployeeband("B2");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}

}
