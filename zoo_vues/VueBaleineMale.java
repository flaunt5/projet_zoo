package zoo_vues;

import zoo_animaux.concret.BaleineMale;

public class VueBaleineMale extends VueAnimal<BaleineMale>{
	/**
	 * Creer un objet de type VueBaleineMale
	 * @param objet 
	 * 				un objet de type BaleineMale
	 */
	public VueBaleineMale(BaleineMale objet){
		this.model = objet;
	}//VueBaleineMale()
	
}//VueBaleineMale
