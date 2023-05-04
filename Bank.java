package com.jsp.exceptionhandling;

public class Bank {

	public static void main(String[] args) {
		Account a=new Account(10000);
		int amount=15000;
		try {
			a.withDrawl(amount);
			System.out.println(amount);
			System.out.println("available"+a.getBal());
		} catch (insufficientbalanceException e) {
			
			e.printStackTrace();
		}
	}

}
