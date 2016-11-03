package zoo_system;

public class RequinMale extends Requin implements Male<RequinFemelle>{

	private static int numPseudo = 0;
	
	public RequinMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//RequinMale()

	public String saccoupler(RequinFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler
	
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Bruce", "Enclume", "Chumi", "Thrambor", "Glunus", "Sharky", "Kremar"};
		int indice = RequinMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			RequinMale.setNumPseudo(0);
			indice = RequinMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		RequinMale.setNumPseudo(RequinMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return RequinMale.SEXE;
	}//getSexe()

	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()

	public static void setNumPseudo(int numPseudo) {
		RequinMale.numPseudo = numPseudo;
	}//setNumPseudo()

}//RequinMale
