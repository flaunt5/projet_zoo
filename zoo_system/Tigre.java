package zoo_system;

public abstract class Tigre extends Terrestre implements PredateurAction{
	
	public Tigre(double poids, double taille, int age, Enclos enclosResidence){
		super(poids, taille, age, enclosResidence);
		this.nom = "tigre";
	}//Tigre()
	
	public String emmetreSon() {
		return "Tiiiiiiiiiiiiiigre";
	}//emmetreSon()

	public String vagabonder() {
		return "Vagabonde comme un tigre";
	}//vagabonder()

}//Tigre
