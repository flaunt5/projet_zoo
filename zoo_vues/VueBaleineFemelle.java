package zoo_vues;

import zoo_animaux.concret.BaleineFemelle;

/**
 * VueBaleineFemelle est la classe qui va permettre de réaliser les différents affichage de la classe BaleineFemelle
 * @author Alexandre
 *
 */
public class VueBaleineFemelle extends VueAnimal<BaleineFemelle>{
	/**
	 * Creer un objet de type VueBaleineFemelle
	 * @param objet 
	 * 				un objet de type BaleineFemelle
	 */
	public VueBaleineFemelle(BaleineFemelle objet){
		this.model = objet;
	}//VueBaleineFemelle()
	
}//VueBaleineFemelle
