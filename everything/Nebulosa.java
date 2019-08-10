/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everything;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;

/**
 * 
 * @author user
 */
public class Nebulosa extends SpaceSize {
	public List listForMenu;
	// BigInteger bigInteger = BigInteger.valueOf(n);
	private int voidspace = 1;// value that determine space beteween objects
	private int totalSize;
	private String enterKey;
	private int unlimitedmode = 0;
	private int qtdUniverseGenerated;
	private int qtdGalaxyGenerated;
	private int qtdStarGenerated;
	private int qtdPlanetGenerated;
	private int qtdMeteorGenerated;
	private int qtdBlackHoleGenerated;
	private int qtdPlanet = 0;
	private int qtdBlackhole = 0;
	private int qtdGalaxy = 0;
	private int qtdMeteor = 0;
	private int qtdStar = 0;
	private int qtdUniverse = 0;

	private int advise = 0;
	private int adminPassword = 95432;
	private String usedList = "nebulosa";
	private int haveentitys = 0;
	private int universecreated;
	private int galaxycreated;
	private int starcreated;
	private int details = 0;
	private int tryvariable;

	Scanner read = new Scanner(System.in);
	Letters letter = new Letters();
	public List<Universe> universe_list = new ArrayList<Universe>();

	public String universeName;
	public String galaxyName;
	public String starName;
	public String planetsName;
	public String meteorsName;
	public String blackHolesName;
	private int universeQtdTotal;
	private int galaxyQtdTotal;
	private int starsQtdTotal;
	private int planetsQtdTotal;
	private int meteorsQtdTotal;
	private int blackHolesQtdTotal;

	/*
	 * int qtdPlanets,int qtdBlackHole,int qtdGalaxys,int qtdMeteor, int
	 * qtdStar,int qtdUniverse
	 * Nebulosa(qtdPlanets,qtdBlackHole,qtdGalaxys,qtdMeteor
	 * ,qtdStar,qtdUniverse);
	 */
	public Nebulosa() {

	}

	/*
	 * public void startNebulosa() {
	 * 
	 * for(int i = 1; i < rand.nextInt(10); i++){ lista.add(i);
	 * 
	 * }
	 * 
	 * uni.setName("Universe 1"); uni.setStars(lista);
	 * System.out.println("teste:" + uni.getStars()); lista.clear();
	 * 
	 * 
	 * for(int i = 1; i < rand.nextInt(10); i++){ lista.add(i); }
	 * star.setPlanet(lista); // System.out.println("teste:" +
	 * star.getPlanet()); }
	 */

	public List<Universe> getUniverse_list() {
		return universe_list;
	}

	public void setUniverse_list(List<Universe> universe_list) {
		this.universe_list = universe_list;
	}

	public int getUniverseQtdTotal() {
		return universeQtdTotal;
	}

	public void setUniverseQtdTotal(int universeQtdTotal) {
		this.universeQtdTotal = universeQtdTotal;
	}

	public int getGalaxyQtdTotal() {
		return galaxyQtdTotal;
	}

	public void setGalaxyQtdTotal(int galaxyQtdTotal) {
		this.galaxyQtdTotal = galaxyQtdTotal;
	}

	public int getStarsQtdTotal() {
		return starsQtdTotal;
	}

	public void setStarsQtdTotal(int starsQtdTotal) {
		this.starsQtdTotal = starsQtdTotal;
	}

	public int getPlanetsQtdTotal() {
		return planetsQtdTotal;
	}

	public void setPlanetsQtdTotal(int planetsQtdTotal) {
		this.planetsQtdTotal = planetsQtdTotal;
	}

	public int getMeteorsQtdTotal() {
		return meteorsQtdTotal;
	}

	public void setMeteorsQtdTotal(int meteorsQtdTotal) {
		this.meteorsQtdTotal = meteorsQtdTotal;
	}

	public int getBlackHolesQtdTotal() {
		return blackHolesQtdTotal;
	}

	public void setBlackHolesQtdTotal(int blackHolesQtdTotal) {
		this.blackHolesQtdTotal = blackHolesQtdTotal;
	}

