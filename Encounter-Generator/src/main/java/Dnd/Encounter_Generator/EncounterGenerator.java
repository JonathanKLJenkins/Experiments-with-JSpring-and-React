package Dnd.Encounter_Generator;

import java.util.ArrayList;
import java.util.Random;

public abstract class EncounterGenerator {
	
	protected ArrayList<String> encounters;
	private Random rand = new Random();
	
	String getEncounter() {
		return encounters.get(rand.nextInt(encounters.size()));
	}

}
