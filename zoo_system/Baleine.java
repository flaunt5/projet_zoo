package zoo_system;

import java.util.ArrayList;

public abstract class Baleine extends Aquatique implements MarinAction{
	
	protected static final int maturiteSexuelle = 5;
	protected static final int esperanceVie = 80;
	
	public Baleine(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "baleine";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Poisson");
	}//Baleine()
	
	public String emmetreSon() {
		return "Baleiiiiiiiiiiiiiine";
	}//emmetreSon()

	public String nager() {
		return "Nage comme une baleine";
	}//nager()
	
	public int getMaturiteSexuelle(){
		return Baleine.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	public int getEsperanceVie(){
		return Baleine.esperanceVie;
	}//getMaturiteSexuelle()

}//Baleine
