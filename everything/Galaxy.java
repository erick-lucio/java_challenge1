/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everything;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



/** //ERICK TRABSON WITH MICAEL HELP
 *
 * @author user
 */
public final class Galaxy extends SpaceSize {


     
    public List<Star>  star_list;
    Universe uni = new Universe();
    SpaceSize space;
    public Universe getUniverse() {
        return uni;
    }

    public void setUniverse(Universe uni) {
        this.uni = uni;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getArea() {
        return area;
    }
    public void setStar(Star star){
            if(this.star_list == null){
                star_list = new ArrayList();
            }
        
            this.star_list.add(star);
	}
    public void setArea(int area) {
        this.area = area;
    }
    Random rand = new Random();
    private String name ;//= "Galaxy ";    

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

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } //ERICK TRABSON WITH MICAEL HELP


    public List<Star> getStar_list() {
        return star_list;
    }
     //ERICK TRABSON WITH MICAEL HELP
    public void setStar_list(List<Star> star_list) {
        this.star_list = star_list;
    }

 
    public Galaxy(){
        star_list = new ArrayList(); 
    }
    public Galaxy(String Name){
    	star_list = new ArrayList();
        this.name=Name;
    }
       //ERICK TRABSON WITH MICAEL HELP      

        
            //this.galaxyQtd++;

//    @Override
//    public void generatespace() {
//        int cancreate = 0;
//        //create the center point
//        do{
//           do{ 
//     this.positionX = rand.nextInt(2*uni.r);
//     this.positionY = rand.nextInt(2*uni.r);  
//           }while(uni.xmin > positionX || uni.xmax > positionX || uni.ymin > positionY || uni.ymax > positionY);
//     ///
//       cancreate = 1;
//        //verify around
//        
//        for(int i = this.positionY - this.r;i <= this.positionY + this.r;i++){
//            
//         for(int j = this.positionX - this.r;j <= this.positionX + this.r;j++){
//           
////             if(i < 0){
////                 i=0;
////             }
////             if(i > uni.ymax){
////                 i= this.positionY + this.r;
////             }
////             if(j<0){
////                 j=0;
////             }
////             if(j > uni.xmax){
////                 j= this.positionY + this.r;
////             }
//              System.out.println(j + " " + i+ " ");
//                try{
//                   
//           if(calcDistance(j,i,positionX,positionY) <= r){
//               
//             if(!(SpaceSize.universeXY[j][i].galaxyName.equals(""))){
//                 
//                 cancreate = 0;
//                 System.out.println(" entrou calc");
//                 
//             }
//                
//         
//           } 
//         }catch(Exception e){
//            System.out.println(e.getMessage());
//         }
//     }
//   
//        }
//     ///
//        }while(uni.xmin > positionX || uni.xmax < positionX || uni.ymin > positionY || uni.ymax < positionY || cancreate == 0);
//        
// 
//        
//        //fullfill around
//    for(int i = this.positionY - this.r;this.positionY != this.r;i++){
//         for(int j = this.positionX - this.r;this.positionX != this.r;j++){
//             try{  
//           if(space.calcDistance(j,i,positionX,positionY) <= r){
//             
//             SpaceSize.universeXY[j][i].galaxyName = this.name;
//            
// 
//             
//                
//           }  
//         }catch(NullPointerException e){
//
//     }            }
//  
//
//    }
//
//    
//    
//    } 

//    @Override
//    public void generatespacecreate() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
} //ERICK TRABSON WITH MICAEL HELP

	

 

   
    
  
