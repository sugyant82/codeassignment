package code_assignment;

import code_assignment.obj.Bird;

public class Solution1 {

	public static void main (String[] args) {

		Bird bird = new Bird();

		System.out.println(birdSing(bird));

	}

	public static String birdSing(Bird bird) {

		return bird.sings();
	}

}
