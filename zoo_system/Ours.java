package zoo_system;

import java.util.ArrayList;

public abstract class Ours extends Terrestre{
	
	protected static final int maturiteSexuelle = 4;
	protected static final int esperanceVie = 25;
	
	public Ours(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "ours";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Boeuf");
		this.listNourritureAccepte.add("Poisson");
	}//Ours()
	
	public String emmetreSon() {
		return "Grrrrrrrrrrrrrrrrrrrr";
	}//emmetreSon()
	
	public int getMaturiteSexuelle(){
		return Ours.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	public int getEsperanceVie(){
		return Ours.esperanceVie;
	}//getMaturiteSexuelle()
}//Ours
