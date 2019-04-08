package code_assignment;

import code_assignment.abs.AFish;
import code_assignment.obj.Fish;

public class Solution5 {

	public static void main (String[] args) {

		AFish af= new Fish();
		
		try {
			
		System.out.println("Im a generic fish: ");
		af.swim();
		System.out.println("----------------- ");
		
		
		
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
			ex.getMessage();
		}

		//Both chickens and roosters are special birds wich cannot Fly.

	}



}
