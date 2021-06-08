package com.kajal;

import java.util.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.kajal.CreateRecord;
import com.kajal.PhoneBook;
public class main {

	public static void main(String[] args) {
		Set<CreateRecord> persons=new TreeSet<CreateRecord>();
		CreateRecord per1=new CreateRecord("kajal","sri","1233455667");
		CreateRecord per2=new CreateRecord("yashi","sri","1233455667");
		CreateRecord per3=new CreateRecord("aman","sri","1233455667");
		CreateRecord per4=new CreateRecord("sriram","sri","1233455667");
		persons.add(per1);
		persons.add(per2);
		persons.add(per3);
		persons.add(per4);
		PhoneBook PB=new PhoneBook();
		PB.setDirectory(persons);
		PB.display();
	}

}