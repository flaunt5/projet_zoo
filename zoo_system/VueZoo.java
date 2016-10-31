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
	
	public void afficherListAnimauxEnclos(Enclos<? extends Animal> enclos){
		System.out.println(this.getModel().listerAnimauxEnclos(enclos));
	}//afficherListAnimauxEnclos()
	
	public void demandeDetail(){
		System.out.println("Affichage detaillé : \n1 - Oui\n2 - Non");
	}//demandeDetail()
	
	public void reproductionAnimal(){
		System.out.println(this.getModel().reproductionAnimal());
	}
}//VueZoo
