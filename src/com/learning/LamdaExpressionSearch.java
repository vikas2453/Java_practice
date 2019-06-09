package com.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LamdaExpressionSearch {
	
	interface Consumer<Customer>{
		void accept(Customer t);
	}
	
		
	public void performActionOnSelectedCustomer( Iterable<Customer> source, Predicate<Customer> tester,Consumer<Customer> block) {
		for( Customer customer:source ) {
			if(tester.test(customer))
				block.accept(customer);
				
		}
	} 
	
	public static void main(String[] args) {
		LamdaExpressionSearch les = new LamdaExpressionSearch();
		les.performActionOnSelectedCustomer(CustomerData.getCustomerList(), 
				c->c.getGender()==Gender.Female && c.getAge()>=40, System.out::println);
		
	}

}
