package code_assignment;

import code_assignment.obj.Duck;

public class Solution2 {

	public static void main (String[] args) {


		AnimalFactory.getSwimmingBird("Duck").sing();

		AnimalFactory.getSwimmingBird("Duck").swim();

		AnimalFactory.getSpecialBird("Chicken").sing();

		//Chickens cannot fly..
		//AnimalFactory.getSpecialBird("Chicken").fly();



	}



}
