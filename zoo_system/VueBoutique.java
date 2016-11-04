package zoo_system;

public class VueBoutique extends Vue<Boutique>{
	/**
	 * Creer un objet de type VueBoutique
	 * @param object 
	 * 				un objet de type Boutique
	 */
	public VueBoutique(Boutique boutique){
		this.model = boutique;
	}//VueBoutique()
	/**
	 * Afficher la liste des articles dans la boutique
	 */
	public void afficherListArticles(){
		System.out.println(this.getModel().getListArticles());
	}//afficherListArticles()
}//VueBoutique
