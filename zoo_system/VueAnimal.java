package zoo_system;

public abstract class VueAnimal<T extends Animal> extends Vue<T>{
	/**
	 * Afficher le cri de l'animal
	 */
	public void crier() {
		System.out.println(this.getModel().emmetreSon());
	}//crier()
}//VueAnimal
