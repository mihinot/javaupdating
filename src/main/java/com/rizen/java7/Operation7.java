package com.rizen.java7;

import com.rizen.java7.interfaces.IOperation7;

public class Operation7 implements IOperation7 {


	@Override
	public int addition(int x, int y) {
		return x + y;
	}
	
	@Override
	public int division(int x, int y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		
		Operation7 operation = new Operation7();
		
		System.out.println("Addition : 2 + 3 = " + operation.addition(2, 3));
		
		System.out.println("Division : 2 / 3 = " + operation.division(2, 3));
		
	}


}
