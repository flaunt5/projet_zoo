package zoo_animaux;

/**
 * Interface decrivant comment accouche les animaux qui on la capcité de le faire
 * @author Alexandre
 *
 */
public interface MammifereFemelle extends Femelle{
	
	/**
	 * Methode qui va creer des bébés d'animaux pour les animaux qui accouche
	 * @return Liste des bébé  née et bébé morts
	 */
	public String mettreBas();
}//MammifereFemelle
