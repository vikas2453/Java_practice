package com.learning;

public class Customer implements Comparable<Customer> {
	String firstName;
	String lastName;
	String address;
	int age;
	Gender gender;	
	
	public Customer(String firstName, String lastName, String address, int age, Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.gender =gender;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", age=" + age
				+ ", gender=" + gender + "]";
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Customer o) {
		
		return this.firstName.compareTo(o.firstName);
	}

	public Gender getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

}
