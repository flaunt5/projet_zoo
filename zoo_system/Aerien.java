package zoo_system;

public abstract class Aerien extends Animal{
	/**
	 * Construit un objet de type Aerien
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 */
	public Aerien(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//Aerien()
}//Aerien
