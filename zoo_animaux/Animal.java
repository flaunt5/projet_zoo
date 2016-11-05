package zoo_animaux;

import java.util.ArrayList;

import zoo_divers.equipements.MaterielSoin;
import zoo_divers.equipements.Nourriture;
import zoo_models.Enclos;
import zoo_models.Model;

/**
 * Animal est la classe qui represente l'un des animaux 
 * @author Alexandre
 *
 */
public abstract class Animal extends Model{
	/**
	 * Nom de l'espece de l'animal
	 */
	protected String nom;
	
	/**
	 * Poids de l'animal
	 */
	protected double poids;
	
	/**
	 * Taille de l'animal
	 */
	protected double taille;
	
	/**
	 * Information sur l'appetit de l'animal
	 */
	protected String indicFaim;
	
	/**
	 * Information sur l'�tat de sant� de l'animal
	 */
	protected String indicSante;
	
	/**
	 * Information sur l'�tat de fatigue de l'animal
	 */
	protected String indicSommeil;
	
	/**
	 * Age de l'animal
	 */
	protected int age;
	
	/**
	 * Enclos ou se trouve l'animal
	 */
	protected Enclos enclosResidence;
	
	/**
	 * Indication poir savoir si l'animal dort
	 */
	protected boolean endormi;
	
	/**
	 * Nom de l'animal
	 */
	protected String pseudo;
	
	/**
	 * Liste des aliment que l'animal mange
	 */
	protected ArrayList<String> listNourritureAccepte;
	
	/**
	 * Consommation de nourriture � chaque repas
	 */
	protected int consoNourriture;
	
	/**
	 * Indicateur en % sur son app�tit, 100 = tout va bien , 0 = affam�
	 */
	protected int niveauFaim;	
	
	/**
	 * Indicateur en % sur son �tat de sante, 100 = tout va bien , 0 = mourant
	 */
	protected int niveauSante;	
	
	/**
	 * Indicateur en % sur son �tat de fatigue, 100 = tout va bien , 0 = �puis�
	 */
	protected int niveauSommeil;

	/**
	 * Construit un objet de type Animal
	 * @param poids
	 * 				Futur poids de l'animal
	 * @param taille
	 * 				Futur taille de l'animal
	 * @param age
	 * 				Futur age de l'animal
	 * @param pseudo
	 * 				Futur pseudo de l'animal
	 */
	public Animal(double poids, double taille, int age, String pseudo){
		this.poids = poids;
		this.taille = taille;
		this.indicFaim = "n'a pas faim";
		this.indicSante = "en forme";
		this.indicSommeil = "�veill�";
		this.age = age;
		this.endormi = false;
		this.pseudo = pseudo;
		this.niveauFaim = 100;
		this.niveauSante = 100;
		this.niveauSommeil = 100;
	}//Animal()

	/**
	 * Permet � l'animal de pousser son cri
	 * @return Son emit par l'animal
	 */
	public abstract String emmetreSon();
	
	/**
	 * Retourne la valeur de l'attribut esperanceVie
	 * @return Valeur de l'attribut epseranceVie
	 */
	public abstract int getEsperanceVie();
	
	/**
	 * Retourne la valeur de l'attribut sexe
	 * @return Valeur de l'attribut sexe
	 */
	public abstract char getSexe();
	
	/**
	 * Retourne la valeur de l'attribut maturiteSexuelle
	 * @return Valeur de l'attribut maturiteSexuelle
	 */
	public abstract int getMaturiteSexuelle();
	
	/**
	 * Retourne la valeur de l'attribut consoNourriture
	 * @return Valeur de l'attribut consoNourriture
	 */
	public abstract int getConsoNourriture();
	
	/**
	 * Fait mourir un animal
	 * @param cause
	 * 				Cause de la mort
	 * @return Message de confirmation, indicant que l'animal est mort
	 */
	public String mourir(String cause){
		this.getEnclosResidence().getListAnimaux().remove(this);
		this.setEnclosResidence(null);
		return this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + ") est mort... " + cause + "\n";
	}//mourir()
	
	/**
	 * Nouri un animal avec la nourriture en param�tre
	 * Le gain de "niveau de faim" va deprendre du ratio
	 * @param nourriture
	 * 					Nourriture qui va etre donner � l'animal
	 * @param ratio
	 * 				Ratio sur le gain de "niveau de faim"
	 * @return Message indicant si l'animal � manger ou pas
	 */
	public String manger(Nourriture nourriture, double ratio){
		String retour = this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + ") � vu la nourriture mais ne s'y int�r�sse pas";
		if(this.getListNourritureAccepte().contains(nourriture.getClass().getSimpleName()) 
				&& this.getNiveauFaim() != 100){
			//si le  ratio n'est pas � 1, on augmente d'un certain  % le niveau de faim
			if(ratio != 1){
				int futurNivFaim = (int) (this.getNiveauFaim() + (Math.round(nourriture.getGainNiveauFaim() * ratio)));
				this.setNiveauFaim(futurNivFaim);
				retour = this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + ") � manger le peu que vous lui avez donner";
			}else{
				this.setNiveauFaim(this.getNiveauFaim() + nourriture.getGainNiveauFaim());	
				retour = this.getPseudo() + "(" + this.getNom() + ", " + this.getSexe() + ") � manger";			
			}
			this.redefiniIndicFaim();
		}
		return retour;
	}//manger()

