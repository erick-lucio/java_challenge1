/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everything;

import java.math.BigInteger;

/**
 *
 * @author dr.marcio
 */ //ERICK TRABSON WITH MICAEL HELP
public class Meteor extends SpaceSize {
    Universe uni = new Universe();
    Star sta = new Star();
    public Star getStar() {
        return sta;
    }

    public void setStar(Star sta) {
        this.sta = sta;
    }

    public Universe getUniverse() {
        return uni;
    }

    public void setUniverse(Universe uni) {
        this.uni = uni;
    }
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
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


    public int getMass(){
        return mass;
        
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    //ERICK TRABSON WITH MICAEL HELP
    public void setName(String name) {
        this.name = name;
    }
public Meteor(String name){
    this.name = name;
     do{
         this.mass=rand.nextInt(100000);
        }while(this.mass< 10000);
}

    public Meteor() {
        //super(positionX, positionY,area, r);
        
        
 //ERICK TRABSON WITH MICAEL HELP
  

  //  @Override
    //public generatespace() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //universeXY= universe.getUniverseXY();
      //ERICK TRABSON WITH MICAEL HELP
//       do{
//       this.r = (int)(Math.sqrt(this.size)/2);
//       r++;
//       do{
      // this.positionX= rand.nextInt(xmax-1);
      // }while(positionX<=xmin && positionX>=xmax-1);
      // do{
       //this.positionY= rand.nextInt(ymax-1);
//       }while(positionY<=ymin && positionY>=ymax-1);
//       verificator = 1;
       

       /*
                                      X-     |  X+
                                      Y+     |  Y+
                                     --------|--------    
                                       X-    |  X+
                                       Y-    |  Y-
       */
//          for(int i = positionX-r;i<positionX+r;i++){
//           for(int j = positionY-r;j<positionY+r;j++){
//               if(i<0){
//                   i=0;
//               }
//               if(i>=xmax){
//                   i=xmax-1;
//               }
//              if(j<0){
//                   j=0;
//               }
//               if(j>=xmax){
//                   j=xmax-1;
//               } //ERICK TRABSON WITH MICAEL HELP
//               ///condiçao p n bugar
//              // System.out.println(i+"-"+j+"-"+xmax+"-"+positionX+"--"+positionY+"-"+r);
//                if(universeXY[i][j].getGalaxyName() == ""){
//                  verificator =0; 
//                        
//               }
//               ///condiçao p n da loop infinito
////              if(i<0){
////                   i=positionY-r;
////               }
//               if(i>=xmax-1){
//                   i=positionX+r;
//               }
////              if(j<0){
////                   j=positionX-r;
////               }
//               if(j>=xmax-1){
//                   j=positionY+r;
//               }
//           }}
//           /*         
//            for(int i = positionX;i<positionX+r-1;i++){
//           for(int j = positionY;j<positionY+r-1;j++){
//              if((i <=xmax-1 && j >= 0)&& (i>=0 && j<=ymax-1)){
//                   
//              if(universeXY[i][j].getGalaxyName() == ""){
//                  verificator =0; 
//                        
//            } else{
//              
//            }  
//                }
//             
  //
//           }
//       }
  //
//          for(int i = positionX;i<positionX+r-1;i++){
//          for(int j = positionY;j>positionY-r;j--){
//              if((i <=xmax-1 && j >= 0)&& (i>=0 && j<=ymax-1)){
//              if(universeXY[i][j].getGalaxyName() == ""){
//                verificator1 =0; 
//            } else{
//               
//            }  
//                }
  //
  //  
//           }
//       }*/
  //
//        //ERICK TRABSON WITH MICAEL HELP
//       }
//       while(verificator==1);
  //  
//           ///PREENCHE AS POSIÇOES
//           
//           
//           
//          for(int a = positionX-r;a<positionX+r;a++){
//           for(int b = positionY-r;b<positionY+r;b++){
//               if(a<0){
//                   a=0;
//               }
//               if(a>=xmax){
//                   a=xmax-1;
//               }
//              if(b<0){
//                   b=0;
//               }
//               if(b>=xmax){
//                   b=xmax-1;
//               }
//               ///condiçao p n bugar
//              // System.out.println(a+"-"+b+"-"+xmax+"-"+positionX+"--"+positionY+"-"+r);
//              universeXY[a][b].setGalaxyName(name);
//              //System.out.println(universeXY[a][b].getGalaxyName());
//              //verificar a partidr do a b da galaxy se os planeta tao sendo criado,
//              //e criar os planetas estretas etc dentro da galaxia
//                        
//               
//               ///condiçao p n da loop infinito
  //
//               if(a>=xmax-1){
//                   a=positionX+r;
//               }
////              if(j<0){
////                   j=positionX-r;
////               }
//               if(b>=xmax-1){
//                   b=positionY+r;
//               }
//           }
          }

//    @Override
//    public void generatespace() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void generatespacecreate() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
