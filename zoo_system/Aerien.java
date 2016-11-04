package zoo_system;

public abstract class Aerien extends Animal{
	/**
	 * Construit un objet de type Aerien
	 * @param poids
	 * 				Futur poids de l'animal aerien
	 * @param taille
	 * 				Futur taille de l'animal aerien
	 * @param age
	 * 				Futur age de l'animal aerien
	 * @param pseudo
	 * 				Futur pseudo de l'animal aerien
	 */
	public Aerien(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//Aerien()
}//Aerien
