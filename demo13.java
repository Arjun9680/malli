package com.jsp.exceptionhandling;

public class demo13 {

/*	public static void main(String[] args) throws InterruptedException {
		div();
	}

	public static void div() throws InterruptedException 
	{
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			Thread.sleep(1000);
		}
		
		
	}*/
	public static void main(String[] args) {
		try {
			div();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void div() throws InterruptedException 
	{
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			Thread.sleep(1000);
		}
		
		
	}

}
