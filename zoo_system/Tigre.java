package zoo_system;

import java.util.ArrayList;

public abstract class Tigre extends Terrestre implements PredateurAction{
	
	protected static final int maturiteSexuelle = 3;
	protected static final int esperanceVie = 20;
	
	public Tigre(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "tigre";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Boeuf");
		this.listNourritureAccepte.add("Poisson");
	}//Tigre()
	
	public String emmetreSon() {
		return "Tiiiiiiiiiiiiiigre";
	}//emmetreSon()

	public String vagabonder() {
		return "Vagabonde comme un tigre";
	}//vagabonder()
	
	public int getMaturiteSexuelle(){
		return Tigre.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	public int getEsperanceVie(){
		return Tigre.esperanceVie;
	}//getMaturiteSexuelle()

}//Tigre
