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
	
	public void afficheAnimaux(){
		System.out.println(this.getModel().getAnimaux());
	}//afficheAnimaux()
	
	public void modifierEtatEnclos(){
		System.out.println(this.getModel().modifierEtatEnclos());
	}//modifierEtatEnclos()
	
	public void modifierEtatAnimaux(){
		System.out.println(this.getModel().modifierEtatAnimaux());
	}//modifierEtatAnimaux()
}//VueZoo
