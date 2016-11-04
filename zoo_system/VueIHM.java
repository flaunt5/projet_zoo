package zoo_system;

public class VueIHM extends Vue<IHM>{
	/**
	 * Creer un objet de type VueIHM
	 * @param objet 
	 * 				un objet de type IHM
	 */
	public VueIHM(IHM objet){
		this.model= objet;
	}//VueIHM()
	/**
	 * Afficher le menu contenant les actions realisables par les utilisateurs
	 */
	public void afficherMenuAction(){
		System.out.println(this.getModel().getMenuAction());
	}//afficherMenuAction()
	
	/**
	 * Afficher le menu demandant si l'utilisateur veut accéder  a la boutique
	 */
	public void afficherMenuCourse(){
		System.out.println(this.getModel().getMenuCourse());
	}
}//VueIHM