	public void verySmall() {

		this.qtdPlanetGenerated = 6 + (int) (Math.random() * (15 - 6));

		this.qtdBlackHoleGenerated = 1 + (int) (Math.random() * (1 - 1));

		this.qtdGalaxyGenerated = 3 + (int) (Math.random() * (5 - 3));

		this.qtdMeteorGenerated = 2 + (int) (Math.random() * (10 - 2));

		this.qtdStarGenerated = 3 + (int) (Math.random() * (5 - 3));

		this.qtdUniverseGenerated = 1;

		if (this.qtdUniverseGenerated == 0) {
			this.qtdUniverseGenerated++;

		}
		if (this.qtdPlanetGenerated == 0) {
			this.qtdPlanetGenerated++;
		}
		if (this.qtdStarGenerated == 0) {
			qtdStarGenerated++;
		}
		if (this.qtdMeteorGenerated == 0) {
			this.qtdMeteorGenerated++;
		}
		if (this.qtdGalaxyGenerated == 0) {
			this.qtdGalaxyGenerated++;
		}
		if (this.qtdBlackHoleGenerated == 0) {
			this.qtdBlackHoleGenerated++;
		}
		//System.out.println("We are creating your Multiverse please wait a little\n");

		createAll();
		universecreated = 1;
		galaxycreated = 1;
		starcreated = 1;
		haveentitys = 1;

	}

	public void small() {

		this.qtdPlanetGenerated = 7 + (int) (Math.random() * (15 - 7));

		this.qtdBlackHoleGenerated = 1 + (int) (Math.random() * (3 - 1));

		this.qtdGalaxyGenerated = 10 + (int) (Math.random() * (30 - 10));

		this.qtdMeteorGenerated = 5 + (int) (Math.random() * (15 - 5));

		this.qtdStarGenerated = 5 + (int) (Math.random() * (10 - 5));

		this.qtdUniverseGenerated = 1;

		if (this.qtdUniverseGenerated == 0) {
			this.qtdUniverseGenerated++;

		}
		if (this.qtdPlanetGenerated == 0) {
			this.qtdPlanetGenerated++;
		}
		if (this.qtdStarGenerated == 0) {
			qtdStarGenerated++;
		}
		if (this.qtdMeteorGenerated == 0) {
			this.qtdMeteorGenerated++;
		}
		if (this.qtdGalaxyGenerated == 0) {
			this.qtdGalaxyGenerated++;
		}
		if (this.qtdBlackHoleGenerated == 0) {
			this.qtdBlackHoleGenerated++;
		}
		//System.out.println("We are creating your Multiverse please wait a little\n");

		createAll();
		universecreated = 1;
		galaxycreated = 1;
		starcreated = 1;
		haveentitys = 1;

	}

	public void medium() {

		this.qtdPlanetGenerated = 15 + (int) (Math.random() * (30 - 15));

		this.qtdBlackHoleGenerated = 3 + (int) (Math.random() * (6 - 3));

		this.qtdGalaxyGenerated = 10 + (int) (Math.random() * (25 - 10));

		this.qtdMeteorGenerated = 5 + (int) (Math.random() * (18 - 5));

		this.qtdStarGenerated = 8 + (int) (Math.random() * (25 - 8));

		this.qtdUniverseGenerated = 1;

		if (this.qtdUniverseGenerated == 0) {
			this.qtdUniverseGenerated++;

		}
		if (this.qtdPlanetGenerated == 0) {
			this.qtdPlanetGenerated++;
		}
		if (this.qtdStarGenerated == 0) {
			qtdStarGenerated++;
		}
		if (this.qtdMeteorGenerated == 0) {
			this.qtdMeteorGenerated++;
		}
		if (this.qtdGalaxyGenerated == 0) {
			this.qtdGalaxyGenerated++;
		}
		if (this.qtdBlackHoleGenerated == 0) {
			this.qtdBlackHoleGenerated++;
		}
		//System.out.println("We are creating your Multiverse please wait a little\n");

		createAll();
		universecreated = 1;
		galaxycreated = 1;
		starcreated = 1;
		haveentitys = 1;

	}

