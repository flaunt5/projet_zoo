package zoo_vues;

import zoo_animaux.concret.TigreMale;

/**
 * VueTigreMale est la classe qui va permettre de réaliser les différents affichage de la classe TigreMale
 * @author Alexandre
 *
 */
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
