package a.b;

import java.util.Arrays;

public class ShallowClone implements Cloneable{
	
	public String name;
	public Subject[] subjects;
	
	public ShallowClone(String name, Subject[] subjects){
		this.name=name;
		this.subjects=subjects;
	}
	
	public ShallowClone clone(){
		try {
			return (ShallowClone) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("this line will be printed if we remove the implement cloneable and try to clone the object of this class");
		}
		return null;
	}
	public String toString(){
		return name+Arrays.toString(subjects);
	}

}
