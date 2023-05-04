package com.jsp.exceptionhandling;

public class Demo4 {

	public static void main(String[] args) {
		String s="1234";
		System.out.println(s.length());
		int n=0;
		try {
			n=Integer.parseInt(s); // here,exception doesn't occur
		}
	catch(NumberFormatException e)
		{
			System.out.println("handled");
		}
		System.out.println(n);
	}

}
