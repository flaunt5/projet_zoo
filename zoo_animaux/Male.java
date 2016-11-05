package zoo_animaux;

/**
 * Interface decrivant comment les animaux male s'accouple
 * @author Alexandre
 *
 */
public interface Male<T extends Animal> {
	
	/**
	 * Sexe de l'animal
	 */
	final char SEXE = 'M';
	
	/**
	 * Accouple un  male et une  femelle
	 * @param femelle
	 * 				Femelle qui va se faire fecondé
	 * @return Message de confirmation de l'action
	 */
	public String saccoupler(T femelle);
}//Male
