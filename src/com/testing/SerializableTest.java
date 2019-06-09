package com.testing;
import com.learning.*;

import java.io.IOException;

public class SerializableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//E:\java_practice\SerializableEx>javac  -d bin src\com\learning\*.java
		//E:\java_practice\SerializableEx\bin>jar cmf MANIFEST.txt ser2.jar com
		// run the jar by E:\java_practice\SerializableEx\bin>java -jar ser2.jar
		String[]subjects={"hindi","english","sceince", "Arts","maths"};
		Course c=new Course(subjects);
		Student s =new GraduateStudent("PCCS",1,"vikas",c);
		Product p=new Product("computer");
		System.out.println("object before writing  >>>  "+s.toString());
		SerializableEx se =new SerializableEx(s,p);
		try {
			SerializableProcess.writeData("object.txt", se);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SerializableEx se1;
		try {
			se1=(SerializableEx)SerializableProcess.readData("object.txt");
			System.out.println(se1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}