package code_assignment.unit_tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code_assignment.Solution1;
import code_assignment.obj.Bird;

class Solution1Test {

	@Test
	void testBirdSing() {
		//fail("Not yet implemented");
		
		Bird bird = new Bird();
		
		assertEquals(Solution1.birdSing(bird),"la la la");
	}

}
