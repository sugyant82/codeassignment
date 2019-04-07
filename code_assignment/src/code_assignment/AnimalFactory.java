package code_assignment;


import code_assignment.interfaces.IBird;
import code_assignment.interfaces.ISpecialBird;
import code_assignment.interfaces.ISwimmingBird;
import code_assignment.obj.CatParrot;
import code_assignment.obj.Chicken;
import code_assignment.obj.DogParrot;
import code_assignment.obj.Duck;
import code_assignment.obj.Rooster;

public class AnimalFactory {


	
	public static ISwimmingBird getSwimmingBird(String animal_name) {

		if (animal_name.equalsIgnoreCase("Duck")) {
			return new Duck();
		}

		return null;
	}

	public static ISpecialBird getSpecialBird(String animal_name) {

		if (animal_name.equalsIgnoreCase("Chicken")) {
			return new Chicken();
		}

		if (animal_name.equalsIgnoreCase("Rooster")) {
			return new Rooster();
		}


		return null;
	}
	
	public static IBird getNormlBirds(String animal_name) {

		if (animal_name.equalsIgnoreCase("DogParrot")) {
			return new DogParrot();
		}

		if (animal_name.equalsIgnoreCase("CatParrot")) {
			return new CatParrot();
		}


		return null;
	}

}
