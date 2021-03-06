package zoo_systeme;

import java.util.ArrayList;
import zoo_animaux.concret.AigleFemelle;
import zoo_animaux.concret.AigleMale;
import zoo_animaux.concret.BaleineFemelle;
import zoo_animaux.concret.BaleineMale;
import zoo_animaux.concret.LoupFemelle;
import zoo_animaux.concret.LoupMale;
import zoo_animaux.concret.OursFemelle;
import zoo_animaux.concret.OursMale;
import zoo_animaux.concret.PingouinFemelle;
import zoo_animaux.concret.PingouinMale;
import zoo_animaux.concret.PoissonRougeFemelle;
import zoo_animaux.concret.PoissonRougeMale;
import zoo_animaux.concret.RequinFemelle;
import zoo_animaux.concret.RequinMale;
import zoo_animaux.concret.TigreFemelle;
import zoo_animaux.concret.TigreMale;
import zoo_divers.Boutique;
import zoo_models.Aquarium;
import zoo_models.Cage;
import zoo_models.IHM;
import zoo_models.Voliere;
import zoo_models.Zoo;
import zoo_vues.VueAquarium;
import zoo_vues.VueBoutique;
import zoo_vues.VueCage;
import zoo_vues.VueEmploye;
import zoo_vues.VueEnclos;
import zoo_vues.VueIHM;
import zoo_vues.VueVoliere;
import zoo_vues.VueZoo;

/**
 * Controleur est la classe qui va se servir des diff�rent Models et Vues afin de faire fonctionner la programme
 * @author Alexandre
 *
 */
public abstract class Controleur {

