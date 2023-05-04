package com.jsp.exceptionhandling;

public class Demo10 {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("catch 1");
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("catch 2");
		}
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("catch 3");
		}
		
	}

}
