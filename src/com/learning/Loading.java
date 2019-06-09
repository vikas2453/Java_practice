package com.learning;

public class Loading {

	/**
	 * @param args
	 */
	int p=110;
	static int q;
	int i=initialiser();
	{
		System.out.println("non static block of loading");
	}
	public static void method(){
		System.out.println("Class are loaded by JVM when either the class are instantiated or any static method needs to be excuted.");
	}
	public int initialiser(){
		System.out.println("initializer of the super class" );
		return p;
		
	}
	static{
		q=1315;
	System.out.println("super class is being loaded at the moment");
	}
	public Loading(){
		System.out.println("super Construtor getting executed");
	}
}

class SubLoading extends Loading{
	static{
	System.out.println("sub class being loaded");
	}
	int p=90;
	public int initialiser(){
		System.out.println("initializer of the sub class" +Loading.q);
		return p;
		
	}
	
	public SubLoading(){
		System.out.println("Sub class constuctor");
	}
}