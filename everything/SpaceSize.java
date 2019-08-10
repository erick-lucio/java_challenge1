/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everything;
import  java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



/**
 * //ERICK TRABSON WITH MICAEL HELP
 * @author user
 */
public abstract class SpaceSize {



    public int mass;
    public String name;
    public int r;
    public int area;
    public int positionX;
    public int positionY;
     Random rand = new Random();
    Letters letters = new Letters();
    
    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public int universeY[];
    public int numberRandom;
     //ERICK TRABSON WITH MICAEL HELP
    
    //public float volume;

    public SpaceSize() {
       // this.PI = (float) 3.14159;
        this.area = area;//
        this.r = r;
        
}
//    public abstract void generatespace();
//    public abstract void generatespacecreate();
    
     
    //calcula distancia
    int calcDistance(int xf,int yf,int xi,int yi){
        int distance = 0;
        if(xf==xi){
            distance = yf - yi;
        }
        if(yf==yi){
            distance = xf - xi;
        }
        if(xf!= xi && yf != yi){
           distance = (int) Math.sqrt(Math.pow(xf - xi, 2)+ Math.pow(yf - yi,2)); 
        }
        if(distance < 0){
            distance *= -1;
        }
        return distance;
    }
    public int calculaDis(int pos1, int pos2){
    	int dis = pos1-pos2;
    	if(dis < 0){
    		dis*=-1;
    	}
    	return dis;
    }
        
    public SpaceSize geraXY(SpaceSize obj,SpaceSize pai){
    	boolean testPosition = true;
    	if (obj instanceof Galaxy) {
    		Universe universo = (Universe) pai;
    		int r = 15 + (int) (Math.random() * (30 - 15));
    		obj.setR(r);
    		obj.setPositionX(25 + (int)(Math.random() * (500 - 25)));
    		obj.setPositionY(25 + (int)(Math.random() * (500 - 25)));
    		for (Galaxy galaxy : universo.galaxy_list) {
    			if (galaxy.positionX == obj.positionX
    					&& galaxy.positionY == obj.positionY
    					&& obj.positionX <0
    					&& obj.positionY <0) {
    				testPosition = true;
    				break;
    			}
    		}
    		testPosition = false;
    	}
    	while(testPosition){
    		testPosition = false;
    		int maxX = pai.getPositionX()+pai.getR();
    		int minX = pai.getPositionX()-pai.getR();
    		int maxY = pai.getPositionY()+pai.getR();
    		int minY = pai.getPositionY()-pai.getR();
    		int x = minX + (int)(Math.random() * (maxX - minX));;
    		int y = minY + (int)(Math.random() * (maxY - minY));
    		obj.setPositionX(x);
    		obj.setPositionY(y);
			if (obj instanceof Star) {
				Galaxy galaxy = (Galaxy) pai;
				int r = 3 + (int) (Math.random() * (5 - 3));
				obj.setR(r);
				for (Star stars : galaxy.getStar_list()) {
					if (stars.positionX == obj.positionX
							&& stars.positionY == obj.positionY) {
						testPosition = true;
						break;
					}
//					if(calculaDis(obj.positionX, stars.getPositionX()) <25){
//						testPosition = true;
//						break;
//					}
//					if(calculaDis(obj.positionY, stars.getPositionY()) <25){
//						testPosition = true;
//						break;
//					}
				}

			}
			if (obj instanceof Planet) {
				Star star = (Star) pai;
				int r = 2; // raio padrao
				obj.setR(r);
				List<SpaceSize> listObj = new ArrayList<SpaceSize>();
				listObj.addAll(star.getBlackhole_list());
				listObj.addAll(star.getMeteor_list());
				listObj.addAll(star.getPlanet_list());
				for (SpaceSize objetos : listObj) {
					if (objetos.positionX == obj.positionX
							&& objetos.positionY == obj.positionY 
							&& obj.positionX == pai.positionX
							&& obj.positionY == pai.positionY) {
						testPosition = true;
						break;
					}
					if(calculaDis(obj.positionX, star.getPositionX()) <2){
						testPosition = true;
						break;
					}
					if(calculaDis(obj.positionY, star.getPositionY()) <2){
						testPosition = true;
						break;
					}
				}
			}
			if (obj instanceof Meteor) {
				Star star = (Star) pai;
				int r = 2; // raio padrao
				obj.setR(r);
				List<SpaceSize> listObj = new ArrayList<SpaceSize>();
				listObj.addAll(star.getBlackhole_list());
				listObj.addAll(star.getMeteor_list());
				listObj.addAll(star.getPlanet_list());
				for (SpaceSize objetos : listObj) {
					if (objetos.positionX == obj.positionX
							&& objetos.positionY == obj.positionY) {
						testPosition = true;
						break;
					}
				}
			}
			if (obj instanceof BlackHole) {
				Star star = (Star) pai;
				int r = 2; // raio padrao
				obj.setR(r);
				List<SpaceSize> listObj = new ArrayList<SpaceSize>();
				listObj.addAll(star.getBlackhole_list());
				listObj.addAll(star.getMeteor_list());
				listObj.addAll(star.getPlanet_list());
				for (SpaceSize objetos : listObj) {
					if (objetos.positionX == obj.positionX
							&& objetos.positionY == obj.positionY) {
						testPosition = true;
						break;
					}
				}
			}
			if(obj.positionX <0 || obj.positionY <0){
				testPosition = true;
			}
    	}
    	return obj;
    }
     //ERICK TRABSON WITH MICAEL HELP
    //void generate
}