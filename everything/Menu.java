package everything;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.GridLayout;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.FlowLayout;
import java.io.IOException;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JButton btnMedium;
	private JButton btnSmall;
	private JButton btnVerysmal;
	private JButton btnLarge;
	private JButton btnListEverything;
	private JButton btnListAllUniverses;
	private JButton btnListAllGalaxys;
	private JButton btnListAllStars;
	private JButton btnListAllPlanets;
	private JButton btnListAllMeteors;
	private JButton btnListAllBlack;
	private JButton btnSpace;
	private JButton btnAddPlanet;
	private JButton btnAddMeteor;
	private JButton btnAddBlackHole;
	private JButton btnAddStar;
	private JButton btnAddGalaxy;
	private JButton btnCreateUniverse;
	private JButton btnDeleteEverything;
	private JButton btnRecreateEverything;
	private JButton btnActiveUnlimitedMode;
	private JButton btnDesactiveUnlimitedMode;
	private JButton btnInitialMenu;
	private JButton btnSecondMenu;
	private JButton btnMenuAdmim;
	private JButton btnVoltar;
	private JTextArea textArea;
	private Nebulosa nebulosa = new	 Nebulosa();
	private JLabel jlabel;
	BufferedImage img = ImageIO.read(getClass().getClassLoader().getResource("res/fundo.png"));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
					frame.setSize(600, 150);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Menu() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		mainMenu();
		
	}
	
	public void adicionaImagemDeFundo(){
		Icon img = new ImageIcon((getClass().getClassLoader().getResource("res/sky.gif")));
		jlabel = new JLabel();
		jlabel.setIcon(img);
		add(jlabel);
	}
	
	                                 
	
	public void mainMenu() throws IOException {
		
		btnInitialMenu = new JButton("Generate 'RANDOM' Multiverse");
		btnInitialMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desabilitaMainMenu();
				habilitaInitialMenu();
			}
		});
		
		
		btnSecondMenu = new JButton("Show Multiverse Details");
		btnSecondMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desabilitaMainMenu();
				habilitaSecondMenu();
			}
		});
		
		btnMenuAdmim = new JButton("Menu Admim");
		btnMenuAdmim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desabilitaMainMenu();
				habilitaMenuAdm();			
			}
		});
		
		// initial menu
		
		btnMedium = new JButton("Medium");
		btnMedium.setVisible(false);
		btnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nebulosa.universe_list.size()>0){
					JOptionPane.showMessageDialog(null, "Universo ja foi criado");
				}else{
					nebulosa.medium();
					JOptionPane.showMessageDialog(null,"Universe successfully generated");
				}
				desabilitaInitialMenu();
				habilitaMainMenu();
			}
		});
		
		btnSmall = new JButton("Small");
		btnSmall.setVisible(false);
		btnSmall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nebulosa.universe_list.size()>0){
					JOptionPane.showMessageDialog(null, "Universo ja foi criado");
				}else{
					nebulosa.small();
					JOptionPane.showMessageDialog(null,"Universe successfully generated");
				}
				desabilitaInitialMenu();
				habilitaMainMenu();
			}
		});
		
		btnVerysmal = new JButton("VerySmal");
		btnVerysmal.setVisible(false);
		btnVerysmal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nebulosa.universe_list.size()>0){
					JOptionPane.showMessageDialog(null, "Universo ja foi criado");
				}else{
					nebulosa.verySmall();
					JOptionPane.showMessageDialog(null,"Universe successfully generated");
				}
				desabilitaInitialMenu();
				habilitaMainMenu();
			}
		});
		
		btnLarge = new JButton("Large");
		btnLarge.setVisible(false);
		btnLarge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nebulosa.universe_list.size()>0){
					JOptionPane.showMessageDialog(null, "Universo ja foi criado");
				}else{
					nebulosa.large();
					JOptionPane.showMessageDialog(null,"Universe successfully generated");
				}
				desabilitaInitialMenu();
				habilitaMainMenu();
			}
		});
		
		// second menu
		
		
		btnListEverything = new JButton("List the quantity of objects was Generated");
		btnListEverything.setVisible(false);
		btnListEverything.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt ="";
				try{
					txt = nebulosa.printAllQtde();
				}catch(Exception p){
					JOptionPane.showMessageDialog(null, "No universe found create before");
				}
				habilitaAdicionaTextoNaCaixaTxt(txt);				
			}
		});
		
		btnListAllUniverses = new JButton("List all objects in the universe");
		btnListAllUniverses.setVisible(false);
		btnListAllUniverses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String txt = nebulosa.printAllUniverses();
					habilitaAdicionaTextoNaCaixaTxt(txt);
				}catch(Exception p){
					JOptionPane.showMessageDialog(null, "No universe found create before");
				}
			}
		});
		
		btnListAllGalaxys = new JButton("List all Galaxys");
		btnListAllGalaxys.setVisible(false);
		btnListAllGalaxys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String txt = nebulosa.printAllGalaxyNames();
					habilitaAdicionaTextoNaCaixaTxt(txt);
				}catch(Exception p){
					JOptionPane.showMessageDialog(null, "No Galaxy found create before");
				}
			}
		});
		
		btnListAllStars = new JButton("List all Stars");
		btnListAllStars.setVisible(false);
		btnListAllStars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String txt = nebulosa.printAllStarsNames();
					habilitaAdicionaTextoNaCaixaTxt(txt);
				}catch(Exception p){
					JOptionPane.showMessageDialog(null, "No Star found create before");
				}
			}
		});
		
		btnListAllPlanets = new JButton("List all Planets");
		btnListAllPlanets.setVisible(false);
		btnListAllPlanets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String txt = nebulosa.printAllPlanetNames();
					habilitaAdicionaTextoNaCaixaTxt(txt);
				}catch(Exception p){
					JOptionPane.showMessageDialog(null, "No Planet found create before");
				}
			}
		});
		
		btnListAllMeteors = new JButton("List all Meteors");
		btnListAllMeteors.setVisible(false);
		btnListAllMeteors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String txt = nebulosa.printAllMetorsNames();
					habilitaAdicionaTextoNaCaixaTxt(txt);
				}catch(Exception p){
					JOptionPane.showMessageDialog(null, "No Meteor found create before");
				}
			}
		});
		
		btnListAllBlack = new JButton("List all Black Holes");
		btnListAllBlack.setVisible(false);
		btnListAllBlack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String txt = nebulosa.printAllBlackHoleNames();
					habilitaAdicionaTextoNaCaixaTxt(txt);
				}catch(Exception p){
					JOptionPane.showMessageDialog(null, "No Black hole found create before");
				}
			}
		});
		
		btnSpace = new JButton("Show 2D View");
		btnSpace.setVisible(false);
		btnSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nebulosa.espaco();
				desabilitaSecondMenu();
				habilitaMainMenu();
			}
		});
		
		
		// admin menu
		
		btnAddPlanet = new JButton("Add Planet");
		btnAddPlanet.setVisible(false);
		btnAddPlanet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
                           
				habilitaAddObj("Star", "Planet", nebulosa.printAllStarsNamesQuebra());
			}
		});
		
		btnAddMeteor = new JButton("Add Meteor");
		btnAddMeteor.setVisible(false);
		btnAddMeteor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				habilitaAddObj("Star", "Meteor", nebulosa.printAllStarsNamesQuebra());
				
			}
		});
		
		btnAddBlackHole = new JButton("Add Black Hole");
		btnAddBlackHole.setVisible(false);
		btnAddBlackHole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				habilitaAddObj("Star", "Black Hole", nebulosa.printAllStarsNamesQuebra());                   
			}
		});
		
		btnAddStar = new JButton("Add Star");
		btnAddStar.setVisible(false);
		btnAddStar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				habilitaAddObj("Galaxy", "Star", nebulosa.printAllGalaxyNames());
			}
		});
		
		btnAddGalaxy = new JButton("Add Galaxy");
		btnAddGalaxy.setVisible(false);
		btnAddGalaxy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            try{
                                habilitaAddObj("Universe", "Galaxy", "Universe "+nebulosa.universe_list.get(0).getName());
                            }catch(Exception naoe){
                                JOptionPane.showMessageDialog(null, "No universe found create before");
                            }
				
                            
			}
		});
		
		btnCreateUniverse = new JButton("Create Universe");
		btnCreateUniverse.setVisible(false);
		btnCreateUniverse.addActionListener(new ActionListener() {
                       
                    
			public void actionPerformed(ActionEvent e) {
                            
				
				
                                if(nebulosa.universe_list.size()>0){
					JOptionPane.showMessageDialog(null, "Cannot Create another universe");
				}else{
					nebulosa.createUniverse();
					JOptionPane.showMessageDialog(null,"Universe successfully generated");
				}
			}
		});
		
		btnDeleteEverything = new JButton("Delete Everything");
		btnDeleteEverything.setVisible(false);
		btnDeleteEverything.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nebulosa.deleteEverything();
			}
		});
		
		btnRecreateEverything = new JButton("Recreate Everything");
		btnRecreateEverything.setVisible(false);
		btnRecreateEverything.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nebulosa.recreateEverything();
			}
		});
		
		btnActiveUnlimitedMode = new JButton("Active Unlimited Mode");
		btnActiveUnlimitedMode.setVisible(false);
		btnActiveUnlimitedMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nebulosa.activeUnlimitedMode();
			}
		});
		
		btnDesactiveUnlimitedMode = new JButton("Desactive Unlimited Mode");
		btnDesactiveUnlimitedMode.setVisible(false);
		btnDesactiveUnlimitedMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nebulosa.desactiveUnlimitedMode();
			}
		});
		
	    textArea = new JTextArea();
		textArea.setSize(600, 150);		
		setSize(textArea.getWidth(),textArea.getHeight()+100);
		textArea.setText("");
		textArea.setEnabled(false);
		textArea.setVisible(false);
		
		contentPane.add(textArea);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		contentPane.add(btnInitialMenu);
		contentPane.add(btnSecondMenu);
		contentPane.add(btnMenuAdmim);
		contentPane.add(btnMedium);
		contentPane.add(btnSmall);
		contentPane.add(btnVerysmal);
		contentPane.add(btnLarge);
		contentPane.add(btnListEverything);
		contentPane.add(btnListAllUniverses);
		contentPane.add(btnListAllGalaxys);
		contentPane.add(btnListAllStars);
		contentPane.add(btnListAllPlanets);
		contentPane.add(btnListAllMeteors);
		contentPane.add(btnListAllBlack);
		contentPane.add(btnSpace);
		contentPane.add(btnAddPlanet);
		contentPane.add(btnAddMeteor);
		contentPane.add(btnAddBlackHole);
		contentPane.add(btnAddStar);
		contentPane.add(btnAddGalaxy);
		contentPane.add(btnCreateUniverse);
		contentPane.add(btnDeleteEverything);
		contentPane.add(btnRecreateEverything);
		contentPane.add(btnActiveUnlimitedMode);
		contentPane.add(btnDesactiveUnlimitedMode);
		btnVoltar = new JButton("Voltar");
		btnVoltar.setVisible(true);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desabilitaInitialMenu();
				desabilitaMenuAdm();
				desabilitaSecondMenu();
				habilitaMainMenu();
			}
		});
		contentPane.add(btnVoltar);
	}
	
	public void desabilitaMainMenu() {
		btnInitialMenu.setVisible(false);
		btnSecondMenu.setVisible(false);
		btnMenuAdmim.setVisible(false);
	}
	
	public void habilitaMainMenu() {
		btnInitialMenu.setVisible(true);
		btnSecondMenu.setVisible(true);
		btnMenuAdmim.setVisible(true);
	}
	
	public void desabilitaInitialMenu() {
                btnVerysmal.setVisible(false);
		btnSmall.setVisible(false);
		btnMedium.setVisible(false);
		btnLarge.setVisible(false);
	}
	
	public void habilitaInitialMenu() {
                btnVerysmal.setVisible(true);
		btnSmall.setVisible(true);		
		btnMedium.setVisible(true);
		btnLarge.setVisible(true);
	}
	
	public void desabilitaSecondMenu() {
		btnListEverything.setVisible(false);
		btnListAllUniverses.setVisible(false);
		btnListAllStars.setVisible(false);
		btnListAllPlanets.setVisible(false);
		btnListAllMeteors.setVisible(false);
		btnListAllGalaxys.setVisible(false);
		btnListAllBlack.setVisible(false);
		btnListAllBlack.setVisible(false);
		btnSpace.setVisible(false);
	}
	
	public void habilitaSecondMenu() {
		btnListEverything.setVisible(true);
		btnListAllUniverses.setVisible(true);
		btnListAllStars.setVisible(true);
		btnListAllPlanets.setVisible(true);
		btnListAllMeteors.setVisible(true);
		btnListAllGalaxys.setVisible(true);
		btnListAllBlack.setVisible(true);
		btnListAllBlack.setVisible(true);
		btnSpace.setVisible(true);
	}
	
	public void desabilitaMenuAdm() {
		btnAddPlanet.setVisible(false);
		btnAddMeteor.setVisible(false);
		btnAddBlackHole.setVisible(false);
		btnAddGalaxy.setVisible(false);
		btnAddStar.setVisible(false);
		btnCreateUniverse.setVisible(false);
		btnDeleteEverything.setVisible(false);
		//btnRecreateEverything.setVisible(false);
		//btnActiveUnlimitedMode.setVisible(false);
		//btnDesactiveUnlimitedMode.setVisible(false);
	}
	
	public void habilitaMenuAdm() {
		btnAddPlanet.setVisible(true);
		btnAddMeteor.setVisible(true);
		btnAddBlackHole.setVisible(true);
		btnAddGalaxy.setVisible(true);
		btnAddStar.setVisible(true);
		btnCreateUniverse.setVisible(true);
		btnDeleteEverything.setVisible(true);
		//btnRecreateEverything.setVisible(true);
		//btnActiveUnlimitedMode.setVisible(true);
		//btnDesactiveUnlimitedMode.setVisible(true);
	}
	public void habilitaAdicionaTextoNaCaixaTxt(String txt) {
		CaixaDeTexo frame = new CaixaDeTexo(txt);
	}
	
	public void habilitaAddObj(String tipoPesquisar,String tipoCriar,String txt) {
		AdicionarObj frame = new AdicionarObj(tipoPesquisar,tipoCriar,txt,nebulosa);
	}
}
