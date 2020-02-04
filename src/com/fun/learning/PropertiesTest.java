package com.fun.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;


public class PropertiesTest {
	public static void main(String[] args) {

		Properties prop = new Properties();
		try {
			prop.load(new FileReader(new File("xyz.txt")));
			System.out.println(prop.get("queen"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
