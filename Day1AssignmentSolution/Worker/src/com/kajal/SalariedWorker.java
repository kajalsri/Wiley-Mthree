package com.kajal;

public class SalariedWorker extends Worker {
	void pay(int noofhours) {
		System.out.println(this.getName());
		System.out.println(this.getSalaryrate()*noofhours);
		
	}

}
