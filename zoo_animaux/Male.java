package zoo_animaux;

public interface Male<T extends Animal> {
	final char SEXE = 'M';
	
	/**
	 * Accouple un  male et une  femelle
	 * @param femelle
	 * 				Femelle qui va se faire fecondé
	 */
	public String saccoupler(T femelle);
}//Male
