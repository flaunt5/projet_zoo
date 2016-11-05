package zoo_vues;

import zoo_divers.Boutique;

public class VueBoutique extends Vue<Boutique>{
	/**
	 * Creer un objet de type VueBoutique
	 * @param objet 
	 * 				un objet de type Boutique
	 */
	public VueBoutique(Boutique objet){
		this.model = objet;
	}//VueBoutique()
	/**
	 * Afficher la liste des articles dans la boutique
	 */
	public void afficherListArticles(){
		System.out.println(this.getModel().getListArticles());
	}//afficherListArticles()
}//VueBoutique
