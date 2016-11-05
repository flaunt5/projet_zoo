package zoo_vues;

import zoo_animaux.concret.LoupFemelle;

/**
 * VueLoupFemelle est la classe qui va permettre de réaliser les différents affichage de la classe LoupFemelle
 * @author Alexandre
 *
 */
public class VueLoupFemelle extends VueAnimal<LoupFemelle>{
	/**
	 * Creer un objet de type VueLoupFemelle
	 * @param objet 
	 * 				un objet de type LoupFemelle
	 */
	public VueLoupFemelle(LoupFemelle objet){
		this.model = objet;
	}//VueLoupFemelle()
	
}//VueLoupFemelle
