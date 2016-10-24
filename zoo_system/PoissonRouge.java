package zoo_system;

public abstract class PoissonRouge extends Aquatique implements MarinAction{
	
	public PoissonRouge(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
		this.nom = "poisson rouge";
	}//PoissonRouge()
	
	public String emmetreSon() {
		return "BlouBloup";
	}//emmetreSon()

	public String nager() {
		return "Nage comme un poisson rouge";
	}//nager()
}//PoissonRouge
