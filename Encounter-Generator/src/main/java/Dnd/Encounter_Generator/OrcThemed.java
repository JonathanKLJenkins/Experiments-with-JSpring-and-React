package Dnd.Encounter_Generator;

import java.util.ArrayList;

public class OrcThemed extends EncounterGenerator {
	
	private final String solo = "You encounter one Orc.";
	
	public OrcThemed() {
		encounters = new ArrayList<String>();
		encounters.add(solo);
	}

}
