package com.jsp.exceptionhandling;

public class Demo3 {

	public static void main(String[] args) {
		String s="arjun1234567890";
try {
			System.out.println(s.length());// exception doesn't occur here.
		
	}catch(NullPointerException e)
{
		System.out.println("handled");
}
}
}