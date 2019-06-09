package com.learning;

interface MyConsumer<T>{
	public int accept (int x);
}

public class LambdaExpressionScope {
	
	public int x=11;
	
	class Abc {

        public int x = 22;
        
        //void methodinFirstLevel(int x) { using variable with name x will give error for Lamda expression
        // 
        void methodinFirstLevel(int c) {
        	 
        	Consumer<Integer> myConsumer = x ->{
        		System.out.println(x);
        		System.out.println( "value of x is :"+x);
        		return 2*x;
        	};
        	myConsumer.accept(c);

        }
	}
	
	public static void main(String[] args) {
		LambdaExpressionScope aic=new LambdaExpressionScope();
		LambdaExpressionScope.Abc abc= aic.new Abc();
		abc.methodinFirstLevel(33);
		
	}


}
