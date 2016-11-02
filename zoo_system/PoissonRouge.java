package zoo_system;

import java.util.ArrayList;

public abstract class PoissonRouge extends Aquatique implements MarinAction{
	
	protected static final int maturiteSexuelle = 2;
	protected static final int esperanceVie = 30;
	
	public PoissonRouge(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "poisson rouge";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("NourriturePoisson");
	}//PoissonRouge()
	
	public String emmetreSon() {
		return "BlouBloup";
	}//emmetreSon()

	public String nager() {
		return "Nage comme un poisson rouge";
	}//nager()
	
	public int getMaturiteSexuelle(){
		return Requin.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	public int getEsperanceVie(){
		return Requin.esperanceVie;
	}//getMaturiteSexuelle()
}//PoissonRouge
