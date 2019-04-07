package code_assignment;

import code_assignment.interfaces.IMorphicCreature;
import code_assignment.obj.Butterfly;
import code_assignment.obj.Caterpillar;

public class ButterflyCatterpillarBuilder {

	IMorphicCreature morphicAnimal ;
	
	public IMorphicCreature buildMeAButterfly() {
		
		morphicAnimal = new Butterfly();
		return morphicAnimal;
		
	}
	
	public IMorphicCreature buildMeACaterpillar() {
		
		morphicAnimal = new Caterpillar();
		return morphicAnimal;
	}
}
