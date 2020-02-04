package com.fun.learning;

public class MemoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime(); 
		System.out.println("Total memory: "+(runtime.totalMemory()/(1024*1024))+"MB");
		System.out.println("Max memory: "+(runtime.maxMemory()/(1024*1024))+"MB");
		
		System.out.println("Free memory: "+(runtime.freeMemory()/(1024*1024))+"MB");
		System.out.println("Used memory:"+((runtime.totalMemory()-runtime.freeMemory())/1024)+" KB");

		//String[] abc= new String[1547246];
		String[] abc1= new String[164724799];// will be getting memory out of exception unless we increase the max heap size by java -Xms 1024m MemoryTest
		System.out.println("Total memory: "+(runtime.totalMemory()/(1024*1024))+"MB");
		System.out.println("Free memory: "+(runtime.freeMemory())+" bytes");
		System.out.println("Used memory:"+((runtime.totalMemory()-runtime.freeMemory())/(1024*1024))+" MB");
	}

}
