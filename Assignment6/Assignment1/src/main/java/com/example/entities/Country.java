package com.example.entities;

import org.springframework.stereotype.Component;

@Component
public class Country {
	private String countryId;
	private String countryName;
	
	public Country() {
		
	}

	public Country(String countryId, String countryName) {
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
	}
}
