package com.learning;
import java.io.*;

public class Hello {
	public static void main(String[] Args){
	try{
	FileReader fr =new FileReader("Abc.txt");
	BufferedReader br=new BufferedReader(fr);
	FileWriter fw=new FileWriter("printWriter.txt");
	FileOutputStream fos =new FileOutputStream("fos.txt");
	InputStreamReader isr =new InputStreamReader(System.in);
	//BufferedReader br=new BufferedReader(isr);
	OutputStreamWriter osw =new OutputStreamWriter(System.out);
	PrintWriter pw=new PrintWriter(fw);
	/*int i=0;
	while((i=fr.read())!=-1){*/
	String line;
	while((line=br.readLine())!=null){
		fw.write(line);
		osw.write(line);
		System.out.println(line);		
		pw.println(line);
	}
	fw.flush();
	fw.close();
	int i=0;
	while((i=isr.read())!=-1){
		fos.write(i);
	}
	
	br.close();
	}catch(Exception e){
		System.out.println();
		
	}
	
	System.out.println("done");
	}

}
