package com.fun.learning;
import java.util.Arrays;

public class Student{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int studentid;
	String name;
	Course coursenrolledfor;
	public Student(int studentid, String name, Course coursenrolledfor ){
		this.studentid = studentid;
		this.name=name;
		this.coursenrolledfor = coursenrolledfor;
	}
	public Student(){		
		this(10,"Vansh",new Course(new String[]{"a,","b","c","d","e"}));
	}
	public String toString(){
		 return(studentid+name+Arrays.toString(coursenrolledfor.subjects));
		}
	
}

