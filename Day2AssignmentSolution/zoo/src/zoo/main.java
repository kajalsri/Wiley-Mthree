package zoo;

import java.util.*;
import org.animals.*;
public class main {


		public static void main(String[] args) {
			
			List<Animal> animalsList=new ArrayList<Animal>();
			Animal lion1=new Lion("Lion","orange",120,100);
			Animal lion2=new Lion("Lion","red orange",130,11);
			Animal tiger1=new Tiger("Tiger","white",190,17);
			Animal tiger2=new Tiger("Tiger","black",160,15);
			
			Animal monkey2=new Monkey("Monkey","greenish",45,28);
			Animal elephant1=new Elephant("Elephant","Grey",500,35);
			
			animalsList.add(lion1);
			animalsList.add(lion2);
			animalsList.add(tiger1);
			animalsList.add(tiger2);
			
			animalsList.add(monkey2);
			animalsList.add(elephant1);
	
			VandalurZoo zoo=new VandalurZoo();
			zoo.setAnimalsInZoo(animalsList);
			zoo.display();
		}

	}


