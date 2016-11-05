package zoo_vues;

import zoo_animaux.Animal;

public abstract class VueAnimal<T extends Animal> extends Vue<T>{
	/**
	 * Affiche le cri de l'animal
	 */
	public void crier() {
		System.out.println(this.getModel().emmetreSon());
	}//crier()
}//VueAnimal