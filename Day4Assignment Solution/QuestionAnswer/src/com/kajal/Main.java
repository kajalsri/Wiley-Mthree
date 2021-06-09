package com.kajal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				QandA chat=new QandA();
				
				Thread t1=new Thread(new QuestionJob(chat),"Question");
				Thread t2=new Thread( new Answerjob(chat),"Answer");
				t1.start();
				t2.start();
			}

	}


