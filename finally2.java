package com.jsp.exceptionhandling;

public class finally2 {

	public static void main(String[] args) {
		try{
			int d=5;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block executed");
			//System.out.println(d);
		}
		
	}

}
