package com.maven.Calculator;

public class CalculationDAO implements DAOInterface {

	public double addition(double a, double b) {
		return (a+b);
	}

	public double subtraction(double a, double b) {
		return (a-b);
	}
	
	public double multiplication(double a, double b) {
		return (a*b);
	}
	
	public double division(double a, double b) {
		return (a/b);
	}
	
}
