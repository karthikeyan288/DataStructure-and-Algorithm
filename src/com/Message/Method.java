package com.Message;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Method {
	
	private static Method instance; 
	
	private Method(){
	}
	
	public static Method getInstance() {
		if(instance == null) {
			instance = new Method();
		}
		return instance;
	}
	
	public void inputdata() {
		//UserInterface userInterface=UserInterface.getInstance();
		firstName();
		lastName();
		mobileNumber();
		date();
	}
	
	public void firstName() {
		UserInterface userInterface=UserInterface.getInstance();
		System.out.println("Enter the First Name : ");
		Scanner sc =new Scanner(System.in);
		String fname = sc.nextLine();
		String pattern = "^[A-Z][a-z]{3,}";
		boolean b3 = Pattern.matches(pattern, fname);
		if (b3) {
		    userInterface.setFirstname(fname);
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
			firstName();
		}
	}

	public void lastName() {
		UserInterface userInterface=UserInterface.getInstance();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Last Name : ");
		String lname = sc.nextLine();
		String pattern = "^[A-Z][a-z]{3,}";
		boolean b3 = Pattern.matches(pattern, lname);
		if (b3) {
			userInterface.setLastname(lname);
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
			lastName();
		}
	}
	
	public void mobileNumber() {
		UserInterface userInterface=UserInterface.getInstance();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the mobile Number : ");
		String number = sc.nextLine();
		String pattern = "^[91]+\\s\\d{10}$";
		boolean b3 = Pattern.matches(pattern, number);
		if (b3) {
			userInterface.setMobile_number(number);
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
			mobileNumber();
		}
	}
	
	public void date() {
		UserInterface userInterface=UserInterface.getInstance();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the date : ");
		String date = sc.nextLine();
		String pattern ="^[0-9]{2}+/[0-9]{2}+/[0-9]{4}+$";
		boolean b3 = Pattern.matches(pattern, date);
		if (b3) {
			userInterface.setDate(date);
			System.out.println(b3 + "->" + " Match found");
		} else {
			System.out.println(b3 + "->" + "Match not found");
			date();
		}
		
	}
	
	public void display() {
		UserInterface userInterface=UserInterface.getInstance();
		System.out.println(" Hello "+userInterface.getFirstname()+" We have your \r\n"
				+ "full name as "+userInterface.getFirstname()+userInterface.getLastname()+" in our system.your contact number is "+userInterface.getMobile_number()+"\r\n"
						+ "Please,let us know in case of any clarification Thank you BridgeLabz   Date :"+userInterface.getDate());
	}

}
