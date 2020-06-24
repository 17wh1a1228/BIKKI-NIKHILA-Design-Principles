package com.maven.Calculator;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("MENU");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			double a,b;
			 switch(choice)
			 {
			 case 1:
				 System.out.println("Enter two numbers:");
				 a=sc.nextDouble();
				 b=sc.nextDouble();
				 Addition.add(a, b);
				 break;
			 case 2:
				 System.out.println("Enter two numbers:");
				 a=sc.nextDouble();
				 b=sc.nextDouble();
				 Subtraction.subtract(a, b);
				 break;
			 case 3:
				 System.out.println("Enter two numbers:");
				 a=sc.nextDouble();
				 b=sc.nextDouble();
				 Multiplication.multiply(a, b);
				 break;
			 case 4:
				 System.out.println("Enter two numbers:");
				 a=sc.nextDouble();
				 b=sc.nextDouble();
				 Division.divide(a, b);
				 break;
			 case 5:
				 System.out.println("Thank You");
				 System.exit(0);
			default:
				 System.out.println("Invlaid Choice");
			 }
		}

	}

}
