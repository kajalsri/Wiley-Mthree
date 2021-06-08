package com.kajal;
import com.kajal.Cd;
import java.util.Set;
import java.util.TreeSet;

public class Cdmain {
		private Set<Cd> cdcollection=new TreeSet<Cd>();

		
		public Set<Cd> getCdcollection() {
			return cdcollection;
		}


		public void setCdcollection(Set<Cd> cdcollection) {
			this.cdcollection = cdcollection;
		}


		public void display() {
			System.out.println("Sorted details:");
			for(Cd cd:cdcollection) {
				System.out.println(cd.toString());
			}
		}

}
