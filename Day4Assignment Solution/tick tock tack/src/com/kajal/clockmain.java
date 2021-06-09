package com.kajal;

public class clockmain {
	public static void main(String[] args) {
		Clock clock=new Clock();
		Thread tick=new Thread(new TickThread(clock));
		Thread tack=new Thread(new TackThread(clock));
		Thread tock=new Thread(new TockThread(clock));
		
		
		tick.start();
		tack.start();
		tock.start();
	}

}
