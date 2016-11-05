package zoo_divers.equipements;

import zoo_models.Model;

/**
 * MaterielSoin represente un objet utuilisable pour soigner des animauxs
 * @author Alexandre
 *
 */
public abstract class MaterielSoin extends Model{
	protected int gainNiveauSante;

	/**
	 * Retourne la valeur de l'attribut gainNiveauSoin
	 * @return Valeur de l'attribut gainNiveauSoin
	 */
	public int getGainNiveauSante() {
		return gainNiveauSante;
	}//getGainNiveauSante()
}//MaterielSoin
