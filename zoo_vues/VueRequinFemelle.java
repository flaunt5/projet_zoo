package zoo_vues;

import zoo_animaux.concret.RequinFemelle;

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