	/**
	 * Permet de lancer l'une des simulations de zoo
	 */
	public static void zooNumero1(){
		/*
		 * Mise en place du zoo
		 */
		//creaction du zoo et de l'employe
		Zoo zoo = Zoo.getInstance("Zoo marseille", 8, "Jean-luc", 45, 'M', 1, 1, 1, 1 ,1);
		Boutique boutique = Boutique.getInstance();
		//creaction des enclos
		Cage cageLoup = new Cage("Cage des loups", 35, 10);
		Cage cageOurs = new Cage("Cage des ours", 30, 10);
		Cage cageTigre = new Cage("Cage des tigres", 40, 10);
		Aquarium bassinBaleine = new Aquarium("Bassin des baleines", 100, 10);
		Aquarium bassinPoissonR = new Aquarium("Bassin des poissons rouges", 10, 10);
		Aquarium bassinRequin = new Aquarium("Bassin des requins", 40, 10);
		Aquarium bassinPinguoin = new Aquarium("Bassin des pinguoin", 40, 10);
		Voliere voliereAigle = new Voliere("Voliere des aigles", 60, 10, 15);
		Cage cageSecours = new Cage("Cage de remplacement", 35, 10);
		Aquarium bassinSecours = new Aquarium("Bassin de remplacement", 35, 10);
		Voliere voliereSecours = new Voliere("Voliere de remplacement", 35, 10, 10);
		
		//creaction des animaux de base
		LoupMale loupMale1 = new LoupMale(60, 83, 5,LoupMale.getPseudoAnimal());
		LoupMale loupMale2 = new LoupMale(70, 85, 6,LoupMale.getPseudoAnimal());
		LoupFemelle loupFem = new LoupFemelle(50, 80, 5,LoupFemelle.getPseudoAnimal());
		OursFemelle oursfem = new OursFemelle(450, 110, 15,OursFemelle.getPseudoAnimal());
		OursMale oursMale = new OursMale(500, 140, 20,OursMale.getPseudoAnimal());
		TigreMale  tigreMale1 = new TigreMale(280, 110, 13,TigreMale.getPseudoAnimal());
		TigreMale tigreMale2 = new TigreMale(200, 100, 12,TigreMale.getPseudoAnimal());
		TigreFemelle tigreFem = new TigreFemelle(110, 80, 10,TigreFemelle.getPseudoAnimal());
		BaleineMale baleineMale = new BaleineMale(140000, 35, 75,BaleineMale.getPseudoAnimal());
		BaleineFemelle baleineFem = new BaleineFemelle(135000, 32, 50,BaleineFemelle.getPseudoAnimal());
		PoissonRougeMale poissonRMale1 = new PoissonRougeMale(1.2, 39, 8,PoissonRougeMale.getPseudoAnimal());
		PoissonRougeMale poissonRMale2 = new PoissonRougeMale(1, 40, 7,PoissonRougeMale.getPseudoAnimal());
		PoissonRougeFemelle poissonRFem1 = new PoissonRougeFemelle(0.5, 32, 11,PoissonRougeFemelle.getPseudoAnimal());
		PoissonRougeFemelle poissonRFem2 = new PoissonRougeFemelle(1.5, 30, 5,PoissonRougeFemelle.getPseudoAnimal());
		RequinMale requinMale = new RequinMale(800, 7, 18,RequinMale.getPseudoAnimal());
		RequinFemelle requinFem = new RequinFemelle(750, 6, 20,RequinFemelle.getPseudoAnimal());
		PingouinMale pinguoinMale = new PingouinMale(0.6, 0.75, 10,PingouinMale.getPseudoAnimal());
		PingouinFemelle pinguoinFem = new PingouinFemelle(0.5, 0.7, 11,PingouinFemelle.getPseudoAnimal());
		AigleMale aigleMale1 = new AigleMale(5, 0.8, 18,AigleMale.getPseudoAnimal());
		AigleMale aigleMale2 = new AigleMale(6.3, 0.75, 14,AigleMale.getPseudoAnimal());
		AigleFemelle aigleFem = new AigleFemelle(4.8, 0.6, 10,AigleFemelle.getPseudoAnimal());
		//Ajout des enclos dans le zoo
		zoo.ajouterEnclos(voliereAigle);
		zoo.ajouterEnclos(bassinPinguoin);
		zoo.ajouterEnclos(bassinRequin);
		zoo.ajouterEnclos(bassinPoissonR);
		zoo.ajouterEnclos(bassinBaleine);
		zoo.ajouterEnclos(cageTigre);
		zoo.ajouterEnclos(cageOurs);
		zoo.ajouterEnclos(cageLoup);
		//Ajout des animaux dans les enclos
		cageLoup.ajouterAnimal(loupFem);
		cageLoup.ajouterAnimal(loupMale1);
		cageLoup.ajouterAnimal(loupMale2);
		cageOurs.ajouterAnimal(oursfem);
		cageOurs.ajouterAnimal(oursMale);
		cageTigre.ajouterAnimal(tigreMale1);
		cageTigre.ajouterAnimal(tigreMale2);
		cageTigre.ajouterAnimal(tigreFem);
		bassinBaleine.ajouterAnimal(baleineMale);
		bassinBaleine.ajouterAnimal(baleineFem);
		bassinPoissonR.ajouterAnimal(poissonRMale1);
		bassinPoissonR.ajouterAnimal(poissonRMale2);
		bassinPoissonR.ajouterAnimal(poissonRFem1);
		bassinPoissonR.ajouterAnimal(poissonRFem2);
		bassinRequin.ajouterAnimal(requinMale);
		bassinRequin.ajouterAnimal(requinFem);
		bassinPinguoin.ajouterAnimal(pinguoinMale);
		bassinPinguoin.ajouterAnimal(pinguoinFem);
		voliereAigle.ajouterAnimal(aigleMale1);
		voliereAigle.ajouterAnimal(aigleMale2);
		voliereAigle.ajouterAnimal(aigleFem);
		//Mise en place des Vues
		VueZoo vueZoo = new VueZoo(zoo);
		VueEmploye vueEmp = new VueEmploye(zoo.getEmploye());
		VueBoutique vueBout = new VueBoutique(boutique);
		VueCage vueCageLoup = new VueCage(cageLoup);
		VueCage vueCageTigre = new VueCage(cageTigre);
		VueCage vueCageOurs = new VueCage(cageOurs);
		VueCage vueCageSecours = new VueCage(cageSecours);
		VueAquarium vueBassinBaleine = new VueAquarium(bassinBaleine);
		VueAquarium vueBassinPoissonR = new VueAquarium(bassinPoissonR);
		VueAquarium vueBassinPinguoin = new VueAquarium(bassinPinguoin);
		VueAquarium vueBassinRequin = new VueAquarium(bassinRequin);
		VueAquarium vueBassinSecours = new VueAquarium(bassinSecours);
		VueVoliere vueVoliereAigle = new VueVoliere(voliereAigle);
		VueVoliere vueVoliereSecours = new VueVoliere(voliereSecours);
		ArrayList<VueEnclos> listVueEnclos = new ArrayList<VueEnclos>();
		listVueEnclos.add(vueCageLoup);
		listVueEnclos.add(vueCageTigre);
		listVueEnclos.add(vueCageOurs);
		listVueEnclos.add(vueCageSecours);
		listVueEnclos.add(vueBassinBaleine);
		listVueEnclos.add(vueBassinPoissonR);
		listVueEnclos.add(vueBassinPinguoin);
		listVueEnclos.add(vueBassinRequin);
		listVueEnclos.add(vueBassinSecours);
		listVueEnclos.add(vueVoliereAigle);
		listVueEnclos.add(vueVoliereSecours);
		
		zoo.ajouterEnclos(cageSecours);
		zoo.ajouterEnclos(bassinSecours);
		zoo.ajouterEnclos(voliereSecours);
		
		Controleur.systemeZoo(3, 2, 3, vueZoo, vueEmp, vueBout, listVueEnclos);		
	}//zooNumero1()
	
