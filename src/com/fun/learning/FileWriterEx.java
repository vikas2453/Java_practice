package com.fun.learning;
import java.util.HashMap;
import java.util.Map;

public class FileWriterEx {
	public static void main(String[] Args){
		 int[] arr= {6, 1, 3, 46, 1, 	3, 9};
		int n= numberOfPairs(arr, 47);
		System.out.println(n);
	/*try{
	FileReader fr =new FileReader("Abc.txt");
	BufferedReader br=new BufferedReader(fr);
	FileWriter fw=new FileWriter("printWriter.txt");
	FileOutputStream fos =new FileOutputStream("fos.txt");
	InputStreamReader isr =new InputStreamReader(System.in);
	//BufferedReader br=new BufferedReader(isr);
	OutputStreamWriter osw =new OutputStreamWriter(System.out);
	PrintWriter pw=new PrintWriter(fw);
	int i=0;
	while((i=fr.read())!=-1){
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
	
	System.out.println("done");*/
	}
	
	public static int numberOfPairs(int[] a, long k) {
		int distinctpair=0;
		Map<Integer, Integer>pairs= new HashMap<Integer, Integer>();
		for( int i=0; i<a.length;i++) {
			for( int j=i+1; j<a.length; j++) {
				if(a[i]+a[j]==k) {
					if(!pairs.containsKey(a[i])) {
						pairs.put(a[i], a[j]);
						pairs.put(a[j], a[i]);
						distinctpair++;
					}					
					
				}
			}
			
		}
		
		return distinctpair;
       

    }
    

}
