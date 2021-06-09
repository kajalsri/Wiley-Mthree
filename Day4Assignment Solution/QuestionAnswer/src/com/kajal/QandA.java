package com.kajal;

import java.util.Scanner;

public class QandA {
	private boolean flag=true;
	Scanner sc=new Scanner(System.in);
	private String name;
	synchronized void showQuestion(String question) {
		if(flag==false) {
			try {
				wait(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" : "+question);
		flag=false;
		notify();
	}
	
	

	synchronized void showAnswer(String answer) {
		// TODO Auto-generated method stub
		if(flag==true) {
			try {
				wait(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
		
		String ans=sc.nextLine();
		if(!ans.equals(answer)) {
			System.exit(0);
		}
		else {
			flag=true;
		}
		
	}

}
