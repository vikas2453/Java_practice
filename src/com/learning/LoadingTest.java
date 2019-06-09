package com.learning;


//public class LoadingTest extends Loading {
public class LoadingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// compile by E:\java_practice\loading\src\com\learning>javac *.java -d ..\..\..\bin
		//run from cmd E:\java_practice\loading\bin>java com.learning.LoadingTest
System.out.println("contoller first goes to first line of main");
Loading l;
System.out.println("class does not gets loaded simply by reference, ");
Loading.method();
l=new SubLoading();
System.out.println("please note that the initializer of the sub class is called as l is an onbject of subloading.");
//System.out.println(l.i);

	}

}
