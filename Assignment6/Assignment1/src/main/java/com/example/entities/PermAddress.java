package com.example.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="permanent")
public class PermAddress implements Address {
	@Value("${homeLocation}")
	String homeLocation;
	public String getAddress() {
		// TODO Auto-generated method stub
		return this.homeLocation;
	}

}
