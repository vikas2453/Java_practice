package com.learning;
import java.io.*;
import java.util.Arrays;

public class Course implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int courseid;
	String[]subjects= new String[5];
	public Course(String[] subjects){
		this.subjects=subjects;
	}	
}

