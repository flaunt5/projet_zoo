package zoo_system;

import java.util.ArrayList;

public class Cage extends Enclos<Terrestre>{

	/**
	 * Construit un bojet de type Cage
	 * @param nom
	 * 			Nom de l'aquarium
	 * @param superficie
	 * 			Superficie de l'aquarium
	 * @param nbAnimauxMax
	 * 			Nombre maximum d'animux de l'aquarium
	 */
	public Cage(String nom, int superficie, int nbAnimauxMax) {
		super(nom, superficie, nbAnimauxMax);
		this.listAnimaux = new ArrayList<Terrestre>();
	}

}
