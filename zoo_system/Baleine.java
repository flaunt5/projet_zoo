package zoo_system;

public abstract class Baleine extends Aquatique implements MarinAction{
	
	public Baleine(double poids, double taille, int age){
		super(poids, taille, age);
		this.nom = "baleine";
	}//Baleine()
	
	public String emmetreSon() {
		return "Baleiiiiiiiiiiiiiine";
	}//emmetreSon()

	public String nager() {
		return "Nage comme une baleine";
	}//nager()

}//Baleine
