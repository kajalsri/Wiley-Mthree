package com.kajal;


public class Clock {
	private int ch=1;
	
	synchronized void Tick(int i) {
		while(ch!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("Tick"+i+" ");
		ch=2;
		notifyAll();
	}
	synchronized  void Tack(int i) {
		while(ch!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("Tack"+i+" ");
		ch=3;
		notifyAll();
	}
	synchronized void Tock(int i) {
		while(ch!=3) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Tock"+i+" ");
		ch=1;
		notifyAll();
	}
	
}
