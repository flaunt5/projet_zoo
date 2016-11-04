package zoo_system;

public abstract class Aquatique extends Animal{
	
	
	/**
	 * Construit un objet de type Aquatique
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 */
	public Aquatique(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//Aquatique()
}//Aquatique
