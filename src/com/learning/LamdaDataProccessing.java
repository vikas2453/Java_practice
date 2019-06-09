package com.learning;

public class LamdaDataProccessing {

	public static void main(String[] args) {
		Predicate<String> p1= s-> s.length()<20;
		Predicate<String> p2= s-> s.length()>5;
		System.out.println("p1 for hello world "+p1.test("hello world"));
		
		Predicate<String> p3 =p1.and(p2);
		
		System.out.println("p3 for Good Mornning!! "+p3.test("Good Mornning!!"));
		
		Predicate<String> p4=Predicate.isEquals("yes");
		
		System.out.println("p4 for Good Mornning!! "+p4.test("Good Mornning!!"));
		System.out.println("p4 for yes "+p4.test("yes"));
		
		Predicate<Integer> p5=Predicate.isEquals(1);
		System.out.println("p5 for 2 "+p5.test(2));

	}

}
