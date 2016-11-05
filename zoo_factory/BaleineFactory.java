package zoo_factory;

import zoo_animaux.concret.BaleineFemelle;
import zoo_animaux.concret.BaleineMale;

/**
 *	BaleineFactory est la classe qui va permettre de créer des bébés baleines males et femelles
 * @author Alexandre
 *
 */
public class BaleineFactory {
	
	/**
	 * Creer un objet de type BaleineFemmelle
	 *
	 * @param poids
	 * 				Futur poids de la baleine
	 * @param taille
	 * 				Futur taille de la baleine
	 * @param age
	 * 				Futur age de la baleine
	 * @param pseudo
	 * 				Futur pseudo de la baleine
	 * @return un objet de type BaleineFemelle
	 */
	public static BaleineMale creerBaleineMale(double poids, double taille, String pseudo) {
		return new BaleineMale(poids, taille, 1, pseudo);
	}//creerBaleineMale()
	
	/**
	 * Creer un objet de type BaleineFemmelle
	 *
	 * @param poids
	 * 				Futur poids de la baleine
	 * @param taille
	 * 				Futur taille de la baleine
	 * @param age
	 * 				Futur age de la baleine
	 * @param pseudo
	 * 				Futur pseudo de la baleine
	 * @return un objet de type BaleineFemelle
	 */
	public static BaleineFemelle creerBaleineFemelle(double poids, double taille, String pseudo) {
		return new BaleineFemelle(poids, taille, 1, pseudo);
	}//creerBaleineFemelle()
}//BaleineFactory
