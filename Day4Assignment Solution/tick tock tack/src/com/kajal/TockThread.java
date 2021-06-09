package com.kajal;


public class TockThread implements Runnable {
	private Clock clock;
	

	public TockThread(Clock c) {
		// TODO Auto-generated constructor stub
		super();
		clock=c;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=60; i++) {
			clock.Tock(i);
		}
		
	}

}
