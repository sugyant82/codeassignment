package code_assignment;

import code_assignment.interfaces.IAnimal;
import code_assignment.obj.*;

public class AnimalCountProcessor {
	
	public static void main (String[] args) {
		
		
		IAnimal[] animals = new IAnimal[] {
				new Duck(), new Rooster(),new Dolphin()	,new RingingPhoneParrot(),
				new Shark(), new Chicken(), new Butterfly(), new Caterpillar(),
				new CatParrot(),new DogParrot(), new Clownfish(), new DogParrot(),
				new RoosterParrot()
		};
		int countWalkers = 0, countSingers =0 , countFlyers=0, countSwimmers;
		
		countWalkers = counWalkingAnimals(animals);
		System.out.println("walkers: " + countWalkers);
		
		countSingers = counSingingAnimals(animals);
		System.out.println("singers: " + countSingers);
		
		countFlyers = counFlyingAnimals(animals);
		System.out.println("flyers: " + countFlyers);
		
		countSwimmers = counSwimmingAnimals(animals);
		System.out.println("swimmers: " + countSwimmers);
		
	}
	
	
	public static int counWalkingAnimals( IAnimal[] animals) {
		
		int walkCnt =0;
	 	
		for (IAnimal iAnimal : animals) {
			walkCnt += iAnimal.getWalk();
		};
		
		return walkCnt;
	}

	public static int counSingingAnimals( IAnimal[] animals) {
		
		int singCnt =0;
	 	
		for (IAnimal iAnimal : animals) {
			singCnt += iAnimal.getSing();
		};
		
		return singCnt;
	}
	
	public static int counSwimmingAnimals( IAnimal[] animals) {
		
		int swimCnt =0;
	 	
		for (IAnimal iAnimal : animals) {
			swimCnt += iAnimal.getSwim();
		};
		
		return swimCnt;
	}
	
	public static int counFlyingAnimals( IAnimal[] animals) {
		
		int flyCnt =0;
	 	
		for (IAnimal iAnimal : animals) {
			flyCnt += iAnimal.getFly();
		};
		
		return flyCnt;
	}
	
}
