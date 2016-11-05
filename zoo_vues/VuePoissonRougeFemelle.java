package zoo_vues;

import zoo_animaux.concret.PoissonRougeFemelle;

/**
 * VuePoissonRougeFemelle est la classe qui va permettre de r�aliser les diff�rents affichage de la classe PoissonRougeFemelle
 * @author Alexandre
 *
 */
public class VuePoissonRougeFemelle  extends VueAnimal<PoissonRougeFemelle>{
	/**
	 * Creer un objet de type VuePoissonRougeFemelle
	 * @param objet 
	 * 				un objet de type PoissonRougeFemelle
	 */
	public VuePoissonRougeFemelle(PoissonRougeFemelle objet){
		this.model = objet;
	}//VuePoissonRougeFemelle()
	
}//VuePoissonRougeFemelle

