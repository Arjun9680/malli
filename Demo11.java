package com.jsp.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo11 {

	public static void main(String[] args) {
		try {
		FileReader file=new FileReader("C:\\Users\\Arjun pandhya\\OneDrive\\7ECE3\\BASICS");
	}catch(FileNotFoundException e)
		{
		System.out.println("handled");
		}

}
}