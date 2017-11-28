package com.example.REST_ws;

public class DoubleRentException extends Exception {
	
	public DoubleRentException(String message) {
		super(message);
	}
	
	public DoubleRentException(Throwable cause) {  
		super(cause); 
	}  
	
	public DoubleRentException(String message, Throwable cause) {  
		super(message, cause); 
	} 

}


