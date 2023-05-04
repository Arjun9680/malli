package com.jsp.exceptionhandling;

public class throw2 extends userdefinedException{

	public static void main(String[] args) {
		try {
			throw new userdefinedException("this is user defined exception");
		}catch(userdefinedException e) {
			System.out.println(e.getMessage());
		 System.out.println("caught exception");
		}
	}

}
