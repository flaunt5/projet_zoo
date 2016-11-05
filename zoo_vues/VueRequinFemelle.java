package zoo_vues;

import zoo_animaux.concret.RequinFemelle;

/**
 * VueRequinFemelle est la classe qui va permettre de r�aliser les diff�rents affichage de la classe RequinFemelle
 * @author Alexandre
 *
 */
public class VueRequinFemelle extends VueAnimal<RequinFemelle>{
	/**
	 * Creer un objet de type VueRequinFemelle
	 * @param objet 
	 * 				un objet de type RequinFemelle
	 */
	public VueRequinFemelle(RequinFemelle objet){
		this.model = objet;
	}//VueRequinFemelle()
	
}//VueRequinFemelle

