package code_assignment.obj;


import code_assignment.interfaces.ISwimmingBird;

public class Duck implements ISwimmingBird{

	public static int fly = 1;
	public static int walk = 1;
	public static int swim = 1;
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
		System.out.println("Im a duck. I can flying bird");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("Quack, quack”");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("ducks walk so fast");

	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Im a duck. I can swim lah");
	}

}
