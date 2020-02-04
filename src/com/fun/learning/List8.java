package com.fun.learning;

import java.util.Iterator;
import java.util.Comparator;
import java.util.List;

public class List8 {
	static List<Customer> customerlist=CustomerData.getCustomerList();
	public static void main(String[] args) {
		
		// foreach method
		customerlist.forEach(System.out::println);
		customerlist.forEach( person-> person.setAge(person.getAge()+1));
		System.out.println("Increased age: -> ");
		customerlist.forEach(System.out::println);
		
		// removeif method
		
		// below will throw an exception as we can't remove from collection while
		// iterating through it using advanced for loop
		/*for(Customer customer: customerlist) {
			if(customer.getAge()<16)
				customerlist.remove(customer);
		}*/
		
		
		// this was the way to remove from the collections
		/*Iterator<Customer>customerIter =customerlist.iterator();
		while (customerIter.hasNext()) {
			Customer cust =customerIter.next();
			if(cust.getAge()<16)
				customerIter.remove();
		}*/
		
		customerlist.removeIf(customer->customer.getAge()<16);
		
		System.out.println("Adult list: ->");
		customerlist.forEach(System.out::println);
		
		// sorting
		customerlist.sort(Comparator.comparing(Customer::getAge).
				thenComparing(Customer::getFirstName));
		
		System.out.println("sorted list with age and then name: ->");
		customerlist.forEach(System.out::println);
		
		
	
	}

}