	public void large() {

		this.qtdPlanetGenerated = 20 + (int) (Math.random() * (50 - 20));

		this.qtdBlackHoleGenerated = 5 + (int) (Math.random() * (8 - 5));

		this.qtdGalaxyGenerated = 15 + (int) (Math.random() * (50 - 15));

		this.qtdMeteorGenerated = 15 + (int) (Math.random() * (30 - 15));

		this.qtdStarGenerated = 25 + (int) (Math.random() * (50 - 25));

		this.qtdUniverseGenerated = 1;

		if (this.qtdUniverseGenerated == 0) {
			this.qtdUniverseGenerated++;

		}
		if (this.qtdPlanetGenerated == 0) {
			this.qtdPlanetGenerated++;
		}
		if (this.qtdStarGenerated == 0) {
			qtdStarGenerated++;
		}
		if (this.qtdMeteorGenerated == 0) {
			this.qtdMeteorGenerated++;
		}
		if (this.qtdGalaxyGenerated == 0) {
			this.qtdGalaxyGenerated++;
		}
		if (this.qtdBlackHoleGenerated == 0) {
			this.qtdBlackHoleGenerated++;
		}
		//System.out.println("We are creating your Multiverse please wait a little\n");

		createAll();
		universecreated = 1;
		galaxycreated = 1;
		starcreated = 1;
		haveentitys = 1;

	}

	public void ultimateMode() {

		this.qtdPlanetGenerated = 50 + (int) (Math.random() * (200 - 50));

		this.qtdBlackHoleGenerated = 50 + (int) (Math.random() * (200 - 50));

		this.qtdGalaxyGenerated = 50 + (int) (Math.random() * (200 - 50));

		this.qtdMeteorGenerated = 50 + (int) (Math.random() * (200 - 50));

		this.qtdStarGenerated = 50 + (int) (Math.random() * (200 - 50));

		this.qtdUniverseGenerated = 1;

		if (this.qtdUniverseGenerated == 0) {
			this.qtdUniverseGenerated++;

		}
		if (this.qtdPlanetGenerated == 0) {
			this.qtdPlanetGenerated++;
		}
		if (this.qtdStarGenerated == 0) {
			qtdStarGenerated++;
		}
		if (this.qtdMeteorGenerated == 0) {
			this.qtdMeteorGenerated++;
		}
		if (this.qtdGalaxyGenerated == 0) {
			this.qtdGalaxyGenerated++;
		}
		if (this.qtdBlackHoleGenerated == 0) {
			this.qtdBlackHoleGenerated++;
		}

		// BigInteger bigInteger = BigInteger.valueOf()

		createAll();
		universecreated = 1;
		galaxycreated = 1;
		starcreated = 1;
		haveentitys = 1;

	}

