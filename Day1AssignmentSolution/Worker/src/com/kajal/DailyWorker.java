package com.kajal;

public class DailyWorker extends Worker{
	void pay(int noofdays) {
		System.out.println(this.getName());
		System.out.println(this.getSalaryrate()*noofdays);
		
	}

}
