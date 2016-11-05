package zoo_factory;

import zoo_animaux.concret.LoupFemelle;
import zoo_animaux.concret.LoupMale;

/**
 *	LoupFactory est la classe qui va permettre de créer des bébés loups males et femelles
 * @author Alexandre
 *
 */
public class LoupFactory {

	/**
	 * Creer un objet de type LoupMale
	 *
	 * @param poids
	 * 				Futur poids du loup
	 * @param taille
	 * 				Futur taille du loup
	 * @param age
	 * 				Futur age du loup
	 * @param pseudo
	 * 				Futur pseudo du loup
	 * @return un objet de type LoupMale
	 */
	public static LoupMale creerLoupMale(double poids, double taille, String pseudo) {
		return new LoupMale(poids, taille, 1, pseudo);
	}//creerLoupMale()

	
	/**
	 * Creer un objet de type LoupFemelle
	 *
	 * @param poids
	 * 				Futur poids du loup
	 * @param taille
	 * 				Futur taille du loup
	 * @param age
	 * 				Futur age du loup
	 * @param pseudo
	 * 				Futur pseudo du loup
	 * @return un objet de type LoupFemelle
	 */
	public static LoupFemelle creerLoupFemelle(double poids, double taille, String pseudo) {
		return new LoupFemelle(poids, taille, 1, pseudo);
	}//creerLoupFemelle()

}//LoupFactory
