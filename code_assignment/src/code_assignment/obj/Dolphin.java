package code_assignment.obj;

import code_assignment.interfaces.ISwimmingAnimal;

public class Dolphin implements ISwimmingAnimal {

	public static int fly = 0;
	public static int walk = 0;
	public static int swim = 1;
	public static int sing = 0;
	
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
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Im Dolphin, the most unique animal that can swim!");
	}

}
