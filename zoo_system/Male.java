package zoo_system;

public interface Male<T extends Animal> {
	final char SEXE = 'M';
	
	/**
	 * Accouple un  male et une  femelle
	 * @param femelle
	 * 				femelle qui va se faire fecond�
	 */
	public String saccoupler(T femelle);
}//Male