	/**
	 * Fonction principale, permettant de recuperer et executer les actions de l'utilisateur,
	 * ainsi que les action pr�vus par le programme
	 * @param nbActionParTour
	 * 						Nombre d'action r�alisable dans un tour
	 * @param moduloPourModifs
	 * 						Nombre de tour ou bout duquel les enclos vont etre modifi�s
	 * @param moduloPourReproduction
	 * 						Nombre de tour ou bout duquel les animaux vont se reproduire
	 * @param vueZoo
	 * 				une Vue de type Zoo
	 * @param vueEmp
	 * 				une Vue de type Employe
	 * @param vueBout
	 * 				une Vue de type Boutique
	 * @param listVueEnclos
	 * 				liste des vues de tout les enclos
	 */
	public static void systemeZoo(int nbActionParTour, int moduloPourModifs, int moduloPourReproduction, 
									VueZoo vueZoo, VueEmploye vueEmp, VueBoutique vueBout, ArrayList<VueEnclos> listVueEnclos){
		IHM ihm = new IHM(nbActionParTour);
		VueIHM vueIhm = new VueIHM(ihm);	
		int saisie;
		while(true){		
			//actions de l'utilisateurs
			while(ihm.getNbAction() != 0){
				vueZoo.afficherBudgetDuZoo();
				vueZoo.afficherContenuStock(false, true, true);
				vueIhm.afficherMenuAction();
				saisie = ihm.getSaisieUtilisateur(1, 8);
				ihm.executeChoixActionZoo(saisie, vueZoo, vueEmp, listVueEnclos);
				ihm.setNbAction(ihm.getNbAction() - 1);
			}
			//si un animal est endormi
			if(ihm.verifAnimauxEndormi(vueZoo)){
				vueZoo.reveillerAnimaux();
			}
			//tout les x tour modif etat enclos et animaux
			if(ihm.getNumTour() % moduloPourModifs == 0){
				vueZoo.modifierEtatAnimaux();
				vueZoo.modifierEtatEnclos();
			}
			//tout les x tour reproduction des animaux
			if(ihm.getNumTour() % moduloPourReproduction == 0){
				vueZoo.reproductionAnimal();
			}
			vueZoo.tuerAnimaux();
			vueZoo.faireGrandirAnimaux();
			vueZoo.verifierFemelleEnceinte();
			vueZoo.gagnerDeLargent();
			vueIhm.afficherMenuCourse();
			ihm.allerFaireDesAchat(vueBout, vueEmp, vueZoo);
			ihm.setNumTour(ihm.getNumTour() + 1);
			ihm.setNbAction(nbActionParTour);
		}
	}
}//Controleur
