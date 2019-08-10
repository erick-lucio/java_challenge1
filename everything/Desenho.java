package everything;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;
import java.awt.image.BufferedImage;
import java.awt.image.VolatileImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Desenho extends JPanel {

	public Universe universe;

	
	Desenho(Universe universe){
		this.universe = universe;
	}

	public void paintComponent(Graphics g) {
		setPreferredSize(new Dimension(12000, 12000));
		Graphics2D g2d = (Graphics2D) g.create();
		super.paintComponent(g2d);
		int largura = 1160;
		int altura = 760;
		boolean linhaGrossaLargura = true;
		Stroke s1 = new BasicStroke(1);
		Stroke s2 = new BasicStroke(2);
		BufferedImage img;
		try {
			setBackground(new Color(10, 10, 10)); // adiciona uma cor de fundo
			BufferedImage planeta1 = ImageIO.read(getClass().getClassLoader().getResource("res/planeta1.png"));
			BufferedImage planeta2 = ImageIO.read(getClass().getClassLoader().getResource("res/planeta2.png"));
			BufferedImage planeta3 = ImageIO.read(getClass().getClassLoader().getResource("res/planeta3.png"));
			BufferedImage planeta4 = ImageIO.read(getClass().getClassLoader().getResource("res/planeta4.png"));
			BufferedImage sun = ImageIO.read(getClass().getClassLoader().getResource("res/sol30px.png"));
			BufferedImage meteoro1 = ImageIO.read(getClass().getClassLoader().getResource("res/meteoro1.png"));
			BufferedImage buraconegro = ImageIO.read(getClass().getClassLoader().getResource("res/blackhole.png"));
			
			for (Galaxy galaxy : this.universe.getGalaxy_list()) {
				g2d.setColor(Color.RED);
				for(Star star:galaxy.getStar_list()){
					System.out.println("X: "+trataX(star.getPositionX())+" Y: "+ trataY(star.getPositionY()));
					g2d.drawImage(sun,trataX(star.getPositionX()), trataY(star.getPositionY()), null);
					int i = 1;
					for(Planet planet:star.getPlanet_list()){
						g2d.setPaint(Color.white);
						g2d.drawString(planet.name,trataX(planet.getPositionX())- planet.name.length() * 2, trataY(planet.getPositionY()) +20);
						if (i == 1) {
							g2d.drawImage(planeta1,trataX(planet.getPositionX()),trataY(planet.getPositionY()), null);
							i++;
							continue;
						}
						if (i == 2) {
							g2d.drawImage(planeta2,trataX(planet.getPositionX()),trataY(planet.getPositionY()), null);
							i++;
							continue;
						}
						if (i == 3) {
							g2d.drawImage(planeta3,trataX(planet.getPositionX()),trataY(planet.getPositionY()), null);
							i++;
							continue;
						}
						if (i == 4) {
							g2d.drawImage(planeta4,trataX(planet.getPositionX()),trataY(planet.getPositionY()), null);
							i=1;
							continue;
						}
					}
					for(Meteor meteor:star.getMeteor_list()){
						g2d.setPaint(Color.white);
						g2d.drawString(meteor.name,trataX(meteor.getPositionX())- meteor.name.length() * 2, trataY(meteor.getPositionY()) +20);
						g2d.drawImage(meteoro1,trataX(meteor.getPositionX()), trataY(meteor.getPositionY()), null);
						
					}
                                        for(BlackHole blackhole:star.getBlackhole_list()){
						g2d.setPaint(Color.white);
						g2d.drawString(blackhole.name,trataX(blackhole.getPositionX())- blackhole.name.length() * 2, trataY(blackhole.getPositionY()) +20);
						g2d.drawImage(buraconegro,trataX(blackhole.getPositionX()), trataY(blackhole.getPositionY()), null);
						
					}
				}
				

			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    
//		 desenhando linhas
//		for (int i = 20; i < largura; i += 20) {
//			g2d.setStroke(s1);
//			if (linhaGrossaLargura) {
//				g2d.setStroke(s2);
//			}
//			linhaGrossaLargura = false;
//			g2d.drawLine(i, 0, i, altura - 20);
//		}
//		for (int i = 0; i < altura; i += 20) {
//			g2d.setStroke(s1);
//			if (i == altura - 20) {
//				g2d.setStroke(s2);
//			}
//			g2d.drawLine(20, i, largura, i);
//		}
//		g2d.setStroke(s2);

		// adicionando ponto

	}
	
	public int trataX(int x){
		x= x+1;
		x=x*20-5;
		return x;
	}
	
	public int trataY(int y){
		y = 500-y;
		y=y*20-5;
		return y;
	}
	
	public void txt(List<List<String>> mensagens) {
		File arquivo;
		PrintStream ps;
		arquivo = new File("");
		int j = 0;
		try {
			ps = new PrintStream(arquivo);
			for (List<String> mensagem : mensagens) {
				ps.print(System.getProperty("line.separator")
						+ System.getProperty("line.separator") + j + " " + mensagem.get(0)+ " " +mensagem.get(1)+ " "  +mensagem.get(2)+ " " +mensagem.get(3)+ " " +mensagem.get(4)+ " " +mensagem.get(5)+" " +mensagem.get(6)+" " +mensagem.get(7));
				j++;
			}
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}