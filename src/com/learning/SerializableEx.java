package com.learning;
import java.io.*;
import java.util.Arrays;

public class SerializableEx implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Student s;
	transient Product p;
	public SerializableEx(Student s){
		this.s=s;
	}
	public SerializableEx(Student s,Product p){
		this.s=s;
		this.p=p;
	}
	public String toString(){
		if(p!=null)
	 return(p.name+s.toString());		
		else
			return s.toString();
	}

}




