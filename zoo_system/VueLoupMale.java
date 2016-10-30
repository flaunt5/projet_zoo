package zoo_system;

public class VueLoupMale extends VueAnimal<LoupMale>{

	public VueLoupMale(LoupMale object){
		this.model = object;
	}//VueLoupMale()
	
	
	public static void main(String Args[]){

		LoupMale LM= new LoupMale(10, 10, 10);
		LoupFemelle LF = new LoupFemelle(10, 10, 10);
		Cage cageLoup = new Cage("Cage à  loup", 10, 3);
		cageLoup.ajouterAnimal(LM);
		cageLoup.ajouterAnimal(LF);
		LM.saccoupler(LF);
		
		VueLoupMale vlm2 = new VueLoupMale(LM);
		vlm2.details();

		
	}
	
}//VueLoupMale
