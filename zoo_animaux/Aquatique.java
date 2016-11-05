package zoo_animaux;

/**
 * Aquatique est la classe qui represente un animal capable de vivre dans l'eau
 * @author Alexandre
 *
 */
public abstract class Aquatique extends Animal{
	
	
	/**
	 * Construit un objet de type Aquatique
	 * @param poids
	 * 				Futur poids de l'animal aquatique
	 * @param taille
	 * 				Futur taille de l'animal aquatique
	 * @param age
	 * 				Futur age de l'animal aquatique
	 * @param pseudo
	 * 				Futur pseudo de l'animal aquatique
	 */
	public Aquatique(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//Aquatique()
}//Aquatique
