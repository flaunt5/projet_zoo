package zoo_system;

public class LoupMale extends Loup implements Male<LoupFemelle>{

	private static int numPseudo = 0;
	
	public LoupMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//LoupMale()

	public String saccoupler(LoupFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()

	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Vent Gris", "Wolf Link", "Eté", "Fantôme", "Broussaille", "Akela", "Wolf O'Donnell"};
		int indice = LoupMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			LoupMale.setNumPseudo(1);
			indice = LoupMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		LoupMale.setNumPseudo(LoupMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return LoupMale.SEXE;
	}//getSexe()
	
	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()

	public static void setNumPseudo(int numPseudo) {
		LoupMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//LoupMale
