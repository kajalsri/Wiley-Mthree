package com.kajal;

public class ThreadMain {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new thread());
		Thread t2=new Thread(new thread());
		Thread t3=new Thread(new thread());
		Thread t4=new Thread(new thread());
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		
		t4.start();
		
	}
}
