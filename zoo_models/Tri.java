package zoo_models;

import java.util.ArrayList;

/**
 * Tri est la classe qui représente un tri sur une liste
 * @author Alexandre
 *
 */
public interface Tri<T> {
	/**
	 * Trier la liste des animaux selon le tri choisi
	 * @param Animaux
	 */
	public void trier(ArrayList<T> listAnimaux);
}//Tri
