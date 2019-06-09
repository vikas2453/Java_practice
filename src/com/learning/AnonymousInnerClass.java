package com.learning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AnonymousInnerClass {
	
	int x=11;
	Customer customer1= new Customer("Ram", "Kishen", "Shamli", 22,Gender.Male);
	Customer customer2= new Customer("Sam", "Jishen", "Thamli", 20, Gender.Male);
	Customer customer3= new Customer("Tam", "Iishen", "Uhamli", 24, Gender.Male);
	Customer customer4= new Customer("Uam", "Hishen", "Vhamli", 21, Gender.Male);
	
	List<Customer> listofCustomer= new ArrayList<Customer>();
	{
		listofCustomer.add(customer1);
		listofCustomer.add(customer2);
		listofCustomer.add(customer3);
		listofCustomer.add(customer4);
	}
	
	Comparator<Customer> addressComparator = new Comparator<Customer>(){
		int x=22;
		// this is an anonymous inner class
		@Override
		public int compare(Customer o1, Customer o2) {
			System.out.println("this is an anonymous inner class with value of x as "+x);
			return o1.getAddress().compareTo(o2.getAddress());
		}
		
	};
	
	
	public Set<Customer> getOrginalSortedSet(List<Customer> listofCustomer){
		Set<Customer> orginalSet = new TreeSet<Customer>();
		orginalSet.addAll(listofCustomer);
		System.out.println("orginalSet :->"+orginalSet);
		return orginalSet;
	
	}
	
	public Set<Customer>getLastNameSortedSet(List<Customer> listofCustomer, int x) {
		// this is the example of anonymous local inner class
		System.out.println("this is an anonymous local inner class having value of x as "+x);
		Comparator<Customer> lastNameComparator = new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		};
		Set<Customer> lastNameSet = new TreeSet<Customer>(lastNameComparator);
		lastNameSet.addAll(listofCustomer);
		System.out.println("lastNameSet :->"+lastNameSet);
		return lastNameSet;
		
	}
	
	public Set<Customer>getAdressSortedSet(List<Customer> listofCustomer){
		Set<Customer> addressSortedSet = new TreeSet<Customer>(addressComparator);
		addressSortedSet.addAll(listofCustomer);
		System.out.println("addressSortedSet :->"+addressSortedSet);
		return addressSortedSet;
	}
	
	public Set<Customer>getAgeSortedSet(List<Customer> listofCustomer){
		Set<Customer> ageSortedSet = new TreeSet<Customer>(new AgeComparator()  );
		ageSortedSet.addAll(listofCustomer);
		System.out.println("ageSortedSet :->"+ageSortedSet);
		return ageSortedSet;
	}
	
	class AgeComparator implements Comparator<Customer>{
		
		int x=33;
		
		public Set<Customer>getAgeSortedSet(List<Customer> listofCustomer){
			Set<Customer> ageSortedSet = new TreeSet<Customer>(new AgeComparator()  );
			ageSortedSet.addAll(listofCustomer);
			System.out.println("ageSortedSet :->"+ageSortedSet);
			return ageSortedSet;
		}

		@Override
		public int compare(Customer o1, Customer o2) {
			
			System.out.println("this is an inner class with value of x as "+x);
			return (o1.getAge()-o2.getAge());
		}
		
	}
	
	public static void main(String[] args) {
		AnonymousInnerClass aic = new AnonymousInnerClass();
		aic.getOrginalSortedSet(aic.listofCustomer);
		aic.getAdressSortedSet(aic.listofCustomer);
		aic.getLastNameSortedSet(aic.listofCustomer, 20);
		aic.getAgeSortedSet(aic.listofCustomer);
		
	}
	
}


