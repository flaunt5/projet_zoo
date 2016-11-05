package zoo_vues;

import zoo_models.IHM;

/**
 * VueIHM est la classe qui va permettre de r�aliser les diff�rents affichage de la classe IHM
 * @author Alexandre
 *
 */
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
	 * Afficher le menu demandant si l'utilisateur veut acc�der  a la boutique
	 */
	public void afficherMenuCourse(){
		System.out.println(this.getModel().getMenuCourse());
	}
}//VueIHM
