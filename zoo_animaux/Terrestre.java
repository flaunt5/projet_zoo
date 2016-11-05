package zoo_animaux;

/**
 * Terrestre represente tout les animaux qui vivent uniquement sur la terre ferme
 * @author Alexandre
 *
 */
public abstract class Terrestre extends Animal{
	
	/**
	 * Construit un objet de type Terrestre
	 * @param poids
	 * 				Futur poids de l'animal terrestre
	 * @param taille
	 * 				Futur taille de l'animal terrestre
	 * @param age
	 * 				Futur age de l'animal terrestre
	 * @param pseudo
	 * 				Futur pseudo de l'animal terrestre
	 */
	public Terrestre(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//Terrestre()
}//Terrestre
