package com.jsp.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw1 {

	public static void method() throws FileNotFoundException {
	FileReader file =new FileReader("C:\\Users\\Arjun pandhya\\OneDrive\\7ECE3\\BASICS\\datastructure\\src\\com\\jsp\\lambda");
BufferedReader fileInput=new BufferedReader(file);
throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		try{ 
			method();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code");
	}
}
