package com.rizen.java8;

import com.rizen.java8.interfaces.Operation;

public class Lambdas {

	public static int intValue(Number x) {
		return x.intValue();
	}
	
	
	public static int addition(int a, int b) {
		Operation addition = (int x, int y) -> x + y;
		return addition.calcul(8, 2);
	}

	public int division(int a, int b) {
		Operation division = (int x, int y) -> x / y;
		return division.calcul(8, 2);

	}

	public static void main(String[] args) {

		Lambdas mesLambdas = new Lambdas();

		// addition
		System.out.println("Add 2 + 3 = " + mesLambdas.addition(2, 3));
		
		// division
		System.out.println("Add 2 / 3 = " + mesLambdas.division(2, 3));

	}
}
