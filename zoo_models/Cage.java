package zoo_models;

import java.util.ArrayList;

import zoo_animaux.Terrestre;

public class Cage extends Enclos<Terrestre>{

	/**
	 * Construit un objet de type Cage
	 * @param nom
	 * 			Nom de la cage
	 * @param superficie
	 * 			Superficie de la cage
	 * @param nbAnimauxMax
	 * 			Nombre maximum d'animux de la cage
	 */
	public Cage(String nom, int superficie, int nbAnimauxMax) {
		super(nom, superficie, nbAnimauxMax);
		this.listAnimaux = new ArrayList<Terrestre>();
	}

}
