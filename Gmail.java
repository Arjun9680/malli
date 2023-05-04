package com.jsp.exceptionhandling;

public class Gmail {

	public static void main(String[] args) {
		String userName="Ram@123";
		int pass=312;
		if(userName.equals("Ram@123")) {
			if(pass==232) {
				System.out.println("LOGIN");
			}else{
				try {
				throw new wrongpassException("psd is wrong");
			}catch(wrongpassException e){
				System.out.println(e.getMessage());
			}
		}}else {
			try {
				throw new wrongusernameexception();
			}catch(wrongusernameexception e) {
				System.out.println(e.getMessage());
			}
		}
			

	}

}
