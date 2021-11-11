package com.copart.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CountryInfo {

	private String countryCode;
	private String countryName;
}
