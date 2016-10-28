package zoo_system;

public class LoupFactory {

	public static LoupMale creerLoupMale(double poids, double taille) {
		return new LoupMale(poids, taille, 1);
	}//creerLoupMale()

	public static LoupFemelle creerLoupFemelle(double poids, double taille) {
		return new LoupFemelle(poids, taille, 1);
	}//creerLoupFemelle()

}//LoupFactory
