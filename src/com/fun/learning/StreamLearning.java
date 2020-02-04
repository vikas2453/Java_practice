package com.fun.learning;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

import com.fun.learning.LamdaExpressionSearch.Consumer;

public class StreamLearning {

	public static void main(String[] args) {		
		
		// without stream	
		System.out.println("************Without Stream**********");
		List<Customer> customerlist=CustomerData.getCustomerList();
		performActionOnSelction(customerlist, customer->customer.getGender()==Gender.Male && customer.getAge()>=20,System.out::println);
		customerlist.forEach(customer->customer.setAge(customer.getAge()+1));	
		
		// with stream
		System.out.println("************With Stream**********");
		customerlist.stream().peek(customer->customer.setAge(customer.getAge()+1))		
		.filter(customer->customer.getGender()==Gender.Male && customer.getAge()>=20)
		.forEach(System.out::println);
		
		// using skip and limit
		System.out.println("************With Stream skipping first entry and limiting it to 2**********");
		customerlist.stream()
		.skip(1)
		.limit(2)
		.peek(customer->customer.setAge(customer.getAge()+1))		
		.filter(customer->customer.getFirstName()!=null)
		.forEach(System.out::println);
		
		
		// how stream helps
		System.out.println("old way of calculating average age of people above certain age limit");
		System.out.println("average age of people above certain age limit 20= "+getAveargeAgeofCustomer(customerlist, 20));
		
		System.out.println("new way using stream calculating average age of people above certain age limit");
		 System.out.println("Avg = "+ customerlist.stream().mapToInt(Customer::getAge).filter(age-> age>20).average());
		 
		 
		 //Matches
		 System.out.println("is there any customer with age above 20? :"+customerlist.stream().anyMatch(customer->customer.getAge()>=20));
		 System.out.println("Are all customer with age above 20? :"+customerlist.stream().allMatch(customer->customer.getAge()>=20));
		 System.out.println("Does all customers have first name? :"+customerlist.stream().allMatch(customer->customer.getFirstName()!=null));
		 System.out.println("Does all customers have first name? :"+customerlist.stream().noneMatch(customer->customer.getFirstName()==null));
		 
		 
		 //findfirst and findany
		 System.out.println("first customer with age above 20? :"+customerlist.stream().filter(customer->customer.getAge()>=20).findFirst());
		 System.out.println("Any customer with name Kishen? :"+customerlist.stream().filter(customer->customer.getFirstName().equalsIgnoreCase("Jack")).findAny());
		 
		 
		 
		// how to build stream
			/*Stream s1=Stream.generate(()->"one");
			s1.forEach(System.out:: println);*/
			
			IntStream stream="hello".chars();
			stream.forEach(System.out:: println);
			
			Builder<String> s1=Stream.builder();
			s1.add("one").add("two").add("tree");
			
			Stream<String> s2=Stream.iterate("*",s->s+"*" );
			s2.limit(5).forEach(System.out::println);
			
	}
	
	public static void performActionOnSelction(Iterable<Customer> source, Predicate<Customer> tester,Consumer<Customer> block ) {
		for(Customer customer: source) {
			if(tester.test(customer))
					block.accept(customer);
		}		
	}
	
	
	public static double getAveargeAgeofCustomer(List<Customer> source, int ageLimit) {
		int count=0;
		Double avg=0.0;
		int sum=0;
		for(Customer customer: source) {
			if(customer.getAge()>=ageLimit) {
				count++;
				sum=sum+customer.getAge();
			}
		}
		if(count>0)
			avg=(double)sum/count;
		return avg;
	}

}
