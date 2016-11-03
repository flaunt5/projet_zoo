package zoo_system;

import java.util.ArrayList;

public abstract class Animal extends Model{
	protected String nom;
	protected double poids;
	protected double taille;
	protected String indicFaim;
	protected String indicSante;
	protected String indicSommeil;
	protected int age;
	protected Enclos enclosResidence;
	protected boolean endormi;
	protected String pseudo;
	protected ArrayList<String> listNourritureAccepte;
	protected int consoNourriture;
	protected int niveauFaim;
	
	public Animal(double poids, double taille, int age, String pseudo){
		this.poids = poids;
		this.taille = taille;
		this.indicFaim = "rassasier";
		this.indicSante = "en forme";
		this.indicSommeil = "dynamique";
		this.age = age;
		this.endormi = false;
		this.pseudo = pseudo;
		this.niveauFaim = 100;
	}//Animal()

	public abstract String emmetreSon();
	public abstract int getEsperanceVie();
	public abstract char getSexe();
	public abstract int getMaturiteSexuelle();
	public abstract int getConsoNourriture();
	
	public String mourir(String cause){
		this.getEnclosResidence().getListAnimaux().remove(this);
		this.setEnclosResidence(null);
		return this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + ") est mort... " + cause + "\n";
	}//mourir()
	
	public String manger(Nourriture nourriture, double ratio){
		String retour = this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + ") à vu la nourriture mais ne s'y intérésse pas";
		if(this.getListNourritureAccepte().contains(nourriture.getClass().getSimpleName()) 
				&& this.getNiveauFaim() != 100){
			//si le  ratio n'est pas à 1, on augmente d'un certain  % le niveau de faim
			if(ratio != 1){
				int futurNivFaim = (int) (this.getNiveauFaim() + (Math.round(nourriture.getGainNiveauFaim() * ratio)));
				this.setNiveauFaim(futurNivFaim);
				retour = this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + ") à manger le peu que vous lui avez donner";
			}else{
				this.setNiveauFaim(this.getNiveauFaim() + nourriture.getGainNiveauFaim());	
				retour = this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + ") à manger";			
			}
			this.redefiniIndicFaim();
		}
		return retour;
	}//manger()

	
	public void etreSoigner(){
		this.setIndicSante("en forme");		
	}//etreSoigner()

	public void seReveiller(){
		this.setEndormi(false);
		this.setIndicSommeil("dynamique");		
	}//seReveiller()
	
	public void sendormir(){
		this.setEndormi(true);	
	}//sendormir()
	
	@Override
	public String toString() {
		return "\t" + "Espece : " + nom + " ; Nom de l'animal : " + pseudo + "\n" + 
				"\t" + "Age : " + age + " ans ; Taille : " + taille + "M ; Poids : " + poids + "Kg\n" +
				"\t" + "Appetit : " + indicFaim + " ; Niveau de faim : " + niveauFaim + "/100 ; Sante : " + indicSante + "\n" +
				"\tSommeil : " + indicSommeil + " ; Endormi : " + convertBolleanToString(endormi) + "\n";
	}//toString()
	
	public String convertBolleanToString(boolean bool){
		if(bool){
			return "Oui";
		}else{
			return "Non";
		}
	}//convertBolleanToString()
	
	public double arrondiDecimals(double nombre ,int nbDecimal){
		double coef = Math.pow(10.0, nbDecimal);
		return Math.round(nombre * coef) /coef;
	}//arrondi2Decimals()
	
	public String getNom() {
		return nom;
	}//getNom()

	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()

	public double getPoids() {
		return poids;
	}//getPoids()

	public void setPoids(double poids) {
		this.poids = poids;
	}//setPoids()

	public double getTaille() {
		return taille;
	}//getTaille()

	public void setTaille(double taille) {
		this.taille = taille;
	}//setTaille()

	public String getIndicFaim() {
		return indicFaim;
	}//getIndicFaim()

	public void redefiniIndicFaim() {
		if(this.getNiveauFaim() > 60){
			this.indicFaim = "rassasié";
		}else if(this.getNiveauFaim() < 60 && this.getNiveauFaim() > 30){
			this.indicFaim = "à faim";
		}else{
			this.indicFaim = "affamé";			
		}
	}//setIndicFaim()

	public String getIndicSante() {
		return indicSante;
	}//getIndicSante()

	public void setIndicSante(String indicSante) {
		this.indicSante = indicSante;
	}//setIndicSante()

	public String getIndicSommeil() {
		return indicSommeil;
	}//getIndicSommeil()

	public void setIndicSommeil(String indicSommeil) {
		this.indicSommeil = indicSommeil;
	}//setIndicSommeil()

	public int getAge() {
		return age;
	}//getAge()

	public void setAge(int age) {
		this.age = age;
	}//setAge()

	public <T extends Animal> Enclos<T> getEnclosResidence() {
		return enclosResidence;
	}//getEnclosResidence()

	public <T extends Animal> void setEnclosResidence(Enclos<T> enclosResidence) {
		this.enclosResidence = enclosResidence;
	}//setEnclosResidence()

	public boolean isEndormi() {
		return endormi;
	}//isEndormi()

	public void setEndormi(boolean endormi) {
		this.endormi = endormi;
	}//setEndormi()

	public String getPseudo() {
		return pseudo;
	}//getPseudo()

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}//setPseudo()
	
	public ArrayList<String> getListNourritureAccepte() {
		return listNourritureAccepte;
	}//getListNourritureAccepte()	
	
	public int getNiveauFaim() {
		return niveauFaim;
	}//getNiveauFaim()

	public void setNiveauFaim(int niveauFaim) {
		this.niveauFaim = niveauFaim;
		if(this.niveauFaim > 100){
			this.niveauFaim = 100;			
		}
	}//setNiveauFaim()
}//Animal
