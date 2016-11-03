package zoo_system;

public class VueBoutique extends Vue<Boutique>{
	public VueBoutique(Boutique boutique){
		this.model = boutique;
	}//VueBoutique()
	
	public void afficherListArticles(){
		System.out.println(this.getModel().getListArticles());
	}//afficherListArticles()
}//VueBoutique
