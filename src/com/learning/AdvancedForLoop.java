package com.learning;

import java.util.*;

public class AdvancedForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> abc= new HashSet<String>();
		abc.add("vikas");
		abc.add("Vinay");
		abc.add("ram");
		abc.add("kad");
		abc.add("roms");
		System.out.println(abc);
/*		for(String s: abc){
			abc.remove(s);
		}
		*/
		Iterator<String> it=abc.iterator();
		while(it.hasNext()){
			String s=it.next();
			if(s.equals("kad"))
				//abc.remove("kad");
			it.remove();
		}
		System.out.println(abc);

	}

}
