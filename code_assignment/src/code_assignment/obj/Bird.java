package code_assignment.obj;

import code_assignment.interfaces.IBird;

public class Bird implements IBird {

	
	public static int fly = 1;
	public static int walk = 1;
	public static int swim = 0;
	public static int sing = 1;
	
	
	public String sings() {
		// TODO Auto-generated method stub
		return "la la la";
		
	}
	
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("Im a bird. I will sing a song for you..");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

		System.out.println("Im a bird. I will walk a mile for you..");
	}
	

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Im a bird. I will fly so high for you..");
		
	}
	

	@Override
	public int getWalk() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFly() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSing() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSwim() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
