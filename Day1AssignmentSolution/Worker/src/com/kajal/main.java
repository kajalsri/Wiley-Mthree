package com.kajal;

public class main {
	public static void main(String[] args) {
		DailyWorker dw=new DailyWorker();
		SalariedWorker sw=new SalariedWorker();
		dw.setName("ABCDEF");
		dw.setSalaryrate(20);
		sw.setSalaryrate(20);
		dw.pay(5);
		sw.pay(40);
	}

}
