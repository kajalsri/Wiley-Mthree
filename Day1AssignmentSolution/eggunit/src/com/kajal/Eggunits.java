package com.kajal;

public class Eggunits {
	
	private int gross;
	private int dozens;
	private int remains;
	
	public int getGross() {
		return gross;
	}

	public void setGross(int gross) {
		this.gross = gross;
	}

	public int getDozens() {
		return dozens;
	}

	public void setDozens(int dozens) {
		this.dozens = dozens;
	}
	public int getRemains() {
		return remains;
	}

	public void setRemains(int remains) {
		this.remains = remains;
	}
	public void display() {
		System.out.println("gross eggs:- "+getGross());
		System.out.println("Dozen eggs:- "+getDozens());
		System.out.println("Remaining Eggs:- "+getRemains());
	}


	
}



