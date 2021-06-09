package com.kajal;

public class Eggmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hens h=new Hens();
		Thread t1=new Thread(h);
		t1.start();

	}

}
