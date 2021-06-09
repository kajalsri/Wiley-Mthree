package com.kajal;

import java.util.Scanner;

public class Answerjob implements Runnable {
	private String[] answers= {"Blue","Yes","Java"};
	private QandA chat;
	
	
	public Answerjob(QandA chat) {
		super();
		this.chat = chat;
	}


	public void run() {
		for(String answer:answers) {
			chat.showAnswer(answer);
		}
	}

}
