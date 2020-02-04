package com.fun.learning;

public class Subject {
	
	private String subjectName;
	private int subjectid;
	public Subject( int subjectid, String subjectName){
		this.subjectName = subjectName;
		this.subjectid = subjectid;
	}
	
	public String toString(){
		return subjectid+subjectName;
	}

}
