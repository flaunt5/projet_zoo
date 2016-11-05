package zoo_system;

public class VueZoo extends Vue<Zoo>{

	/**
	 * Creer un objet de type VueZoo
	 * @param objet
	 * 				un objet de type Zoo
	 */
	public VueZoo(Zoo objet){
		this.model = objet;
	}//VueZoo()
	
	/**
	 * Affiche le message à l'ajout d'un enclos
	 * @param enclos 
	 * 				L'enclos qui va etre ajouter
	 */
	public void ajouterEnclos(Enclos<? extends Animal> enclos){
		System.out.println(this.getModel().ajouterEnclos(enclos));
	}//ajouterEnclos()
	
	/**
	 * Affiche le nombre d'animaux dans le zoo
	 */
	public void afficheNbAnimaux(){
		System.out.println(this.getModel().getNbAnimaux());
	}//afficheNbAnimaux()
	
	/**
	 * Affiche les caracteriste des animaux avec ou sans details sur ces caracteristeque
	 * @param details 
	 * 				Presision pour savoir si on affiche seulement leurs pseudo, nom et sexe
	 * 				ou s'il on affiche toutes les informations
	 */
	public void afficheAnimaux(Boolean details){
		System.out.println(this.getModel().getAnimaux(details));
	}//afficheAnimaux()
	
	/**
	 * Affiche les modiffications effctué sur les enclos
	 */
	public void modifierEtatEnclos(){
		System.out.println(this.getModel().modifierEtatEnclos());
	}//modifierEtatEnclos()
	
	/**
	 * Affiche les modifications effectué sur les animaux
	 */
	public void modifierEtatAnimaux(){
		System.out.println(this.getModel().modifierEtatAnimaux());
	}//modifierEtatAnimaux()
	
	/**
	 * Affiche la liste des enclos du zoo
	 * @param pourTransfer
	 * 					Va permetre de savoir si on rajoute une String dans la chaine qui va etre retourner par la fonction
	 */
	public void afficherListEnclos(Boolean pourTransfer){
		System.out.println(this.getModel().listerEnclos(pourTransfer));
	}//afficherListEnclos()
	
	/**
	 * Affiche la liste des animaux de l'enclos
	 * @param enclos
	 * 				Enclos dont les enimaux vont etre lister
	 * @param pourSoin
	 * 				Boolean pour savoir si cette methode est appelé pour soigner un animal
	 * @param pourNourir
	 * 				Boolean pour savoir si cette methode est appelé pour nourrir un animal
	 */
	public void afficherListAnimauxEnclos(Enclos<? extends Animal> enclos, boolean pourSoin, boolean pourNourir){
		System.out.println(this.getModel().listerAnimauxEnclos(enclos,pourSoin, pourNourir));
	}//afficherListAnimauxEnclos()
	
	/**
	 * Affiche un demande pour l'utilisateur
	 */
	public void demandeDetail(){
		System.out.println("Affichage detaillé : \n1 - Oui\n2 - Non");
	}//demandeDetail()
	
	/**
	 * Affiche la liste des accouplement qui ont ete effectué
	 */
	public void reproductionAnimal(){
		System.out.println(this.getModel().reproductionAnimal());
	}//reproductionAnimal()
	
	/**
	 * Affiche la liste des accouchements
	 */
	public void verifierFemelleEnceinte(){
		System.out.println(this.getModel().verifierFemelleEnceinte());		
	}//verifierFemelleEnceinte()
	
	/**
	 * Affiche la liste des animaux qui se reveille
	 */
	public void reveillerAnimaux(){
		System.out.println(this.getModel().reveillerAnimaux());
	}//reveillerAnimaux()
	
	/**
	 * Affiche un message pour indiquer à l'utilisateur que les animaux on grandi de 1 ans
	 */
	public void faireGrandirAnimaux(){
		System.out.println(this.getModel().faireGrandirAnimaux());
	}//faireGrandirAnimaux()
	
	/**
	 * Affiche la liste des animaux décéder s'il y en a, sinon affiche un message indiquand que aucun animal n'est mort
	 */
	public void tuerAnimaux(){
		System.out.println(this.getModel().tuerAnimaux());
	}//tuerAnimaux()
	
	/**
	 * Affiche la liste des différent stock ainsi que son contenu
	 * @param choix
	 * 			Boolean qui va permettre de savoir si la fonction est appelé pour permettre à l'utilisateur de choisir
	 * 			un equiepement, ou si la fonction est appelé pour afficher la liste des équipement
	 */
	public void afficherContenuStock(boolean choix, boolean voirNourriture, boolean voirSoin){
		System.out.println(this.getModel().getContenuStock(choix,voirNourriture,voirSoin));
	}//getContenuStock()
	
	/**
	 * Affiche le budget du zoo
	 */
	public void afficherBudgetDuZoo(){
		System.out.println(this.getModel().getBudgetDuZoo());
	}//afficherBudgetDuZoo()

	/**
	 * Affiche de gain d'argent obtenu à la fin du tour
	 */
	public void gagnerDeLargent() {
		System.out.println(this.getModel().gagnerArgent());
	}//gagnerDeLargent()
}//VueZoo
