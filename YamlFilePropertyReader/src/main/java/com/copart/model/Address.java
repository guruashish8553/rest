package com.copart.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Address {

	private int streenNo;
	private int pin;
	private String area;
	private CountryInfo countryInfo;
}
