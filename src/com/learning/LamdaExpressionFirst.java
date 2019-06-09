package com.learning;

public class LamdaExpressionFirst {
	
	interface IntegerMath{
		int operation(int a, int b);
	}
	
	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
		
	}
	@FunctionalInterface
	interface Square{
		int calculate(int x);
	}

	public static void main(String[] args) {
		IntegerMath addition= new IntegerMath() {
			public int operation(int a,  int b) {
				return a+b;
			}
		};
		IntegerMath sub=(a, b) ->a-b;
		LamdaExpressionFirst lme= new LamdaExpressionFirst();
		System.out.println(" 4+3= "+lme.operateBinary(4, 3, addition));
		System.out.println(" 4-3= "+lme.operateBinary(4, 3, sub));
		System.out.println(" 4*3= "+lme.operateBinary(4, 3, (a, b)-> a*b));
		Square s=a-> a*a;
		System.out.println(" square of 3 = "+ s.calculate(3));
		// TODO Auto-generated method stub

	}

}
