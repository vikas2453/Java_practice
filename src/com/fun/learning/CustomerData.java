package com.fun.learning;

import java.util.ArrayList;
import java.util.List;

public class CustomerData {
		
	private static List<Customer> listofCustomer= new ArrayList<Customer>();
	
	static {
		Customer customer1= new Customer("Ram", "Kishen", "Shamli", 22, Gender.Male);
		Customer customer2= new Customer("Sam", "Jishen", "Thamli", 30, Gender.Male);
		Customer customer3= new Customer("Tam", "Iishen", "Uhamli", 44, Gender.Female);
		Customer customer4= new Customer("Uam", "Hishen", "Vhamli", 11, Gender.Female);
		Customer customer5= new Customer("Jack", "Daniel", "Framingham", 31, Gender.Male);
		Customer customer6= new Customer("Scarlett", "Johnshon", "woburn", 33, Gender.Female);
		
		listofCustomer.add(customer1);
		listofCustomer.add(customer2);
		listofCustomer.add(customer3);
		listofCustomer.add(customer4);
		listofCustomer.add(customer5);
		listofCustomer.add(customer6);
	}
	
	public static List<Customer> getCustomerList(){
		
		return listofCustomer;
	}

}
