package com.jsp.exceptionhandling;

public class Demo8 {
public static void main(String[] args) {
	try {
	int data=50/0;
	}catch(Exception e) {
		int data=50/0;
		System.out.println("handled");
	}
}
}
