package com.jsp.exceptionhandling;


public class Finally3 {

public static void main(String[] args)
{
	try{
		int a=10/0;
	}catch(ArithmeticException e) {
		System.out.println("handled");
		System.exit(0);
	}
		finally {
		System.out.println("finally block");
	}
	
}
}

