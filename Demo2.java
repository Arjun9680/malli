package com.jsp.exceptionhandling;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("main start");
        m1();
        System.out.println("main ended");
	}
public static void m1() {
	System.out.println("m1 start");
	m2();
}public static void m2()
{
	System.out.println(10/0);
}
}

