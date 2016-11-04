package zoo_system;

public class VueIHM extends Vue<IHM>{
	/**
	 * Creer un objet de type VueIHM
	 * @param object 
	 * 				un objet de type IHM
	 */
	public VueIHM(IHM object){
		this.model= object;
	}//VueIHM()
	/**
	 * Afficher les actions realisables par les utilisateurs
	 */
	public void afficherMenuAction(){
		System.out.println(this.getModel().getMenuAction());
	}//afficherMenuAction()
	
	/**
	 * Afficher le menu d'actions réalisables par l'utilisateur
	 */
	public void afficherMenuCourse(){
		System.out.println(this.getModel().getMenuCourse());
	}
}//VueIHM
