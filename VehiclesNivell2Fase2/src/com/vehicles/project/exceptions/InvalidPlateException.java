package com.vehicles.project.exceptions;

public class InvalidPlateException extends Exception {

	private static final String INVALID_PLATE_ERROR =  
                "La mtrícula ha de tenir quatre nobres i dues o tres lletres!";
	
	public InvalidPlateException() {
		super(INVALID_PLATE_ERROR);
	}
}
