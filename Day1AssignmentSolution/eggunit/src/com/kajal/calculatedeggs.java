package com.kajal;
import com.kajal.Eggunits;
public class calculatedeggs {
	private int totalnumberofeggs;
	Eggunits convertedeggs=new Eggunits();
	public void setTotalnumberofeggs(int totalnumberofeggs) {
		this.totalnumberofeggs = totalnumberofeggs;
	}
	
	public Eggunits getConvertedeggs() {
		convert(totalnumberofeggs);
		return convertedeggs;
	}
	public void setConvertedeggs(Eggunits convertedeggs) {
		this.convertedeggs = convertedeggs;
	}

	
	public void convert(int totalnumberofeggs) {
		int gross = totalnumberofeggs / 144;
		int aboveGross = totalnumberofeggs % 144;
		int dozens = aboveGross / 12;
	    int remains = aboveGross % 12; 
	    convertedeggs.setGross(gross);
	    convertedeggs.setDozens(dozens);
	    convertedeggs.setRemains(remains);
	}
	

}

