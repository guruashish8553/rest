package com.copart.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorType {

	private Date timestamp;
	private int status;
	private String error;
	private String message;
}
