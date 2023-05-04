package com.jsp.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo9 {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("sample.next");
			pw.println("saved");
		} catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("handled");
		}

	}

}
