package zoo_system;


public abstract class Controleur {

	/**
	 * Permet de commencer l'une des simulation de zoo
	 */
	public static void zooNumero1(){
		/*
		 * Mise en place du zoo
		 */
		//creaction du zoo et de l'employe
		Zoo zoo = Zoo.getInstance("Zoo marseille", 8, "Jean-luc", 45, 'M', 10, 9, 8);
		
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
		VueEmploye vueEmp = new VueEmploye(zoo.getEmploye());/*
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
		VueAigleFemelle vueAigleFem = new VueAigleFemelle(aigleFem);*/

		Cage cageSecours = new Cage("Cage de remplacement", 35, 5);
		Aquarium bassinSecours = new Aquarium("Bassin de remplacement", 35, 5);
		Voliere voliereSecours = new Voliere("Voliere de remplacement", 35, 5, 10);
		VueCage vueCageSecours = new VueCage(cageSecours);
		VueAquarium vueBassinSecours = new VueAquarium(bassinSecours);
		VueVoliere vueVoliereSecours = new VueVoliere(voliereSecours);
		zoo.ajouterEnclos(cageSecours);
		zoo.ajouterEnclos(bassinSecours);
		zoo.ajouterEnclos(voliereSecours);
		TigreMale  tigreMale = new TigreMale(280, 110, 19,TigreMale.getPseudoAnimal());
		cageTigre.ajouterAnimal(tigreMale);

		Controleur.systemeZoo(3, 2, 3, vueZoo, vueEmp);		
	}//zooNumero1()
	
	/**
	 * Fonction principale, permettant de recuperer et executer les actions de l'utilisateur
	 * ainsi que les action prévus par le programme
	 * @param nbActionParTour
	 * @param moduloPourModifs
	 * @param moduloPourReproduction
	 * @param vueZoo
	 * @param vueEmp
	 */
	public static void systemeZoo(int nbActionParTour, int moduloPourModifs, int moduloPourReproduction, 
									VueZoo vueZoo, VueEmploye vueEmp){
		IHM ihm = new IHM(nbActionParTour);
		VueIHM vueIHM = new VueIHM(ihm);	
		int saisie;
		int numTourModif = 0;
		boolean isModifier = false;
		while(true){		
			//actions de l'utilisateurs
			while(ihm.getNbAction() != 0){
				vueZoo.afficherContenuStock(false);
				vueIHM.afficherMenuAction();
				saisie = ihm.getSaisieUtilisateur(1, 7);
				ihm.executeChoix(saisie, vueZoo, vueEmp);
				ihm.setNbAction(ihm.getNbAction() - 1);
			}
			//si l'état des animaux on été modifier, 2 tour plus tard ils essayent de se reveillés
			if(numTourModif + 2 == ihm.getNumTour() && isModifier){
				vueZoo.reveillerAnimaux();
				isModifier = false;
			}
			//tout les x tour modif etat enclos et animaux
			if(ihm.getNumTour() % moduloPourModifs == 0){
				vueZoo.modifierEtatAnimaux();
				vueZoo.modifierEtatEnclos();
				isModifier = true;
				numTourModif = ihm.getNumTour();
			}
			//tout les x tour reproduction des animaux
			if(ihm.getNumTour() % moduloPourReproduction == 0){
				vueZoo.reproductionAnimal();
			}
			vueZoo.tuerAnimaux();
			vueZoo.faireGrandirAnimaux();
			vueZoo.verifierFemelleEnceinte();
			ihm.setNumTour(ihm.getNumTour() + 1);
			ihm.setNbAction(nbActionParTour);
		}
	}
}//Controleur
