package code_assignment.obj;

import code_assignment.interfaces.ISpecialBird;

public class Rooster implements ISpecialBird {

	public static int fly = 0;
	public static int walk = 1;
	public static int swim = 0;
	public static int sing = 1;
	
	public  int getFly() {
		return fly;
	}

	public  void setFly(int fly) {
		Duck.fly = fly;
	}

	public  int getWalk() {
		return walk;
	}

	public  void setWalk(int walk) {
		Duck.walk = walk;
	}

	public  int getSwim() {
		return swim;
	}

	public  void setSwim(int swim) {
		Duck.swim = swim;
	}

	public  int getSing() {
		return sing;
	}

	public  void setSing(int sing) {
		Duck.sing = sing;
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Rooster walking");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("cock-a-doddle-doo");
	}

}