	/**
	 * Soigne un animal
	 */
	public void etreSoigner(MaterielSoin materiel){
		this.setNiveauSante(this.getNiveauSante() + materiel.getGainNiveauSante());
		this.redefiniIndicSante();		
	}//etreSoigner()

	/**
	 * Reveille un animal et modifie son etat de fatigue
	 */
	public void seReveiller(){
		this.setEndormi(false);
		this.redefiniIndicSommeil();		
	}//seReveiller()
	
	/**
	 * Endort un animal
	 */
	public void sendormir(){
		this.setEndormi(true);	
	}//sendormir()
	
	/**
	 * Recupere les caract�ristiques de l'animal
	 * @return Caracteristique de l'animal
	 */
	public String toString() {
		return "\t" + "Espece : " + nom + " ; Nom de l'animal : " + pseudo + "\n" + 
				"\t" + "Age : " + age + " ans ; Taille : " + taille + "M ; Poids : " + poids + "Kg\n" +
				"\t" + "Appetit : " + indicFaim + " ; Niveau de faim : " + niveauFaim + "/100 \n" +
				"\t" + "Sant� : " + indicSante + " ; Niveau de sant� : " + niveauSante + "/100 \n" +
				"\t" + "Sommeil : " + indicSommeil + " ; Niveau de sommeil : " + niveauSommeil + "/100 ; Endormi : " + 
				convertBolleanToString(endormi) + "\n";
	}//toString()
	
	/**
	 * Convertie un booleen en chaine de caractere
	 * @param bool
	 * 			Boolean qui va etre convertie
	 * @return booleen transform� en chaine de caractere
	 */
	public String convertBolleanToString(boolean bool){
		if(bool){
			return "Oui";
		}else{
			return "Non";
		}
	}//convertBolleanToString()
	
	/**
	 * Arrondi un nombre
	 * @param nombre
	 * 				Nombre  � arrondir
	 * @param nbDecimal
	 * 				Nombre de decimal que comportera le nombre une fois arrondi
	 * @return Nombre apres arrondi
	 */
	public double arrondiDecimals(double nombre ,int nbDecimal){
		double coef = Math.pow(10.0, nbDecimal);
		return Math.round(nombre * coef) /coef;
	}//arrondi2Decimals()
	
	/**
	 * Retourne la valeur de l'attribut nom
	 * @return Valeur de l'attribut nom
	 */
	public String getNom() {
		return nom;
	}//getNom()

	/**
	 * Modifie la valeur de l'attribut nom
	 * @param nom
	 * 				Futur valeur de nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}//setNom()
	
	/**
	 * Retourne la valeur de l'attribut poids
	 * @return Valeur de l'attribut poids
	 */
	public double getPoids() {
		return poids;
	}//getPoids()

	/**
	 * Modifie la valeur de l'attribut poids
	 * @param poids
	 * 				Futur valeur de poids
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}//setPoids()
	
	/**
	 * Retourne la valeur de l'attribut taille
	 * @return Valeur de l'attribut taille
	 */
	public double getTaille() {
		return taille;
	}//getTaille()

	/**
	 * Modifie la valeur de l'attribut taille
	 * @param taille
	 * 				Futur valeur de taille
	 */
	public void setTaille(double taille) {
		this.taille = taille;
	}//setTaille()
	
	/**
	 * Retourne la valeur de l'attribut indicFaim
	 * @return Valeur de l'attribut indicFaim
	 */
	public String getIndicFaim() {
		return indicFaim;
	}//getIndicFaim()

	/**
	 * Recalcule la valeur de l'attribut indicFaim
	 * @param indicFaim
	 * 				Futur valeur de indicFaim
	 */
	public void redefiniIndicFaim() {
		if(this.getNiveauFaim() > 60){
			this.indicFaim = "n'a pas faim";
		}else if(this.getNiveauFaim() < 60 && this.getNiveauFaim() > 30){
			this.indicFaim = "� faim";
		}else{
			this.indicFaim = " est affam�";			
		}
	}//setIndicFaim()
	
	/**
	 * Retourne la valeur de l'attribut indicSante
	 * @return Valeur de l'attribut indicSante
	 */
	public String getIndicSante() {
		return indicSante;
	}//getIndicSante()

