package zoo_system;

import java.util.ArrayList;

public abstract class Aigle extends Aerien implements VolantAction{
	
	protected static final int maturiteSexuelle = 4;
	protected static final int esperanceVie = 25;
	

	public Aigle(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "aigle";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Boeuf");
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 3;
	}//Aigle()
	
	public String emmetreSon() {
		return "Aiiiiiiigle";
	}//emmetreSon()

	public String voler() {
		return "Vole comme un aigle";
	}//voler()
	
	public int getMaturiteSexuelle(){
		return Aigle.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	public int getEsperanceVie(){
		return Aigle.esperanceVie;
	}//getMaturiteSexuelle()
	
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Aigle
