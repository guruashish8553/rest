package com.copart.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties
@Data
public class StudentInfo {

	private Integer sno;
	private String sname;
	private Integer age;
	private Address address;
}
