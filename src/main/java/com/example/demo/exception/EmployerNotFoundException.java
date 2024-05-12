package com.example.demo.exception;

public class EmployerNotFoundException extends RuntimeException {

	@Override
	public String toString() {
		return "Employ Data Not Found";
	}
}
