package com.learning;

public class AnonymousInnerclassCustomInterface {
	
	public int x=11;
		
	class Abc {

        public int x = 22;
        
        void methodinFirstLevel(int x) {
        	 
        	Consumer<Integer> myConsumer =new Consumer<Integer>() {

				@Override
				public int accept(int x) {
					// TODO Auto-generated method stub
					System.out.println("Value of x: "+x);
					return 2*x;
				}        		
        	};
        	myConsumer.accept(x);
        }
	}
	
	public static void main(String[] args) {
		AnonymousInnerclassCustomInterface aic=new AnonymousInnerclassCustomInterface();
		AnonymousInnerclassCustomInterface.Abc abc= aic.new Abc();
		abc.methodinFirstLevel(33);
		
	}

}
