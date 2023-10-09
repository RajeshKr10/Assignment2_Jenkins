package com.example.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="temporary")
public class TempAddress implements Address {
	@Value("${workLocation}")
	String workLocation;

	public String getAddress() {
		// TODO Auto-generated method stub
		return this.workLocation;
	}

}
