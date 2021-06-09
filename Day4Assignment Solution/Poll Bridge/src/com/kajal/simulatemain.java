package com.kajal;

public class simulatemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simulate s=new simulate();
		Thread bridge=new Thread(new Bridge(s),"Vehicle");
		Thread poll=new Thread(new Poll(s),"Vehicle");
		
		bridge.start();
		poll.start();

	}

}
