package com.kajal;
import java.util.Scanner;
import com.kajal.Eggunits;
import com.kajal.calculatedeggs;
public class main {
	public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int totalnumberofeggs=sc.nextInt();
			calculatedeggs c=new calculatedeggs();
			c.setTotalnumberofeggs(totalnumberofeggs);
			Eggunits e=c.getConvertedeggs();
			
			e.display();
			
		}

	}

