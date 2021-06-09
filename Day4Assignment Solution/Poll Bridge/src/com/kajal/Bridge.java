package com.kajal;

public class Bridge implements Runnable{
	private simulate s;

	public Bridge(simulate s) {
		super();
		// TODO Auto-generated constructor stub
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			s.bridge(i);
		}
		
	}
	

}
