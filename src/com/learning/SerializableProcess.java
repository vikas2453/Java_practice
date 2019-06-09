package com.learning;
import java.io.*;

public class SerializableProcess {
	public static void writeData(String file, Object o) throws IOException{
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(o);		
		fos.close();
	}
	public static Object readData(String file) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois =new ObjectInputStream(fis);
		Object o =ois.readObject();	
		return o;
		
	}

}
