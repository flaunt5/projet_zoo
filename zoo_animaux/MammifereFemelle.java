package zoo_animaux;

/**
 * Interface decrivant comment accouche les animaux qui on la capcit� de le faire
 * @author Alexandre
 *
 */
public interface MammifereFemelle extends Femelle{
	
	/**
	 * Methode qui va creer des b�b�s d'animaux pour les animaux qui accouche
	 * @return Liste des b�b�  n�e et b�b� morts
	 */
	public String mettreBas();
}//MammifereFemelle
