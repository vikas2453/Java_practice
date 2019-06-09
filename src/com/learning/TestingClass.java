package com.learning;

import java.util.HashSet;
import java.util.Set;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Customer>customerset=new HashSet<Customer>();
		
		//let's create some equal objects and store them in the set.
		Customer c1 =new Customer("Vikas", "Natick","email_address");
		Customer c2 =new Customer("Vikas", "Natick","email_address");
		Customer c3 =new Customer("Vikas", "Natick","email_address");
		customerset.add(c1);
		customerset.add(c2);
		customerset.add(c3);
		// without orverriding equals and override all the three objects would be added in the set
		//even when only equals method is overriddden but not hashcode, all the objects are duplicated. 
		System.out.println(customerset);
		

	}

}
