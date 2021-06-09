package com.kajal;
public  class thread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<2; i++) {
			System.out.println("Current Thread ID: "+ Thread.currentThread().getId());
			System.out.println("Current Thread Name: "+ Thread.currentThread().getName());
			int priority_no=Thread.currentThread().getPriority();
			System.out.println("Priorityof thread: " + priority_no); 
			Thread.State state = Thread.currentThread().getState();  
			System.out.println("State of thread: " + state); 
			boolean str=Thread.currentThread().isAlive();
			System.out.println("Thread Alive T/F :: " + str);
			System.out.println("------------------");
			
		
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
}
	