	/**
	 * Modifie la valeur de l'attribut indicSante
	 * @param indicSante
	 * 				Futur valeur de indicSante
	 */
	public void redefiniIndicSante() {
		if(this.getNiveauSante() > 60){
			this.indicSante = "en forme";
		}else if(this.getNiveauSante() < 60 && this.getNiveauSante() > 30){
			this.indicSante = "bl�ss�";
		}else{
			this.indicSante = "mourrant";			
		}
	}//setIndicSante()
	
	/**
	 * Retourne la valeur de l'attribut indicSommeil
	 * @return Valeur de l'attribut indicSommeil
	 */
	public String getIndicSommeil() {
		return indicSommeil;
	}//getIndicSommeil()

	/**
	 * Modifie la valeur de l'attribut indicSommeil
	 * @param indicSommeil
	 * 				Futur valeur de indicSommeil
	 */
	public void redefiniIndicSommeil() {
		if(this.getNiveauSommeil() > 60){
			this.indicSante = "�veill�";
		}else if(this.getNiveauSommeil() < 60 && this.getNiveauSommeil() > 30){
			this.indicSante = "fatigu�";
		}else{
			this.indicSante = "�puis�";			
		}
	}//setIndicSommeil()
	
	/**
	 * Retourne la valeur de l'attribut age
	 * @return Valeur de l'attribut age
	 */
	public int getAge() {
		return age;
	}//getAge()

	/**
	 * Modifie la valeur de l'attribut age
	 * @param age
	 * 				Futur valeur de age
	 */
	public void setAge(int age) {
		this.age = age;
	}//setAge()
	
	/**
	 * Retourne la valeur de l'attribut enclosResidence
	 * @return Valeur de l'attribut enclosResidence
	 */
	public <T extends Animal> Enclos<T> getEnclosResidence() {
		return enclosResidence;
	}//getEnclosResidence()

	/**
	 * Retourne la valeur de l'attribut enclosResidence
	 * @return enclosResidence
	 */
	public <T extends Animal> void setEnclosResidence(Enclos<T> enclosResidence) {
		this.enclosResidence = enclosResidence;
	}//setEnclosResidence()
	
	/**
	 * Retourne la valeur de l'attribut endormi
	 * @return Valeur de l'attribut endormi
	 */
	public boolean isEndormi() {
		return endormi;
	}//isEndormi()

	/**
	 * Modifie la valeur de l'attribut endormi
	 * @param endormi
	 * 				Futur valeur de endormi
	 */
	public void setEndormi(boolean endormi) {
		this.endormi = endormi;
	}//setEndormi()
	
	/**
	 * Retourne la valeur de l'attribut pseudo
	 * @return Valeur de l'attribut pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}//getPseudo()

	/**
	 * Modifie la valeur de l'attribut pseudo
	 * @param pseudo
	 * 				Futur valeur de pseudo
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}//setPseudo()
	
	/**
	 * Retourne la valeur de l'attribut listNourritureAccepte
	 * @return Valeur de l'attribut listNourritureAccepte
	 */
	public ArrayList<String> getListNourritureAccepte() {
		return listNourritureAccepte;
	}//getListNourritureAccepte()	
	
	/**
	 * Retourne la valeur de l'attribut niveauFaim
	 * @return Valeur de l'attribut niveauFaim
	 */
	public int getNiveauFaim() {
		return niveauFaim;
	}//getNiveauFaim()

	/**
	 * Modifie la valeur de l'attribut niveauFaim
	 * @param niveauFaim
	 * 				Futur valeur de niveauFaim
	 */
	public void setNiveauFaim(int niveauFaim) {
		this.niveauFaim = niveauFaim;
		if(this.niveauFaim > 100){
			this.niveauFaim = 100;			
		}
	}//setNiveauFaim()
	
	/**
	 * Retourne la valeur de l'attribut niveauSante
	 * @return Valeur de l'attribut niveauSante
	 */
	public int getNiveauSante() {
		return this.niveauSante;
	}//getNiveauSante()

	/**
	 * Modifie la valeur de l'attribut niveauSante
	 * @param niveauSante
	 * 				Futur valeur de niveauSante
	 */
	public void setNiveauSante(int niveauSante) {
		this.niveauSante = niveauSante;
		if(this.niveauSante > 100){
			this.niveauSante = 100;			
		}
	}//setNiveauSante()

	/**
	 * Retourne la valeur de l'attribut niveauSommeil
	 * @return Valeur de l'attribut niveauSommeil
	 */
	public int getNiveauSommeil() {
		return this.niveauSommeil;
	}

	/**
	 * Modifie la valeur de l'attribut niveauSommeil
	 * @param niveauSommeil
	 * 				Futur valeur de niveauSommeil
	 */
	public void setNiveauSommeil(int niveauSommeil) {
		this.niveauSommeil = niveauSommeil;
		if(this.niveauSommeil > 100){
			this.niveauSommeil = 100;			
		}
	}
}//Animal
