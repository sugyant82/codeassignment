package code_assignment.obj;

import code_assignment.abs.AFish;

public class Clownfish extends AFish {
	
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
	
	public void makeAJoke() {
		System.out.println("My name is Sad Fish and I have 4 feet..Haha!");
	}


}
