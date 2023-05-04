package com.jsp.exceptionhandling;

public class Account {
   private int bal;
	public Account() {
		return;
	}
	public Account(int bal)
	{
		this.bal=bal;
		
	}
	public int getBal() {
		return bal;
	}
	
	public void withDrawl(int amount) throws insufficientbalanceException 
	{
		
		if(amount>bal) {
			throw new insufficientbalanceException("Insuficient balance");
		}
		bal-=amount;
	}
}
