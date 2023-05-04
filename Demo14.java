package com.jsp.exceptionhandling;

public class Demo14 {

	public static void main(String[] args) 
	{int age=24;
		if(age>=25 && age<=35) {
			System.out.println("eligiable");
		}else {
			try {
				throw new AgeInvalidException();
			}catch(AgeInvalidException e) {
				System.out.println("thank you malli");
			}
			
		}	
	}

}
