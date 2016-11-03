package zoo_system;

public class AigleMale extends Aigle implements Male<AigleFemelle>{

	private static int numPseudo = 0;
	
	public AigleMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//AigleMale()
	
	public String saccoupler(AigleFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()
	
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Amadahy", "Anoki", "Kaepora", "Aranck", "Bidziil", "Chilam", "Noarfang"};
		int indice = AigleMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			AigleMale.setNumPseudo(0);
			indice = AigleMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		AigleMale.setNumPseudo(AigleMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()

	public char getSexe(){
		return AigleMale.SEXE;
	}//getSexe()

	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()

	public static void setNumPseudo(int numPseudo) {
		AigleMale.numPseudo = numPseudo;
	}//setNumPseudo()
	
}//AigleMale
