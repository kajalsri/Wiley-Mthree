package com.kajal;

public class Hens implements Runnable{
	private int laid =1;
	private int gained=0;
	public void laideggs() {
		System.out.println("Hen laid eggs - " +laid);
		laid++;
	}
	public void gained() {
		gained+=2;
		System.out.println("Owner gained Rs" +gained);
	}
	public void run() {
		// TODO Auto-generated method stub
		while(gained!=100) {
			laideggs();
			gained();
		}
		
	}
	

}
