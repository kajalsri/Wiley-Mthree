package com.kajal;

import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Cd> cds=new TreeSet<Cd>();
		 Cd cd1=new Cd("BlankSpace” ","TaylorSwift");
		 Cd cd2=new Cd("Thinking Out Loud ","EdSheeran");
		 Cd cd3=new Cd("Let Her Go ","Passenger");
		 Cd cd4=new Cd("Closer "," Chainsmokers ft. Halsey");
		 cds.add(cd1);
		 cds.add(cd2);
		 cds.add(cd3);
		 cds.add(cd4);
		 Cdmain cdm=new Cdmain();
		 cdm.setCdcollection(cds);
		 cdm.display();
	}
			  
			  

		

	}


