package com.fun.learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduction {
	public static void main(String[] args) {
		List<Integer> ints=Arrays.asList(0, 1, 2, 3, 4, 5, 6,7,8,9);
		List<Integer> ints1=Arrays.asList(0, 1, 2, 3, 4, 5);
		List<Integer> ints2=Arrays.asList(6,7,8, 9);
		
		BinaryOperator<Integer> op=(i1, i2)->i1+i2;
		BinaryOperator<Integer> op1=(i1, i2)->Integer.max(i1, i2);
		BinaryOperator<Integer> op2=(i1, i2)->(i1+i2)*(i1+i2);//non associative function
		BinaryOperator<Integer> op3=(i1, i2)->(i1+i2)/2;//non associative function
		
		System.out.println("performing associative operation i.e. add in Parallel will breing the same result");
		
		int reduction=reduce(ints, 0, op);
		System.out.println("sum--> "+ reduction);
				
		int reduction1=reduce(ints1, 0, op);
		int reduction2=reduce(ints2, 0, op);
		reduction=reduce(Arrays.asList(reduction1,reduction2), 0, op);		
		System.out.println("sum--> "+ reduction);
		
		
		System.out.println("performing another associative operation i.e. finding max value in Parallel will bring the same result");
		
		reduction=reduce(ints, 0, op1);
		System.out.println("Max--> "+ reduction);
		
		 reduction1=reduce(ints1, 0, op1);
		 reduction2=reduce(ints2, 0, op1);
		reduction=reduce(Arrays.asList(reduction1,reduction2), 0, op1);		
		System.out.println("Max--> "+ reduction);
		
		System.out.println("performing non associative operation i.e. Square of sum in Parallel will bring different results");
		reduction=reduce(ints, 0, op2);
		System.out.println("Square of sum --> "+ reduction);
		
		 reduction1=reduce(ints1, 0, op2);
		 reduction2=reduce(ints2, 0, op2);
		reduction=reduce(Arrays.asList(reduction1,reduction2), 0, op2);		
		System.out.println("Square of sum--> "+ reduction);
		
		
		System.out.println("performing another non associative operation i.e. average of 2numbers in Parallel will bring different results");
		reduction=reduce(ints, 0, op3);
		System.out.println("average of 2numbers  --> "+ reduction);
		
		 reduction1=reduce(ints1, 0, op3);
		 reduction2=reduce(ints2, 0, op3);
		reduction=reduce(Arrays.asList(reduction1,reduction2), 0, op3);		
		System.out.println("average of 2numbers --> "+ reduction);
		
		System.out.println("identity is also important like 0 can be identity for max operation for positive number but not for the list in the negative numbes");		
		reduction=reduce(Arrays.asList(-2, -3, -4, -7, -8), 0, op1);
		System.out.println("Max--> "+ reduction);
	}

	private static int reduce(List<Integer> ints, int identity, BinaryOperator<Integer> op) {		
		for(Integer i: ints) {			
				identity=op.apply(identity, i);				
		}
		return identity;		
	}
}
