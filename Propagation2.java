package com.jsp.exceptionhandling;

public class Propagation2 {

	public void p(){
		throw new ArithmeticException();
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

