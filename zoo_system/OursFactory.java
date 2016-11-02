package zoo_system;

public class OursFactory {

	public static OursMale creerOursMale(double poids, double taille, String pseudo) {
		return new OursMale(poids, taille, 1, pseudo);
	}//creerOursMale()

	public static OursFemelle creerOursFemelle(double poids, double taille, String pseudo) {
		return new OursFemelle(poids, taille, 1, pseudo);
	}//creerOursFemelle()
}//OursFactory
