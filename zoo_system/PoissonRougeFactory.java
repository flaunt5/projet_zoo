package zoo_system;

public class PoissonRougeFactory {

	public static PoissonRougeFemelle creerPoissonRougeFemelle(double poids, double taille) {
		return new PoissonRougeFemelle(poids, taille, 1);
	}//creerPoissonRougeFemelle()

	public static PoissonRougeMale creerPoissonRougeMale(double poids, double taille) {
		return new PoissonRougeMale(poids, taille, 1);
	}//creerPoissonRougeMale()
}//PoissonRougeFactory
