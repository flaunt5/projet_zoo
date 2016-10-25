package zoo_system;

public abstract class Requin extends Aquatique implements MarinAction{
	
	public Requin(double poids, double taille, int age){
		super(poids, taille, age);
		this.nom = "requin";
	}//Requin()
	
	public String emmetreSon() {
		return "Reeeeeeeeeeeeeeeequin";
	}//emmetreSon()

	public String nager() {
		return "Nage comme un requin";
	}//nager()

}//Requin
