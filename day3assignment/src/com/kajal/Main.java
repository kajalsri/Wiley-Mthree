package com.kajal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeImpl empl=new EmployeeImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Employee");
			System.out.println("2.Exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				try {
					System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter Age");
			int age=sc.nextInt();
					empl.addempl(new Employee(name,age));
				}
				catch (AgeUncheckedException exception) {
			System.out.println("Age not entered Correctly");}
				catch (NameUncheckedException exception) {
			System.out.println("Name duplicate");}
				catch(Exception e) {
					System.out.println("Something is wrong");
				}
				break;
				
			case 2:
				System.exit(0);
				
			}
		}
	}
}
		