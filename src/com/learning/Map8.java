package com.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map8 {

	public static void main(String[] args) {
		List<Customer> customerlist=CustomerData.getCustomerList();
		Map<String,List<Customer>> cityCustomerMap =new HashMap<>();
		
		// new for each method along with compute if absent, it will create a new list only for the new entries. 
		customerlist.forEach(customer->cityCustomerMap.computeIfAbsent(
				customer.getAddress(), key->new ArrayList<Customer>()
				).add( customer));
		
		//following will return a null
		System.out.println("Natick:--> "+cityCustomerMap.get("Natick"));
		
		//following will return an empty list
		System.out.println(cityCustomerMap.getOrDefault("Natick", Collections.EMPTY_LIST));
		
		cityCustomerMap.forEach((city,list)->System.out.println(city+" : "+ list));

	}

}
