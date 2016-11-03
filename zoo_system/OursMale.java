package zoo_system;

public class OursMale extends Ours implements Male<OursFemelle>{
	
	private static int numPseudo = 0;
	
	public OursMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//OursMale()

	public String saccoupler(OursFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()
	
	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Winnie", "Nounours", "Baloo", "Ted", "Petit Jean", "Kenaï", "Pedobear"};
		int indice = OursMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			OursMale.setNumPseudo(0);
			indice = OursMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		OursMale.setNumPseudo(OursMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return OursMale.SEXE;
	}//getSexe()

	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()

	public static void setNumPseudo(int numPseudo) {
		OursMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//OursMale
