package zoo_system;

import java.util.ArrayList;

public class TriAlphabetique<T extends Animal> implements Tri<T> {

	/**
	 * Effectue un tri par ordre alphabetique sur les Pseudo des animaux
	 * @param listAnimaux
	 */
	public void trier(ArrayList<T> listAnimaux) {
		int j;
		boolean flag = true; 
		T temp;

		while (flag) {
			flag = false;
			for (j = 0; j < listAnimaux.size() - 1; j++) {
				if (listAnimaux.get(j).getPseudo().compareToIgnoreCase(listAnimaux.get(j + 1).getPseudo()) > 0) { // ascending sort
					temp = listAnimaux.get(j);
					listAnimaux.set(j, listAnimaux.get(j + 1));
					listAnimaux.set(j + 1,temp);
					flag = true;
				}
			}
		}
	}// tier()

}