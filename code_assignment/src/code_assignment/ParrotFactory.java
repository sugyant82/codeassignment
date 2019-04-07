package code_assignment;

import code_assignment.abs.AParrot;
import code_assignment.exception.NoSuchParrotException;
import code_assignment.obj.CatParrot;
import code_assignment.obj.DogParrot;
import code_assignment.obj.DuckParrot;
import code_assignment.obj.RingingPhoneParrot;
import code_assignment.obj.RoosterParrot;

public class ParrotFactory {

	AParrot parrot;
	
	public AParrot getParrot(String parrotType) throws NoSuchParrotException{
		
		if (parrotType.equalsIgnoreCase("dogparrot")) {
		parrot = new DogParrot();
			
		return parrot ;
		}
		
		else if (parrotType.equalsIgnoreCase("catparrot")) {
			parrot = new CatParrot();
				
			return parrot ;
		}
		
		else if (parrotType.equalsIgnoreCase("roosterparrot")) {
			parrot = new RoosterParrot();
				
			return parrot ;
		}
		
		else if (parrotType.equalsIgnoreCase("Duckparrot")) {
			parrot = new DuckParrot();
				
			return parrot ;
		}
		
		else if (parrotType.equalsIgnoreCase("phoneparrot")) {
			parrot = new RingingPhoneParrot();
				
			return parrot ;
		}
		
		else {
			
			throw new NoSuchParrotException();
			
		}
			
			
	}
}
