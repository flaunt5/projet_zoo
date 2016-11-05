package zoo_vues;

import zoo_animaux.concret.BaleineFemelle;

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
