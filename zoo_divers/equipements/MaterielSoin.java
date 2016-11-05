package zoo_divers.equipements;

import zoo_models.Model;

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
