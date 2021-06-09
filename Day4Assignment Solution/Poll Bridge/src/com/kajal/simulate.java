package com.kajal;

public class simulate {
	private boolean flag=true;
	synchronized void bridge(int i) {
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" "+i+" "+"passed the Bridge");
		flag=false;
		notify();
	
	}
	synchronized void tollplaza(int i) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" "+i+" "+"passed the Poll");
		flag=true;
		notify();
	
	}

}
