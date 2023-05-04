package com.jsp.exceptionhandling;

public class Propagation {
public void p(){
	int d=10/0;
	}
 public void n(){
	p();
}
	public void m(){
		try {
			n();
		}catch(ArithmeticException e)
		{
			System.out.println("handled");
	}
	}
	public static void main(String[] args) {
		Propagation p = new Propagation();
		p.m();
	}

}
