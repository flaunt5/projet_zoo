package zoo_system;

public class PingouinMale extends Pingouin implements Male<PingouinFemelle>{

	private static int numPseudo = 0;
	
	public PingouinMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//PinguoinMale()

	public String saccoupler(PingouinFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()

	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Skipper", "Kowalski", "Soldat", "Rico", "Cobblepot", "Pingou", "Tiplouf"};
		int indice = PingouinMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			PingouinMale.setNumPseudo(0);
			indice = PingouinMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		PingouinMale.setNumPseudo(PingouinMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return PingouinMale.SEXE;
	}//getSexe()

	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()

	public static void setNumPseudo(int numPseudo) {
		PingouinMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//PingouinMale
