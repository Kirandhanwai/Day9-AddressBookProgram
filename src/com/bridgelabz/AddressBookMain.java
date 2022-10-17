package com.bridgelabz;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to addressBook java Program");
		
		Contact contact = new Contact("Kiran", "Dhanwai", "Aurangabad", "Aurangabad", 123456, "Maharashtra",
				"1234567890", "kiran@gmail.com");
		System.out.println( contact );
		}
}
