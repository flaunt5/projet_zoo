package zoo_system;


public abstract class Controleur {

	public static void zooNumero1() throws InterruptedException{
		/*
		 * Mise en place du zoo
		 */
		//creaction du zoo et de l'employe
		Zoo zoo = Zoo.getInstance("Zoo marseille", 8, "Jean-luc", 45, 'F');
		//creaction des enclos
		Cage cageLoup = new Cage("Cage des loups", 35, 5);
		Cage cageOurs = new Cage("Cage des ours", 30, 5);
		Cage cageTigre = new Cage("Cage des tigres", 40, 5);
		Aquarium bassinBaleine = new Aquarium("Bassin des baleines", 100, 3);
		Aquarium bassinPoissonR = new Aquarium("Bassin des poissons rouges", 10, 6);
		Aquarium bassinRequin = new Aquarium("Bassin des requins", 40, 5);
		Aquarium bassinPinguoin = new Aquarium("Bassin des pinguoin", 40, 4);
		Voliere voliereAigle = new Voliere("Voliere des aigles", 60, 5, 15);
		//creaction des animaux de base
		LoupMale loupMale1 = new LoupMale(60, 83, 5);
		LoupMale loupMale2 = new LoupMale(70, 85, 6);
		LoupFemelle loupFem = new LoupFemelle(50, 80, 5);
		OursFemelle oursfem = new OursFemelle(450, 110, 15);
		OursMale oursMale = new OursMale(500, 140, 20);
		TigreMale  tigreMale1 = new TigreMale(280, 110, 13);
		TigreMale tigreMale2 = new TigreMale(200, 100, 12);
		TigreFemelle tigreFem = new TigreFemelle(110, 80, 10);
		BaleineMale baleineMale = new BaleineMale(140000, 35, 75);
		BaleineFemelle baleineFem = new BaleineFemelle(135000, 32, 50);
		PoissonRougeMale poissonRMale1 = new PoissonRougeMale(1.2, 39, 8);
		PoissonRougeMale poissonRMale2 = new PoissonRougeMale(1, 40, 7);
		PoissonRougeFemelle poissonRFem1 = new PoissonRougeFemelle(0.5, 32, 11);
		PoissonRougeFemelle poissonRFem2 = new PoissonRougeFemelle(1.5, 30, 5);
		RequinMale requinMale = new RequinMale(800, 7, 18);
		RequinFemelle requinFem = new RequinFemelle(750, 6, 20);
		PingouinMale pinguoinMale = new PingouinMale(0.6, 0.75, 10);
		PingouinFemelle pinguoinFem = new PingouinFemelle(0.5, 0.7, 11);
		AigleMale aigleMale1 = new AigleMale(5, 0.8, 18);
		AigleMale aigleMale2 = new AigleMale(6.3, 0.75, 14);
		AigleFemelle aigleFem = new AigleFemelle(4.8, 0.6, 10);
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
		VueCage vueCageLoups = new VueCage(cageLoup);
		VueCage vueCageOurs = new VueCage(cageOurs);
		VueCage vueCageTigres = new VueCage(cageTigre);
		VueAquarium vueBassinBaleines = new VueAquarium(bassinBaleine);
		VueAquarium vueBassinRequins = new VueAquarium(bassinRequin);
		VueAquarium vueBassinPoissonR = new VueAquarium(bassinPoissonR);
		VueAquarium vueBassinPingouins = new VueAquarium(bassinPinguoin);
		VueVoliere vueVolierAigle = new VueVoliere(voliereAigle);
		VueLoupMale vueLoupMale1 = new VueLoupMale(loupMale1);
		VueLoupMale vueLoupMale2 = new VueLoupMale(loupMale2);
		VueLoupFemelle vueLoupFem = new VueLoupFemelle(loupFem);
		VueOursMale vueOursMale = new VueOursMale(oursMale);
		VueOursFemelle vueOursFem = new VueOursFemelle(oursfem);
		VueTigreMale vueTigreMale1 = new VueTigreMale(tigreMale1);
		VueTigreMale vueTigreMale2 = new VueTigreMale(tigreMale2);
		VueTigreFemelle vueTigreFem = new VueTigreFemelle(tigreFem);
		VueBaleineMale vueBaleineMale = new VueBaleineMale(baleineMale);
		VueBaleineFemelle vueBaleineFem = new VueBaleineFemelle(baleineFem);
		VuePoissonRougeMale vuePoissonRMale1 = new VuePoissonRougeMale(poissonRMale1);
		VuePoissonRougeMale vuePoissonRMale2 = new VuePoissonRougeMale(poissonRMale2);
		VuePoissonRougeFemelle vuePoissonRFem1 = new VuePoissonRougeFemelle(poissonRFem1);
		VuePoissonRougeFemelle vuePoissonRFem2 = new VuePoissonRougeFemelle(poissonRFem2);
		VueRequinMale vueRequinMale = new VueRequinMale(requinMale);
		VueRequinFemelle vueRequinFem = new VueRequinFemelle(requinFem);
		VuePingouinMale vuePinguoinMale = new VuePingouinMale(pinguoinMale);
		VuePingouinFemelle vuePinguoinFem = new VuePingouinFemelle(pinguoinFem);
		VueAigleMale vueAigleMale1 = new VueAigleMale(aigleMale1);
		VueAigleMale vueAigleMale2 = new VueAigleMale(aigleMale2);
		VueAigleFemelle vueAigleFem = new VueAigleFemelle(aigleFem);

		Cage cageLoup2 = new Cage("Cage des loups2", 35, 5);
		VueCage vueCageLoups2 = new VueCage(cageLoup2);
		zoo.ajouterEnclos(cageLoup2);
		LoupMale loupMale3 = new LoupMale(80, 83, 5);
		cageLoup.ajouterAnimal(loupMale3);

		Controleur.systemeZoo(3, 2, 3, vueZoo, vueEmp);		
	}//zooNumero1()
	
	public static void systemeZoo(int nbActionParTour, int moduloPourModifs, int moduloPourReproduction, 
									VueZoo vueZoo, VueEmploye vueEmp) throws InterruptedException{
		IHM ihm = new IHM(nbActionParTour);
		VueIHM vueIHM = new VueIHM(ihm);
		while(true){			
			int saisie;
			while(ihm.getNbAction() != 0){
				vueIHM.afficherMenuAction();
				saisie = ihm.getSaisieUtilisateur(1, 7);
				ihm.executeChoix(saisie, vueZoo, vueEmp);
				ihm.setNbAction(ihm.getNbAction() - 1);
			}
			if(ihm.getNumTour() % moduloPourModifs == 0){
				Thread.sleep(2000);
				vueZoo.modifierEtatAnimaux();
				vueZoo.modifierEtatEnclos();
			}
			if(ihm.getNumTour() % moduloPourReproduction == 0){
				vueZoo.reproductionAnimal();
			}
			vueZoo.verifierFemelleEnceinte();
			ihm.setNumTour(ihm.getNumTour() + 1);
			ihm.setNbAction(nbActionParTour);
		}
	}
}//Controleur
