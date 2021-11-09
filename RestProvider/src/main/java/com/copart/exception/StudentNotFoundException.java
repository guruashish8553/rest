package com.copart.exception;

public class StudentNotFoundException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7835086521841503062L;
	
	public StudentNotFoundException(String errorMsg) {
		super(errorMsg);
	}
	

}
