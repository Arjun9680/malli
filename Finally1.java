package com.jsp.exceptionhandling;

public class Finally1 {

	public static void main(String[] args) {
		try{
			int a=10/0;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
			
		}
		finally {
			System.out.println("finally block");
		}

	}

}
