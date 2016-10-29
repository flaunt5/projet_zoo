package zoo_system;

public class AigleMale extends Aigle implements AutreMale{
	
	public AigleMale(double poids, double taille, int age){
		super(poids, taille, age);
	}//AigleMale()
	
	public void saccoupler(AutreFemelle femelle) {
		femelle.pondre();		
	}//sacoupler()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

	public char getSexe(){
		return AigleMale.SEXE;
	}//getSexe()
	
}//AigleMale
