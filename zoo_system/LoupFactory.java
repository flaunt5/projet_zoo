package zoo_system;

public class LoupFactory {

	public static LoupMale creerLoupMale(double poids, double taille, String pseudo) {
		return new LoupMale(poids, taille, 1, pseudo);
	}//creerLoupMale()

	public static LoupFemelle creerLoupFemelle(double poids, double taille, String pseudo) {
		return new LoupFemelle(poids, taille, 1, pseudo);
	}//creerLoupFemelle()

}//LoupFactory
