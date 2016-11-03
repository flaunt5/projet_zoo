package zoo_system;

import java.util.ArrayList;

public abstract class Pingouin extends Aquatique implements MarinAction, VolantAction{
	
	protected static final int maturiteSexuelle = 4;
	protected static final int esperanceVie = 20;
	
	public Pingouin(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "pingouin";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 2;
	}//Pinguoin()
	
	public String emmetreSon() {
		return "NUTNUT";
	}//emmetreSon()

	public String voler() {
		return "Vole comme un pinguoin";
	}//voler()

	public String nager() {
		return "Nage comme un pinguoin";
	}//nager()
	
	public int getMaturiteSexuelle(){
		return Pingouin.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	public int getEsperanceVie(){
		return Pingouin.esperanceVie;
	}//getMaturiteSexuelle()
	
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()
}//Pingouin
