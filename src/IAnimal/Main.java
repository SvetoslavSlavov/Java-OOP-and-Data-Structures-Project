package IAnimal;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	
	public static void main(String[] args) {
		// Executor execute1 = new Executor();
		// execute1.AnimalHabitat();
		// execute1.AnimalSpecy();
		// execute1.AnimalType();
		
		
		
		Bear bear1 = new Bear("Grizli",20);
		Bear bear2 = new Bear("Grizli",20);
		Bear bear3 = new Bear("Grizli",20);
		Bear bear4 = new Bear("Grizli",20);
		Bear bear5 = new Bear("Grizli",20);
		
		//bear1.introduceYourself();
		bear1.introduceYourSelf();
		
		ArrayList<Bear> bearList = new ArrayList<Bear>();
		
		bearList.add(bear1);
		bearList.add(bear2);
		bearList.add(bear3);
		bearList.add(bear4);
		bearList.add(bear5);
		
		Print print1 = new Print(bearList.get(bearList.size()-1).Name,
				bearList.get(bearList.size()-1).Age,bearList);
		
		print1.printCollection();
		
		
		
		
	}
	

}
