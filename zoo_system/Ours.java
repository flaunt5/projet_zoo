package zoo_system;

public abstract class Ours extends Terrestre{
	
	public Ours(double poids, double taille, int age){
		super(poids, taille, age);
		this.nom = "ours";
	}//Ours()
	
	public String emmetreSon() {
		return "Grrrrrrrrrrrrrrrrrrrr";
	}//emmetreSon()
}//Ours
