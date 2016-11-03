package zoo_system;

public class PoissonRougeMale extends PoissonRouge implements Male<PoissonRougeFemelle>{

	private static int numPseudo = 0;
	
	public PoissonRougeMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//PoissonRougeMale()

	public String saccoupler(PoissonRougeFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler
	
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Nemo", "Marin", "Bubbles", "Boule", "Gargouille", "Blenny", "Gill"};
		int indice = PoissonRougeMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			PoissonRougeMale.setNumPseudo(0);
			indice = PoissonRougeMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		PoissonRougeMale.setNumPseudo(PoissonRougeMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return PoissonRougeMale.SEXE;
	}//getSexe()

	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()

	public static void setNumPseudo(int numPseudo) {
		PoissonRougeMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//PoissonRougeMale
