package com.kajal;


public class TickThread implements Runnable {
	private Clock clock;
	public TickThread(Clock c) {
		super();
		clock=c;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=60; i++) {
			clock.Tick(i);
		}
		
	}

}
