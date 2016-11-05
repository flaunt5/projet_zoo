package zoo_vues;

import zoo_animaux.concret.TigreMale;

public class VueTigreMale extends VueAnimal<TigreMale>{
	/**
	 * Creer un objet de type VueTigreMale
	 * @param objet 
	 * 				un objet de type TigreMale
	 */
	public VueTigreMale(TigreMale objet){
		this.model = objet;
	}//VueTigreMale()
	
}//VueTigreMale
