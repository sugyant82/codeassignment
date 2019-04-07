package code_assignment;

import code_assignment.exception.NoSuchParrotException;

public class Solution4 {

	public static void main (String[] args) {

		ParrotFactory pf= new ParrotFactory();
		
		try {
			
		System.out.println("Parrot near a dog: ");
		pf.getParrot("dogparrot").sing();
		System.out.println("----------------- ");
		
		System.out.println("Parrot near a cat: ");
		pf.getParrot("catparrot").sing();
		System.out.println("----------------- ");
		
		System.out.println("Parrot near a rooster: ");
		pf.getParrot("roosterparrot").sing();
		System.out.println("----------------- ");
		
		System.out.println("Parrot near a duck: ");
		pf.getParrot("Duckparrot").sing();
		System.out.println("----------------- ");
		
		System.out.println("Parrot near a ringing phone: ");
		pf.getParrot("phoneparrot").sing();
		System.out.println("----------------- ");
		
		System.out.println("Parrot near a stupid person: ");
		pf.getParrot("stupidparrot").sing();
		System.out.println("----------------- ");
		
		}
		
		catch(NoSuchParrotException ex) {
			ex.printStackTrace();
			ex.getMessage();
		}

		//Both chickens and roosters are special birds wich cannot Fly.

	}



}
