package com.jsp.exceptionhandling;

public class Demo5 {

	public static void main(String[] args) {
		String s = "arjun";
		System.out.println(s);
		int n = 7;
		try {
			n =Integer.parseInt(s);
		} catch (NumberFormatException e) {

			System.out.println("handled");
		}
		System.out.println(n);
	}

}
