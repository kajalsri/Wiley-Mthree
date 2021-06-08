package com.kajal;
public class Cd implements Comparable<Cd>{
	private String title;
	private String singer;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Cd(String title,String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
		public int compareTo(Cd cd2) {
			return this.singer.compareTo(cd2.singer);
		}

		
		public String toString() {
	        return "[ Song=" + title + ", Singer=" + singer +  "]";
	    }
	

}
