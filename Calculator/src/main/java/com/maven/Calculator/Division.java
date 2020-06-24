package com.maven.Calculator;

import java.util.Scanner;

public class Division {

	public static void divide(double a,double b) {
		Scanner sc=new Scanner(System.in);
		DAOInterface daoi= new CalculationDAO();
		System.out.println(daoi.division(a, b));
	}

}
