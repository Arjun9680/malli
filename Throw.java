package com.jsp.exceptionhandling;

public class Throw  extends AgenotFoundException {
	public static void validate(int age) throws AgenotFoundException 
	{
		if(age<18) {
			throw new AgenotFoundException("person is not eligible");
		}else {
			System.out.println("eligible to marriage");
		}
	}
	public static void main(String[] args) {
		try {
			validate(15);
		} catch (AgenotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}

}
