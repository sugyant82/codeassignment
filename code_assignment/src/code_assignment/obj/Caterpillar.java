package code_assignment.obj;

import code_assignment.interfaces.IMorphicCreature;

public class Caterpillar implements IMorphicCreature {

	public static int fly = 0;
	public static int walk = 1;
	public static int swim = 0;
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
	
	public void crawl() {
		System.out.println("I have morphed into a Caterpillar. "
				+ "So I can only Crawl..(Not so Interesting lah!)");
	}
	
}
