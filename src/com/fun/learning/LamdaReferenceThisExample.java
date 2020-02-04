package com.fun.learning;

import java.util.function.Consumer;

public class LamdaReferenceThisExample {
	
	public void instanceMethod() {
		doProcess(10, a->{
			System.out.println("'this' inside lamda works only if it is instance method as it refer to this of actual class itself");
			System.out.println(a*2);
			System.out.println(this); 

		});
	}

	public static void main(String[] args) {
		
		LamdaReferenceThisExample lamdaReferenceThisExample = new LamdaReferenceThisExample();
		lamdaReferenceThisExample.instanceMethod();
		lamdaReferenceThisExample.doProcess(10, a->{
			System.out.println(a*2);
			System.out.println("this inside lamda would give an error if it is being called from a static method");
			//System.out.println(this); this would give compile error this doesn't work for a class in static method
		});
		
		lamdaReferenceThisExample.doProcess(10, new Consumer<Integer>(){

			@Override
			public void accept(Integer t) {
				System.out.println(t*2);
				System.out.println("this inside anonymous inner class works as this refer to the inner class itslef");
				System.out.println(this); // this 
				
			}

			
			
		});
		
	}
	

	public void doProcess(int i, Consumer<Integer> cons) {
		cons.accept(i);
	}

}
