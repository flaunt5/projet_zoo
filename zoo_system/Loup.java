package zoo_system;

public abstract class Loup extends Terrestre implements PredateurAction{
	
	public Loup(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
		this.nom = "loup";
	}//Loup()
	
	public String emmetreSon() {
		return "Louuuuuuuuuuuuuuuuuuup";		
	}//emmetreSon()

	public String vagabonder() {
		return "Vagabonde comme un loup";
	}//vagabonder()

}//Loup
