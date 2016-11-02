package zoo_system;

public class BaleineMale extends Baleine implements Male<BaleineFemelle>{
	
	private static int numPseudo = 0;
	
	public BaleineMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//BaleineMale()

	public String saccoupler(BaleineFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()
	
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Barbe Blanche", "Moby Dick", "Atlas", "Fliper", "Willy", "César", "Wailord"};
		int indice = BaleineMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			BaleineMale.setNumPseudo(1);
			indice = BaleineMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		BaleineMale.setNumPseudo(BaleineMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return BaleineMale.SEXE;
	}//getSexe()

	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()

	public static void setNumPseudo(int numPseudo) {
		BaleineMale.numPseudo = numPseudo;
	}//setNumPseudo()

}//BaleineMale