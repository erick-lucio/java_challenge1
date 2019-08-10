/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everything;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

 //ERICK TRABSON WITH MICAEL HELP
/**
 *
 * @author user
 */
public class Star extends SpaceSize {
   
    Galaxy gal = new Galaxy();
    Universe uni = new Universe();
    
    public Galaxy getGalaxy() {
        return gal;
    }

    public Universe getUniverse() {
        return uni;
    }

    public void setUniverse(Universe uni) {
        this.uni = uni;
    }

    public void setGalaxy(Galaxy gal) {
        this.gal = gal;
    }
    
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getGravity() {
        return gravity;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }
    public List<Planet>  planet_list;
    public List<Meteor>  meteor_list;
    public List<BlackHole>  blackhole_list;
        public Star(){
            planet_list = new ArrayList(); 
            meteor_list = new ArrayList(); 
            blackhole_list = new ArrayList(); 
            
        }
        Random rand = new Random();

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r += r;
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

    //ERICK TRABSON WITH MICAEL HELP
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

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
      
       
        private float temperature;
        //private int types_of_matters_contained;
        private float gravity;
        private float radiation;
        private float eletromagnetic_field;



    Star(String Name){
        //super(positionY,positionX,r,area);
    	planet_list = new ArrayList(); 
        meteor_list = new ArrayList(); 
        blackhole_list = new ArrayList(); 
        Letters letters = new Letters();
        do{
            this.mass=rand.nextInt(500000);
        }while(this.mass< 200000);
      //  this.size =  356;
        this.name = Name;

    }
    
    public List<Planet> getPlanet_list() {
		return planet_list;
	}

	public void setPlanet_list(List<Planet> planet_list) {
		this.planet_list.addAll(planet_list);
	}


	public List<Meteor> getMeteor_list() {
		return meteor_list;
	}

	public void setMeteor_list(List<Meteor> meteor_list) {
		this.meteor_list.addAll(meteor_list);
	}
	
	public void setPlanet(Planet planet){
                if(this.planet_list == null){
                 planet_list = new ArrayList();
             }
		this.planet_list.add(planet);
	}
	public void setBlackHole(BlackHole blackhole){
            if(this.blackhole_list == null){
                blackhole_list = new ArrayList();
            }
            this.blackhole_list.add(blackhole);
        }
	
	public void setMeteor(Meteor meteor){
                if(this.meteor_list == null){
                    meteor_list = new ArrayList();
                }
		this.meteor_list.add(meteor);
	}

	public List<BlackHole> getBlackhole_list() {
		return blackhole_list;
	}

	public void setBlackhole_list(List<BlackHole> blackhole_list) {
		this.blackhole_list = blackhole_list;
	}

//    @Override
//    public void generatespace() {
//        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        //universeXY= universe.getUniverseXY();
//     
////       do{
////       this.r = (int)(Math.sqrt(this.size)/2);
////       r++;
////       do{
//       this.positionX= rand.nextInt(xmax-1);
//      // }while(positionX<=xmin && positionX>=xmax-1);
//      // do{
//       this.positionY= rand.nextInt(ymax-1);
////       }while(positionY<=ymin && positionY>=ymax-1);
////       verificator = 1;
//       
//
//       /*
//                                      X-     |  X+
//                                      Y+     |  Y+
//                                     --------|--------    
//                                       X-    |  X+
//                                       Y-    |  Y-
//       */
////          for(int i = positionX-r;i<positionX+r;i++){
////           for(int j = positionY-r;j<positionY+r;j++){
////               if(i<0){
////                   i=0;
////               }
////               if(i>=xmax){
////                   i=xmax-1;
////               }
////              if(j<0){
////                   j=0;
////               }
////               if(j>=xmax){
////                   j=xmax-1;
////               }
////               ///condiçao p n bugar
////              // System.out.println(i+"-"+j+"-"+xmax+"-"+positionX+"--"+positionY+"-"+r);
////                if(universeXY[i][j].getGalaxyName() == ""){
////                  verificator =0; 
////                        
////               }
////               ///condiçao p n da loop infinito
//////              if(i<0){
//////                   i=positionY-r;
//////               }
////               if(i>=xmax-1){
////                   i=positionX+r;
////               }
//////              if(j<0){
//////                   j=positionX-r;
//////               }
////               if(j>=xmax-1){
////                   j=positionY+r;
////               }
////           }}
////           /*         
////            for(int i = positionX;i<positionX+r-1;i++){
////           for(int j = positionY;j<positionY+r-1;j++){
////              if((i <=xmax-1 && j >= 0)&& (i>=0 && j<=ymax-1)){
////                   
////              if(universeXY[i][j].getGalaxyName() == ""){
////                  verificator =0; 
////                        
////            } else{
////              
////            }  
////                }
////             
//  //
////           }
////       }
//  //
////          for(int i = positionX;i<positionX+r-1;i++){
////          for(int j = positionY;j>positionY-r;j--){
////              if((i <=xmax-1 && j >= 0)&& (i>=0 && j<=ymax-1)){
////              if(universeXY[i][j].getGalaxyName() == ""){
////                verificator1 =0; 
////            } else{
////               
////            }  
////                }
//  //
//  //  
////           }
////       }*/
//  //
////       
////       }
////       while(verificator==1);
//  //  
////           ///PREENCHE AS POSIÇOES
////           
////           
////           
////          for(int a = positionX-r;a<positionX+r;a++){
////           for(int b = positionY-r;b<positionY+r;b++){
////               if(a<0){
////                   a=0;
////               }
////               if(a>=xmax){
////                   a=xmax-1;
////               }
////              if(b<0){
////                   b=0;
////               }
////               if(b>=xmax){
////                   b=xmax-1;
////               }
////               ///condiçao p n bugar
////              // System.out.println(a+"-"+b+"-"+xmax+"-"+positionX+"--"+positionY+"-"+r);
////              universeXY[a][b].setGalaxyName(name);
////              //System.out.println(universeXY[a][b].getGalaxyName());
////              //verificar a partidr do a b da galaxy se os planeta tao sendo criado,
////              //e criar os planetas estretas etc dentro da galaxia
////                        
////               
////               ///condiçao p n da loop infinito
//  //
////               if(a>=xmax-1){
////                   a=positionX+r;
////               }
//////              if(j<0){
//////                   j=positionX-r;
//////               }
////               if(b>=xmax-1){
////                   b=positionY+r;
////               }
////           }
//          }

//    @Override
//    public void generatespacecreate() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }



}
