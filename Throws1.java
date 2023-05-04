package com.jsp.exceptionhandling;

import java.io.IOException;

class M{
	public void method() throws IOException {
		throw new IOException();
	}
}
public class Throws1 {

	public static void main(String[] args) {
		M m = new M();
		try {
			System.out.println("try block");
			m.method();
		}catch( IOException e) {
			System.out.println("handled");
		}
  
	}

}
