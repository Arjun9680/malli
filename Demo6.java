package com.jsp.exceptionhandling;

public class Demo6 {

	public static void main(String[] args) {
		int a=10,b=0;
		try {
		System.out.print(a/b);
		}catch(ArithmeticException e){
			b=2;
			System.out.println(a/b);
		}

	}

}
