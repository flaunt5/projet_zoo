package zoo_system;

public abstract class PoissonRouge extends Aquatique implements MarinAction{
	
	protected static final int maturiteSexuelle = 2;
	
	public PoissonRouge(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "poisson rouge";
	}//PoissonRouge()
	
	public String emmetreSon() {
		return "BlouBloup";
	}//emmetreSon()

	public String nager() {
		return "Nage comme un poisson rouge";
	}//nager()
	
	public int getMaturiteSexuelle(){
		return maturiteSexuelle;
	}//getMaturiteSexuelle()
}//PoissonRouge
