package com.learning;
import java.util.*;

public class HashMapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> hs=new HashMap<>(10);
		hs.put("my son", "Vansh");
		hs.put("my mis****", null);
		hs.put(null, "value");
		hs.put(null, "value2");
		// Map stores null keys at index 0
		System.out.println("********Map stores null keys at index 0******");
		hs.put("my mom","Kamal");
		hs.put("my brother", "Vikrant");
		Iterator it= hs.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pairs=(Map.Entry)it.next();
			System.out.print(pairs.getKey()+" - "+pairs.getValue()+"\t");
		}
		System.out.print("\n*********iterating through values******\n");
		
		for(String s: hs.values()) {
			System.out.print(s+"\t");
		}
		System.out.print("\n*********iterating using java 8 Stream******\n");
		hs.entrySet().stream().forEach(System.out::println);
		
		System.out.print("\n*********HashTable doesn't allow entry of even null values*********\n");
		Hashtable ht=new Hashtable(); 
		ht.put("a","1"); 
		ht.put("b","2"); 
		ht.put("c","3"); 
		//ht.put("d",null);		
		ht.put("f","6"); 
		Enumeration it2 = ht.elements(); 
		ht.put("g","7"); 
		while(it2.hasMoreElements()){
			System.out.print(it2.nextElement()+"\t");
		}

	}

}
