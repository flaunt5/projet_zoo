package zoo_system;

public class PoissonRougeFactory {

	public static PoissonRougeFemelle creerPoissonRougeFemelle(double poids, double taille, String pseudo) {
		return new PoissonRougeFemelle(poids, taille, 1, pseudo);
	}//creerPoissonRougeFemelle()

	public static PoissonRougeMale creerPoissonRougeMale(double poids, double taille, String pseudo) {
		return new PoissonRougeMale(poids, taille, 1, pseudo);
	}//creerPoissonRougeMale()
}//PoissonRougeFactory