	public void espaco() {
		try {
			try {
				geraTela(universe_list.get(0));
			} catch (NullPointerException e) {

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// default:
	// if (this.adminPassword == this.secondVariableMenu) {
	// letter.cls();
	// System.out.print("   WELCOME TO  ADMIN MENU    \n");
	// adminmenu();
	// letter.cls();
	// } else {
	// System.out.println("\n\n\n\nInvalid Option");
	// }
	// secondVariableMenu = 0;
	// this.secondVariableMenu = 0;
	// break;
	// } //ERICK TRABSON WITH MICAEL HELP
	//
	// }
	// letter.cls();
	// }
	// Metodos de criaçao individuais
	public void createAll() {
		// universe_list.clear();

		SpaceSize spacesize;
		if (universe_list == null) {
			universe_list = new ArrayList();
		}

		// System.out.println(qtdUniverseGenerated + " -" + qtdGalaxyGenerated +
		// " -" + qtdStarGenerated + " -" + qtdPlanetGenerated + " -" +
		// qtdMeteorGenerated + " -" + qtdBlackHoleGenerated + " -" );

		// create everything
		// ////////////////////////////////////////////////
		for (int i = 1; i <= qtdUniverseGenerated; i++) {
			Universe universe = createUniverseRandom();
			this.qtdUniverse++;
			// System.out.println(universe.getName() + "   TESTE UNIVERSE");

			// /////////////////////////////////////////////////////
			for (int k = 1; k <= qtdGalaxyGenerated; k++) {
				Galaxy galaxy = createGalaxyRandom(universe);
				galaxy.setUniverse(universe);//
				this.qtdGalaxy++;
				// System.out.println(galaxy.getName() + "   TESTE galaxy");

				// ////////////////////////////////////////////////////
				for (int l = 1; l <= qtdStarGenerated; l++) {
					Star star = createStarRandom(galaxy);
					star.setGalaxy(galaxy);
					star.setUniverse(universe);
					this.qtdStar++;
					// System.out.println(star.getName() + "   TESTE star");

					// //////////////////////////////////////////
					for (int q = 1; q <= qtdPlanetGenerated; q++) {
						Planet planet = createPlanetRandom(star);
						planet.setStar(star);
						planet.setUniverse(universe);
						this.qtdPlanet++;
						star.setR(planet.getR() * voidspace);
						star.planet_list.add(planet);

						// System.out.println(planet.getName() +
						// "   TESTE planet");
					}

					// ////////////////////////////////////////////
					for (int w = 1; w <= qtdMeteorGenerated; w++) {
						Meteor meteor = createMeteorRandom(star);
						meteor.setStar(star);
						meteor.setUniverse(universe);
						// System.out.println(meteor.getName() +
						// "   TESTE meteor");
						this.qtdMeteor++;
						star.setR(meteor.getR() * voidspace);
						star.meteor_list.add(meteor);

					}

					// ///////////////////////////////////////
					for (int e = 1; e <= qtdBlackHoleGenerated; e++) {
						BlackHole blackhole = createBlackholeRandom(star);
						blackhole.setStar(star);
						blackhole.setUniverse(universe);
						this.qtdBlackhole++;
						star.setR(blackhole.getR() * voidspace);
						star.blackhole_list.add(blackhole);
						// System.out.println(blackhole.getName() +
						// "   TESTE blackhole");
					}
					galaxy.setR(star.getR() * voidspace);
					galaxy.star_list.add(star);

				}

				universe.setR(galaxy.getR() * voidspace);
				universe.galaxy_list.add(galaxy);

			}

			universe_list.add(universe);

		}

	};

	public Universe createUniverseRandom() {
		Universe universe = new Universe();
		universe.setName(letter.createRandonNames(10));
		// DEFINE O TAMANHO DO UNIVERSO
		Content universeXY[][] = new Content[100][100];

		// /

		return universe;
	};

	public Galaxy createGalaxyRandom(Universe universe) {
		Galaxy galaxy = new Galaxy();
		galaxy.setUniverse(universe);
		galaxy.setName(letter.createRandonNames(12));
		galaxy.geraXY(galaxy, galaxy.getUniverse());
		// MAX PLANETS R=5,METEOR R=2,BLACKHOLE R=15- 50 IF IN THE CENTER OF
		// GALAXY,STAR R+=PLANET+METEOR+BLACKHOLE ,GALAXY R += STAR , UNIVERSE
		// R+= GALAXY;

		return galaxy;
	};

	public Star createStarRandom(Galaxy galaxy) {
		Star star = new Star();
		star.setGalaxy(galaxy);
		star.setName(letter.createRandonNames(14));
		do {
			star.setMass(rand.nextInt(500000));
		} while (star.getMass() < 200000);
		star.geraXY(star, star.getGalaxy());

		return star;
	};

	public Planet createPlanetRandom(Star star) {
		Planet planet = new Planet();
		// GENERATE NAME
		planet.setStar(star);
		planet.setName(letter.createRandonNames(16));
		// //GENERATE MASS
		// do{
		planet.setMass(rand.nextInt(200000));
		// }while(planet.getMass()< 50000);
		// //GENERATE RADIUS
		// do{
		planet.setR(rand.nextInt(8));
		// }while(planet.getR() <= 5 || planet.getR() > 8);
		// //TEST PART TO GENERATE X,Y
		// planet.setPositionX(rand.nextInt(1000));
		// planet.setPositionY(rand.nextInt(1000));
		// //por a funçao em planetas, vai ter 2 funçao uma verifica e cria o
		// x y e a outra insere
		// this.xmax += 2*(getR());
		// this.ymax += 2*(getR());
		planet.geraXY(planet, planet.getStar());

		return planet;
	};

	public BlackHole createBlackholeRandom(Star star) {
		BlackHole blackhole = new BlackHole();
		blackhole.setStar(star);
		blackhole.setName(letter.createRandonNames(16));
		// do{
		// blackhole.setMass(rand.nextInt(50000000));
		// }while(blackhole.getMass()< 10000000);
		// do{
		blackhole.setMass(rand.nextInt(200000));
		// }while(blackhole.getMass()< 50000);
		// GENERATE RADIUS
		// do{
		blackhole.setR(rand.nextInt(15));
		// }while(blackhole.getR() <= 4 || blackhole.getR() > 15);
		// TEST PART TO GENERATE X,Y
		// blackhole.setPositionX(rand.nextInt(1000));
		// blackhole.setPositionY(rand.nextInt(1000));
		// por a funçao em planetas, vai ter 2 funçao uma verifica e cria o x
		// y e a outra insere
		// this.xmax += 2*(getR());
		// this.ymax += 2*(getR());
		blackhole.geraXY(blackhole, blackhole.getStar());

		return blackhole;
	};

	public Meteor createMeteorRandom(Star star) {
		Meteor meteor = new Meteor();
		meteor.setStar(star);
		meteor.setName(letter.createRandonNames(16));
		// do{
		meteor.setMass(rand.nextInt(1000));
		// }while(meteor.getMass()< 500);
		//
		//
		// do{
		meteor.setR(rand.nextInt(4));
		// }while(meteor.getR() <= 0 || meteor.getR() > 4);
		// TEST PART TO GENERATE X,Y
		meteor.setPositionX(rand.nextInt(1000));
		meteor.setPositionY(rand.nextInt(1000));
		// por a funçao em planetas, vai ter 2 funçao uma verifica e cria o x
		// y e a outra insere
		// this.xmax += 2*(getR());
		// this.ymax += 2*(getR());
		meteor.geraXY(meteor, meteor.getStar());

		return meteor;
	}

	public void addPlanet(String starName,String nomePlanet) throws Exception{

		for (Universe universe : universe_list) {
			if (universe.galaxy_list != null) {
				for (Galaxy galaxy : universe.galaxy_list) {
					if (galaxy.star_list != null) {
						for (Star star : galaxy.star_list) {
							if (star.getName().replace("Star ", "").equals(starName)) {
								Planet planet = new Planet(nomePlanet);
								planet.geraXY(planet, star);
								star.setPlanet(planet);
								this.qtdPlanet++;

							}else{
								Exception e;
							}

						}
					}

				}
			}

		}

	}

	public void addMeteor(String starName, String meteorName) throws Exception {
		letter.cls();
		for (Universe universe : universe_list) {
			if (universe.galaxy_list != null) {
				for (Galaxy galaxy : universe.galaxy_list) {
					if (galaxy.star_list != null) {
						for (Star star : galaxy.star_list) {
							if (star.getName().replace("Star ", "").equals(starName)) {
								Meteor meteor = new Meteor(meteorName);
								meteor.geraXY(meteor, star);
								star.setMeteor(meteor);
								this.qtdMeteor++;
							}else{
								Exception e;
							}

						}
					}

				}
			}

		}

	}

	public void addBlackHole(String starName, String blackHoleName) throws Exception {
		letter.cls();
		for (Universe universe : universe_list) {
			if (universe.galaxy_list != null) {
				for (Galaxy galaxy : universe.galaxy_list) {
					if (galaxy.star_list != null) {
						for (Star star : galaxy.star_list) {
							if (star.getName().replace("Star ", "").equals(starName)) {
								BlackHole blackHole = new BlackHole(blackHoleName);
								blackHole.geraXY(blackHole, star);
								star.setBlackHole(blackHole);
								this.qtdBlackhole++;
							}else{
								Exception e;
							}

						}
					}

				}
			}

		}

	}

	public void addStar(String galaxyName,String starName) throws Exception {
		// criacao de estrelas
		letter.cls();
		for (Universe universe : universe_list) {
			if (universe.galaxy_list != null) {
				for (Galaxy galaxy : universe.galaxy_list) {
					if (galaxy.getName().replace("Galaxy ", "").equals(galaxyName)) {
						Star star = new Star(starName);
						star.geraXY(star, galaxy);
						galaxy.setStar(star);
						this.qtdStar++;
						starcreated = 1;
					}else{
						Exception e;
					}
				}
			}
		}

	}

	public void addGalaxy(String universeName,String galaxyName) throws Exception {

		// criacao de galaxyas
		letter.cls();
		for (Universe universe : universe_list) {
			if (universe.getName().replace("Universe ", "").equals(universeName)) {
				Galaxy galaxy = new Galaxy(galaxyName);
				galaxy.geraXY(galaxy, universe);
				universe.setGalaxy(galaxy);
				this.qtdGalaxy++;
			}else{
				Exception e;
			}
		}

	}

	public void createUniverse() {
		try {
			universe_list.clear();
		} catch (NullPointerException e) {

		}
		//System.out.println("Please enter name Universe");
		String universeName = "wagnerbronze";
		Universe universe = new Universe(universeName);
		if (universe_list == null) {
			universe_list = new ArrayList();
		}
		universe_list.add(universe);

		universecreated = 1;
		haveentitys = 1;
		this.qtdUniverse++;

	}

	public void deleteEverything() {
		// ERICK TRABSON WITH MICAEL HELP

		try {
			universe_list.clear();
		} catch (NullPointerException e) {

		}
		qtdPlanet = 0;
		qtdBlackhole = 0;
		qtdGalaxy = 0;
		qtdMeteor = 0;
		qtdStar = 0;
		qtdUniverse = 0;
		//System.out.println("Everything was deleted");
		letter.cls();
		haveentitys = 0;
		universecreated = 0;
		galaxycreated = 0;
		starcreated = 0;

	}

	public void recreateEverything() {
		universe_list.clear();
		universecreated = 1;
		galaxycreated = 1;
		starcreated = 1;
		haveentitys = 1;

	}

	public void activeUnlimitedMode() {
		//System.out.println("unlimited mode Activated");
		letter.cls();
		this.unlimitedmode = 1;

	}

	public void desactiveUnlimitedMode() {
		// ERICK TRABSON WITH MICAEL HELP
		//
            
            
            System.out.println("unlimited mode Desactivated");
		letter.cls();
		this.unlimitedmode = 0;

	}

	public String printAllQtde() throws NullPointerException {
		String txt = "Quantity of Universes Generated " + this.qtdUniverse
				+ "\n" + "Quantity of Galaxys Generated " + this.qtdGalaxy
				+ "\n" + "Quantity of Stars Generated " + this.qtdStar + "\n"
				+ "Quantity of Planets Generated " + this.qtdPlanet
				+ "\nQuantity of Meteors Generated " + this.qtdMeteor + "\n"
				+ "Quantity of BlackHoles Generated " + this.qtdBlackhole
				+ "\n"/*
					 * +
					 * "\n\n\n\n\nCONTENT OF THE LINES\n\n----\nPlanet/Meteor/BlackHole\n----\n"
					 * + "------------\nStar\n------------ \n"+
					 * "---------------------------------\nGalaxy\n---------------------------------\n"
					 * +
					 * "-----------------------------------------------------------------------------------\nUniverse\n-----------------------------------------------------------------------------------\n"
					 */;
		return txt;

	}

	public String printAllUniverses() throws NullPointerException {
		// Lista os universos
		String txt = "";
		for (Universe universe : universe_list) {
			txt = "Universe " + universe.getName() + "\n";

			for (Galaxy galaxy : universe.galaxy_list) {
				// if(details == 1){
				// System.out.println("Galaxy "+galaxy.getName()+
				// " from universe "+universe.getName());
				// }else{
				txt += "Galaxy " + galaxy.getName() + "\n";
				// }

				for (Star star : galaxy.star_list) {
					// if(details == 1){
					// System.out.println("Star "+star.getName()+
					// " from Galaxy "+galaxy.getName()+
					// " from universe "+universe.getName());
					// }else{
                                        txt += "Star " + star.getName() + "\n";
					//System.out.println("Star " + star.getName());
					// }

					for (Planet planet : star.planet_list) {
						// if(details == 1){
						// System.out.println("Planet "+planet.getName()+
						// " from Star "+star.getName()+
						// " from Galaxy "+galaxy.getName()+
						// " from universe "+universe.getName());
						// }else{
						txt += "Planet " + planet.getName() + "\n";
						// }
					}

					for (Meteor meteor : star.meteor_list) {
						// if(details == 1){
						// System.out.println("Meteor "+meteor.getName()+
						// " from Star "+star.getName()+
						// " from Galaxy "+galaxy.getName()+
						// " from universe "+universe.getName());
						// }else{
						txt += "Meteor " + meteor.getName() + "\n";
						// }
					}

					for (BlackHole blackhole : star.blackhole_list) {
						// if(details == 1){
						// System.out.println("Black Hole "+blackhole.getName()+
						// " from Star "+star.getName()+
						// " from Galaxy "+galaxy.getName()+
						// " from universe "+universe.getName());
						// }else{
						txt += "Black Hole " + blackhole.getName() + "\n";
						// }
					}

				}

			}

		}
		// LIST THE UNIVERSES
		// ERICK TRABSON WITH MICAEL HELP
		details = 0;
		letter.cls();
		return txt;
	}

	// ERICK TRABSON WITH MICAEL HELP
	public String printAllUniversesNames() throws NullPointerException {
		// Lista os universos
		String txt = "";
		for (Universe universe : universe_list) {
			txt += "Universe " + universe.getName() + "\n";
		}
		// LIST THE UNIVERSES
		// ERICK TRABSON WITH MICAEL HELP
		details = 0;
		letter.cls();
		return txt;
	}

	public String printAllGalaxyNames() throws NullPointerException {
		String txt = "";
		for (Universe universe : universe_list) {

			for (Galaxy galaxy : universe.galaxy_list) {
				txt += "Galaxy " + galaxy.getName() + "\n";
			}

		}

		letter.cls();
		return txt;
	} // ERICK TRABSON WITH MICAEL HELP

	public String printAllStarsNames() throws NullPointerException {
		String txt = "";
		for (Universe universe : universe_list) {

			for (Galaxy galaxy : universe.galaxy_list) {

				for (Star star : galaxy.star_list) {
					txt += "Star " + star.getName() + "\n";
				}

			}

		}

		letter.cls();
		return txt;
	}
	
	public String printAllStarsNamesQuebra() throws NullPointerException {
		String txt = "";
		for (Universe universe : universe_list) {

			for (Galaxy galaxy : universe.galaxy_list) {

				for (Star star : galaxy.star_list) {
					txt +=star.getName() + " || ";
				}

			}

		}

		letter.cls();
		return txt;
	}
	public String printAllPlanetNames() throws NullPointerException {
		String txt = "";
		for (Universe universe : universe_list) {

			for (Galaxy galaxy : universe.galaxy_list) {

				for (Star star : galaxy.star_list) {

					for (Planet planet : star.planet_list) {
                                                txt += "Planet " + planet.getName()+"\n";
					//	txt += "Planet " + planet.getName() + " has "
						//		+ planet.getMass()
							//	+ " KG, and his location is "
							//	+ planet.getPositionX() + ","
							//	+ planet.getPositionY() + "\n";
					}

				}

			}

		}

		letter.cls();
		return txt;
	}

	public String printAllMetorsNames() throws NullPointerException {
		String txt = "";
		for (Universe universe : universe_list) {

			for (Galaxy galaxy : universe.galaxy_list) {

				for (Star star : galaxy.star_list) {

					for (Meteor meteor : star.meteor_list) {
						txt += "Meteor " + meteor.getName() + "\n";
					}

				}

			}

		}

		letter.cls();
		return txt;
	}

	// ERICK TRABSON WITH MICAEL HELP
	public String printAllBlackHoleNames() throws NullPointerException {

		String txt = "";
		for (Universe universe : universe_list) {

			for (Galaxy galaxy : universe.galaxy_list) {

				for (Star star : galaxy.star_list) {

					for (BlackHole blackhole : star.blackhole_list) {
						txt += "BlackHole " + blackhole.getName() + "\n";
					}

				}

			}

		}

		letter.cls();
		return txt;
	}

	// Esses 3 metodos foram feitos para retornar apenas Universos,Galaxyas
	// estrelas
	public void printListUniverse() throws NullPointerException {

		for (Universe universe : universe_list) {
			//System.out.println("Universe " + universe.getName());
		}

	}

	public void printListGalaxy() throws NullPointerException {

		for (Universe universe : universe_list) {

			for (Galaxy galaxy : universe.galaxy_list) {
				//System.out.println("Galaxy " + galaxy.getName());
			}

		}

	}

	public void printListStar() throws NullPointerException {

		for (Universe universe : universe_list) {

			for (Galaxy galaxy : universe.galaxy_list) {

				for (Star star : galaxy.star_list) {
					//System.out.println("Star " + star.getName());
				}

			}

		}

	}

	// ERICK TRABSON WITH MICAEL HELP
	public List<Planet> criaListaPlanetasSeparadosPorVirgula(String[] planets) {
		List<Planet> listPlanets = new ArrayList<Planet>();
		for (int i = 0; i < planets.length; i++) {
			Planet planet = new Planet(planets[i]);
			listPlanets.add(planet);
		}
		return listPlanets;
	}

	public List<Meteor> criaListaMeteorosSeparadosPorVirgula(String[] meteors) {
		List<Meteor> listMeteors = new ArrayList<Meteor>();
		for (int i = 0; i < meteors.length; i++) {
			Meteor meteor = new Meteor(meteors[i]);
			listMeteors.add(meteor);
		}
		return listMeteors;
	}

	public List<BlackHole> criaListaBuracoNegroSeparadosPorVirgula(
			String[] balckHoles) {
		List<BlackHole> listBlackHoles = new ArrayList<BlackHole>();
		for (int i = 0; i < balckHoles.length; i++) {
			BlackHole balckHole = new BlackHole(balckHoles[i]);
			listBlackHoles.add(balckHole);
		}
		return listBlackHoles;
	}

	// ERICK TRABSON WITH MICAEL HELP
	// public void som() {
	// try {
	// // Carrega o arquivo de áudio (não funciona com .mp3, só .wav)
	// String resource = "./beep-02.wav";
	// InputStream input = getClass().getResourceAsStream(resource);
	// Clip oClip = AudioSystem.getClip();
	// AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);
	// oClip.open(audioInput);
	//
	// oClip.loop(0); // Toca uma vez
	// //clip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso
	// de músicas)
	//
	// // Para a execução (senão o programa termina antes de você ouvir o
	// som)
	// SwingUtilities.invokeLater(new Runnable() {
	// public void run() {
	// JOptionPane.showMessageDialog(null, "Clique pra fechar!");
	// }
	// });
	// } catch (Exception e) {
	// }
	//
	// }
	// @Override
	// public void generatespace() {
	// throw new UnsupportedOperationException("Not supported yet."); //To
	// change body of generated methods, choose Tools | Templates.
	// }

	// @Override
	// public void generatespace() {
	//
	// }
	//
	// @Override
	// public void generatespacecreate() {
	//
	// }
	void fullfillUniverseRandom() {
		for (Universe universe : universe_list) {
			// universe.generatespace();

			for (Galaxy galaxy : universe.galaxy_list) {
				// galaxy.setUniverseXY(universe.getUniverseXY());
				// galaxy.generatespace();
				// universe.setUniverseXY(galaxy.getUniverseXY());
				for (Star star : galaxy.star_list) {

					for (Planet planet : star.planet_list) {

					}

					for (Meteor meteor : star.meteor_list) {

					}

					for (BlackHole blackhole : star.blackhole_list) {

					}

				}

			}

		}
	}

	public void geraTela(Universe universe) throws IOException {

		// Desenho d1 = new Desenho(pontos); // x max 58 y max 37
		Desenho d1 = new Desenho(universe);
		final JFrame jf = new JFrame();
		JPanel contentPane = new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setBackground(Color.blue);
		JScrollPane scroll = new JScrollPane(d1);
		jf.setSize(1300, 800);
		jf.setVisible(true);
		jf.add(scroll);
		JRootPane meurootpane = jf.getRootPane();
		meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
		meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
					public void actionPerformed(ActionEvent e) {
						jf.setVisible(false);
					}
				});

	}
}
