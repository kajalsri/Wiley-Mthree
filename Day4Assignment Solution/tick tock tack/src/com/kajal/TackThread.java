package com.kajal;


public class TackThread implements Runnable {
	private Clock clock;
	
	public TackThread(Clock c) {
		// TODO Auto-generated constructor stub
		super();
		clock=c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=60; i++) {
			clock.Tack(i);
		}
		
	}

}
