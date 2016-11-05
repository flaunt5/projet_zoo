package zoo_vues;

import zoo_animaux.concret.TigreFemelle;

public class VueTigreFemelle extends VueAnimal<TigreFemelle>{
	/**
	 * Creer un objet de type VueTigreFemelle
	 * @param objet 
	 * 				un objet de type TigreFemelle
	 */
	public VueTigreFemelle(TigreFemelle objet){
		this.model = objet;
	}//VueTigreFemelle()
	
}//VueTigreFemelle