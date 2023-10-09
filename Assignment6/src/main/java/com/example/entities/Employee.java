package com.example.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
	private long Employeeid;
	private String employeename;
	private String employeeband;

	@Autowired
	@Qualifier("temporary")
	private Address address;

	public Employee() {

	}

	public Employee(long employeeid, String employeename, String employeeband, Address address) {
		Employeeid = employeeid;
		this.employeename = employeename;
		this.employeeband = employeeband;
		this.address = address;
	}

	public long getEmployeeid() {
		return Employeeid;
	}

	public void setEmployeeid(long employeeid) {
		Employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeeband() {
		return employeeband;
	}

	public void setEmployeeband(String employeeband) {
		this.employeeband = employeeband;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee Details [Employeeid=" + Employeeid + ", employeename=" + employeename + ", employeeband="
				+ employeeband + ", address=" + address.getAddress() + "]";
	}

}
