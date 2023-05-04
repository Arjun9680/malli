package com.jsp.exceptionhandling;

import java.io.IOException;

public class Throws {

	public void p() throws IOException {
		throw new IOException();
	}

	public void n() throws IOException {
		p();
	}

	public void m() {
		try {
			n();
		} catch (IOException e) {
			System.out.println("handled");
		}
	}

	public static void main(String[] args) throws IOException {

		Throws t = new Throws();

		t.m();
	}

}
