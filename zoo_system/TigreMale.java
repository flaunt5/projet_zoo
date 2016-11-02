package zoo_system;

public class TigreMale extends Tigre implements Male<TigreFemelle>{
	
	private static int numPseudo = 0;
	
	public TigreMale(double poids, double taille, int age, String pseudo){
		super(poids, taille, age, pseudo);
	}//TigreMale()
	
	public String saccoupler(TigreFemelle femelle) {
		String retour = this.emmetreSon() + "\n";
		femelle.setEnceinte(true);
		retour += femelle.getPseudo() + "(" + femelle.getNom() + ", " + femelle.getSexe() + ") à été fecondé par "  
					+	this.getPseudo() + "(" + femelle.getNom() + ", " + this.getSexe() + ")\n";
		return 	retour;
	}//sacoupler()

	public static String getPseudoAnimal(){
		String[] tabPseudo = {"Tigrou", "Shere Khan", "Rajah", "Oliver", "Garfield", "Tiger", "Simba"};
		int indice = TigreMale.getNumPseudo();
		if(indice > (tabPseudo.length - 1)){
			TigreMale.setNumPseudo(1);
			indice = TigreMale.getNumPseudo();
		}
		String pseudo = tabPseudo[indice];
		TigreMale.setNumPseudo(TigreMale.getNumPseudo() + 1);
		return pseudo;
	}//getPseudoAnimal()
	
	public String toString(){
		return super.toString() + "\t" + "Sexe : " + Male.SEXE + " ; Enclos residence : " + enclosResidence.getNom();
	}//toString()
	
	public char getSexe(){
		return TigreMale.SEXE;
	}//getSexe()

	public static int getNumPseudo() {
		return numPseudo;
	}//getNumPseudo()

	public static void setNumPseudo(int numPseudo) {
		TigreMale.numPseudo = numPseudo;
	}//setNumPseudo()
}//TigreMale
