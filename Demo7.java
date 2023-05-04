package com.jsp.exceptionhandling;

public class Demo7 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,56};
		try {
		System.out.println(arr[30]);
	
	}catch(Exception e) {
		System.out.println("exception  block");
	}catch(ArithmeticException  e) {  // here exception already handled above catch block,why u add another catch block.
		System.out.println("array block");
	}
}
}