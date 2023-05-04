package com.jsp.exceptionhandling;

public class Demo1 {

	public static void main(String[] args) {
		int a[] = {1,2,3};
		try {
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
