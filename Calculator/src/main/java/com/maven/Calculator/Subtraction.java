package com.maven.Calculator;

import java.util.Scanner;

public class Subtraction {

	public static void subtract(double a,double b) {
		Scanner sc=new Scanner(System.in);
		DAOInterface daoi= new CalculationDAO();
		System.out.println(daoi.subtraction(a, b));
	}

}