package com.wiley;

public class student {
	private int rollno;
	private String studname;
	private int marksineng;
	private int marksinmaths;
	private int marksinscience;
	
	public student(int rollno, String studname, int marksineng, int marksinmaths, int marksinscience) {
		super();
		this.rollno = rollno;
		this.studname = studname;
		this.marksineng = marksineng;
		this.marksinmaths = marksinmaths;
		this.marksinscience = marksinscience;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public int getMarksineng() {
		return marksineng;
	}
	public void setMarksineng(int marksineng) {
		this.marksineng = marksineng;
	}
	public int getMarksinmaths() {
		return marksinmaths;
	}
	public void setMarksinmaths(int marksinmaths) {
		this.marksinmaths = marksinmaths;
	}
	public int getMarksinscience() {
		return marksinscience;
	}
	public void setMarksinscience(int marksinscience) {
		this.marksinscience = marksinscience;
	}

}