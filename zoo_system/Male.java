package zoo_system;

public interface Male<T extends Animal> {
	final char SEXE = 'M';
	
	public void saccoupler(T femelle);
}//Male
