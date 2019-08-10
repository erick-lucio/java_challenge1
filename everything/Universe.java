/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everything;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
/*
 *
 * @author user
 */
 //ERICK TRABSON WITH MICAEL HELP

/**
 *
 * @author Euler
 */
public class Universe extends SpaceSize {
    
    Random rand = new Random();
    
    public List<Galaxy>  galaxy_list;



   

   
  
   public void setGalaxy(Galaxy galaxy){
                if(this.galaxy_list == null){
                    galaxy_list = new ArrayList();
                }
		this.galaxy_list.add(galaxy);
	}
    
    public Universe() {
        galaxy_list = new ArrayList(); 
        
    }

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

//    public Content[][] getUniverseXY() {
//        return universeXY;
//    }
//
//    public void setUniverseXY(Content[][] universeXY) {
//        this.universeXY = universeXY;
//    }
    
	Universe(String universeName) {
		this.name = universeName; 
		this.galaxy_list = new ArrayList<Galaxy>(); 
//		this.universeQtdGalaxys += galaxy.getGalaxyQtd();
//		this.universeQtdStars += galaxy.getGalaxyQtdStars();
//		this.universeQtdPlanets += galaxy.getGalaxyQtdPlanets();
//		this.universeQtdMeteors += galaxy.getGalaxyQtdMeteors();
//		this.universeQtdBlackHoles += galaxy.getGalaxyQtdBlackHoles();
	}
   // private int planets;


       //ERICK TRABSON WITH MICAEL HELP

    
    /*
   void universedetails(){
        System.out.println(
            "      " + name + "\n" +
            "Quantity of Planets " + planets + "\n" +
           /"Quantity of Star " + stars + "\n" +
            "Quantity of black holes " + black_holes + "\n" 
        );
        
    }
   */
 //ERICK TRABSON WITH MICAEL HELP
   

//    @Override
//    public void generatespace() {
//            Content content = new Content();
//        content.universeName= this.name;
//        content.galaxyName = "";
//        if(this.r % 2 != 0){
//            this.r--;
//        }
//        
//        SpaceSize.universeXY= new Content[2*this.r][2*this.r];
//        for(int i=0;i!= 2*this.r;i++){
//            for(int j=0;j!= 2*this.r;j++){
//              SpaceSize.universeXY[j][i]=content;  
//              //System.out.println(universeXY[j][i].universeName);
//            }
//            
//        }
//        this.positionX = this.r; // se der erro poe -1
//        this.positionY = this.r;
//        this.xmax = (int) ((2*this.r)*1);
//        this.xmin = (int) ((2*this.r)*1);
//        this.ymax = (int) ((2*this.r)*1);
//        this.ymin = (int) ((2*this.r)*1);
//    }
                    
           
                        

                        
                        
                          
                       
             //ERICK TRABSON WITH MICAEL HELP      
             
                
                /*
                for(int i = xmin;i<xmax;i++){
                    for(int j =ymin;j<xmax;j++){
                        
                      System.out.print(universeXY[j][i].getUniverseName());
                        
                        
                          
                       }
                    System.out.println("");
            }
             */ 
    
    


  


    
 //ERICK TRABSON WITH MICAEL HELP
   // float life_time;
    //private int[] ascii_codes = new int[36];
   //private int code_of_numbers = 48;

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public List<Galaxy> getGalaxy_list() {
		return galaxy_list;
	}

	public void setGalaxy_list(List<Galaxy> galaxy_list) {
		this.galaxy_list = galaxy_list;
	}

//    @Override
//    public void generatespacecreate() {
//
//    }

    } //ERICK TRABSON WITH MICAEL HELP

  

