package zoo_system;

import java.util.ArrayList;

public abstract class Loup extends Terrestre implements PredateurAction{
	
	protected static final int maturiteSexuelle = 2;
	protected static final int esperanceVie = 15;
	
	public Loup(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "loup";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Boeuf");
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 3;
	}//Loup()
	
	public String emmetreSon() {
		return "Louuuuuuuuuuuuuuuuuuup";		
	}//emmetreSon()

	public String vagabonder() {
		return "Vagabonde comme un loup";
	}//vagabonder()
	
	public int getMaturiteSexuelle(){
		return Loup.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	public int getEsperanceVie(){
		return Loup.esperanceVie;
	}//getMaturiteSexuelle()
	
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Loup
