package zoo_system;

import java.util.ArrayList;

public class Cage extends Enclos<Terrestre>{

	public Cage(String nom, int superficie, int nbAnimauxMax) {
		super(nom, superficie, nbAnimauxMax);
		this.listAnimaux = new ArrayList<Terrestre>();
	}

}
