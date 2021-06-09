package com.kajal;

public class Poll implements Runnable{
	private simulate s;

	public Poll(simulate s ) {
		super();
		// TODO Auto-generated constructor stub
		this.s=s;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub\
		for(int i=1;i<=5;i++) {
			s.tollplaza(i);
		}
		
	}

}