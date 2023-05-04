package com.jsp.exceptionhandling;

 class Parent{
	void msg() {
		System.out.println("parent method");
	}
}
public class TestChild extends Parent{
	@Override
	void msg() throws ArithmeticException
	{
		System.out.println("main child");
	}
	public static void main(String[] args) {
		Parent p=new Parent();
		p.msg();
	}

}
