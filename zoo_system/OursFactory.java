package zoo_system;

public class OursFactory {

	public static OursMale creerOursMale(double poids, double taille) {
		return new OursMale(poids, taille, 1);
	}//creerOursMale()

	public static OursFemelle creerOursFemelle(double poids, double taille) {
		return new OursFemelle(poids, taille, 1);
	}//creerOursFemelle()
}//OursFactory
