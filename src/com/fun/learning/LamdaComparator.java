package com.fun.learning;

//import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LamdaComparator {
	public static void main(String[] args) {
		Comparator<Customer> compAge = Comparator.comparing(Customer::getFirstName);
		
		Comparator<Customer> compCust=compAge.thenComparing(Customer::getLastName);
		
/*		Set<Customer> custSet= new TreeSet<Customer>(compCust);
		custSet.addAll(CustomerData.getCustomerList());
		System.out.println(custSet);*/
	}
}
