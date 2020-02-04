package com.fun.learning;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t =new Thread(new RunnableClass(),"FromMain");
		t.setDaemon(true);
		t.start();
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This line will be printed in the last if the join is used");
		System.out.println("There will be hardly anythig after this line if the setDaemon(true) is called on the thread so as soon as main thread end, daemon threads are stopped automatically");
	}

}

class RunnableClass implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<5){
			
			Thread t =new Thread(new RunnableClass2(),"fromRun"+i);
			t.setDaemon(true);
			t.start();
			i++;
			System.out.println(Thread.currentThread().getName()+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class RunnableClass2 implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<10){
			i++;
			System.out.println(Thread.currentThread().getName()+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}