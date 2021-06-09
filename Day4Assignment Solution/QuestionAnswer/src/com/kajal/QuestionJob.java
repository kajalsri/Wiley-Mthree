package com.kajal;

public class QuestionJob implements Runnable {
	private String[] ques= {"What is the color of sky","Does Java Support multithreading",
			"What is my name"};
	private QandA chat;
	
	public QuestionJob(QandA chat) {
		super();
		this.chat=chat;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(String q:ques) {
			chat.showQuestion(q);
		}
		
	}
}
	