package zoo_system;

public class VueZoo extends Vue<Zoo>{

	public VueZoo(Zoo object){
		this.model = object;
	}//VueZoo()
	
	public void ajouterEnclos(Enclos<? extends Animal> enclos){
		System.out.println(this.getModel().ajouterEnclos(enclos));
	}//ajouterEnclos()
	
	public void afficheNbAnimaux(){
		System.out.println(this.getModel().getNbAnimaux());
	}//afficheNbAnimaux()
	
	public void afficheAnimaux(Boolean details){
		System.out.println(this.getModel().getAnimaux(details));
	}//afficheAnimaux()
	
	public void modifierEtatEnclos(){
		System.out.println(this.getModel().modifierEtatEnclos());
	}//modifierEtatEnclos()
	
	public void modifierEtatAnimaux(){
		System.out.println(this.getModel().modifierEtatAnimaux());
	}//modifierEtatAnimaux()
	
	public void afficherListEnclos(Boolean pourTransfer){
		System.out.println(this.getModel().listerEnclos(pourTransfer));
	}//afficherListEnclos()
	
	public void afficherListAnimauxEnclos(Enclos<? extends Animal> enclos, boolean pourSoin, boolean pourNourir){
		System.out.println(this.getModel().listerAnimauxEnclos(enclos,pourSoin, pourNourir));
	}//afficherListAnimauxEnclos()
	
	public void demandeDetail(){
		System.out.println("Affichage detaill� : \n1 - Oui\n2 - Non");
	}//demandeDetail()
	
	public void reproductionAnimal(){
		System.out.println(this.getModel().reproductionAnimal());
	}//reproductionAnimal()
	
	public void verifierFemelleEnceinte(){
		System.out.println(this.getModel().verifierFemelleEnceinte());		
	}//verifierFemelleEnceinte()
	
	public void reveillerAnimaux(){
		System.out.println(this.getModel().reveillerAnimaux());
	}//reveillerAnimaux()
	
	public void faireGrandirAnimaux(){
		System.out.println(this.getModel().faireGrandirAnimaux());
	}//faireGrandirAnimaux()
	
	public void tuerAnimaux(){
		System.out.println(this.getModel().tuerAnimaux());
	}//tuerAnimaux()
	
	public void afficherContenuStock(boolean choix){
		System.out.println(this.getModel().getContenuStock(choix));
	}//getContenuStock()
}//VueZoo
