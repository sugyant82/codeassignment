package code_assignment.abs;

import code_assignment.interfaces.IBird;
import code_assignment.obj.Duck;

public abstract class AParrot implements IBird {

	public static int fly = 1;
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
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("All kind of parrots can fly!");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("Im a default parrot..haha");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("All parrots do walk!");
	}

}
