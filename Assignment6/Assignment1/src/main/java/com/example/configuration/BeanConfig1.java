package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.entities.Employee;

@Configuration
@ComponentScan(basePackages="com.example.entities")
@PropertySource("classpath:application.properties")
public class BeanConfig1 {

//	@Bean
//	public Employee getEmployee() {
//		return new Employee();
//	}
}
