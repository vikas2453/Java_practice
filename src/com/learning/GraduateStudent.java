package com.learning;
import java.io.*;

public class GraduateStudent extends Student implements Serializable{
	String college;
	public GraduateStudent(String college){
		this.college=college;
	}
	public GraduateStudent(String college, int studentid, String name, Course coursenrolledfor){
		super(studentid,name,coursenrolledfor );
		this.college=college;
	}
	public String toString(){
		return college+super.toString();
		
	}
	
	
}
