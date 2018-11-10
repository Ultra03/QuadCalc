package net.ultra03.QuadraticFormulaCalc;

import java.util.Scanner;

public class QuadCalc {
	
	public void calculate() {
		// Initialize Scanner for user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Value for a: ");
		double a = scan.nextDouble();
		System.out.println("Value for b: ");
		double b = scan.nextDouble();
		System.out.println("Value for c: ");
		double c = scan.nextDouble();
		scan.close();
		
		double firstAnswer = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		double secondAnswer = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if(Double.isNaN(firstAnswer) || Double.isNaN(secondAnswer)) {
			System.out.println("Answer values are imaginary numbers");
		} else {
			System.out.println("The answers are:");
			System.out.println(firstAnswer);
			System.out.println(secondAnswer);
		}
		
	}

}
