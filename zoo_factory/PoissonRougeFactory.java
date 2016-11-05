package zoo_factory;

import zoo_animaux.concret.PoissonRougeFemelle;
import zoo_animaux.concret.PoissonRougeMale;

/**
 *	PoissonRougeFactory est la classe qui va permettre de créer des bébés poisson rouges males et femelles
 * @author Alexandre
 *
 */
public class PoissonRougeFactory {

	/**
	 * Creer un objet de type PoissonRougeFemelle
	 *
	 * @param poids
	 * 				Futur poids du poisson
	 * @param taille
	 * 				Futur taille du poisson
	 * @param age
	 * 				Futur age du poisson
	 * @param pseudo
	 * 				Futur pseudo du poisson
	 * @return un objet de type PoissonRougeMale
	 */
	public static PoissonRougeFemelle creerPoissonRougeFemelle(double poids, double taille, String pseudo) {
		return new PoissonRougeFemelle(poids, taille, 1, pseudo);
	}//creerPoissonRougeFemelle()
	
	/**
	 * Creer un objet de type PoissonRougeMale
	 *
	 * @param poids
	 * 				Futur poids du poisson
	 * @param taille
	 * 				Futur taille du poisson
	 * @param age
	 * 				Futur age du poisson
	 * @param pseudo
	 * 				Futur pseudo du poisson
	 * @return un objet de type PoissonRougeMale
	 */
	public static PoissonRougeMale creerPoissonRougeMale(double poids, double taille, String pseudo) {
		return new PoissonRougeMale(poids, taille, 1, pseudo);
	}//creerPoissonRougeMale()
}//PoissonRougeFactory
