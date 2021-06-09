package com.kajal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class EmployeeImpl {
	private HashMap<String,Integer> emp;
	public EmployeeImpl() {
		emp=new HashMap();
	}
	public void addempl(Employee e) {
		if(emp.containsKey(e.getName()))
			throw new NameUncheckedException("Name ALready exist");
		if(e.getAge()>60||e.getAge()<0||e.getAge()<18)
			throw new AgeUncheckedException("Age is not valid");
		emp.put(e.getName(),e.getAge());
	}
}

