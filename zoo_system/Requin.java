package zoo_system;

import java.util.ArrayList;

public abstract class Requin extends Aquatique implements MarinAction{
	
	protected static final int maturiteSexuelle = 4;
	protected static final int esperanceVie = 25;
	
	public Requin(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
		this.nom = "requin";
		this.listNourritureAccepte = new ArrayList<String>();
		this.listNourritureAccepte.add("Poisson");
		this.consoNourriture = 4;
	}//Requin()
	
	public String emmetreSon() {
		return "Reeeeeeeeeeeeeeeequin";
	}//emmetreSon()

	public String nager() {
		return "Nage comme un requin";
	}//nager()
	
	public int getMaturiteSexuelle(){
		return Requin.maturiteSexuelle;
	}//getMaturiteSexuelle()
	
	public int getEsperanceVie(){
		return Requin.esperanceVie;
	}//getMaturiteSexuelle()
	
	public int getConsoNourriture(){
		return this.consoNourriture;
	}//getConsoNourriture()

}//Requin
