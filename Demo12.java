package com.jsp.exceptionhandling;

public class Demo12 {

	public static void main(String[] args) {
		try {
			div();
		}catch(ArithmeticException e) {
			System.out.println("handled");
		}
	}
 static void div() {
		// TODO Auto-generated method stub
		System.out.println(10/0);
	}

}
