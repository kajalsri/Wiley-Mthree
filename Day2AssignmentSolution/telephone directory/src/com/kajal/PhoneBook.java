package com.kajal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kajal.CreateRecord;
public class PhoneBook {
	private Set<CreateRecord> directory=new TreeSet<CreateRecord>();
	
	public void setDirectory(Set<CreateRecord> directory) {
		this.directory = directory;
	}

	public void display() {
		System.out.println("Telephone Directory:");
		for(CreateRecord per:directory) {
			System.out.println(per.toString());
		}
	}
	
	
}
