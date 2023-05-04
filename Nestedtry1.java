package com.jsp.exceptionhandling;

public class Nestedtry1 {

	public static void main(String[] args) {
		try {
			try {
				try {
					int arr[] = { 1, 3, 3, 4, 5 };
					System.out.println(arr[8]);
				} catch (ClassCastException e) {
					System.out.println(e);
				}
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
