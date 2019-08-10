/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everything;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * 
 * @author Erick
 */
public class Letters {
    Random rand = new Random();
 //ERICK TRABSON WITH MICAEL HELP
    private int vector_number[];
    private int vector_letter[];
    private int variable_increase;
    private int number_chosed;    
    private int atc[];
    private char atc1[];
    private String name;
    public List<String> usedNames;
    
    
    public Letters() {
    usedNames = new ArrayList();
    usedNames.add("Erick Bolado");
    }
     //ERICK TRABSON WITH MICAEL HELP
    public String createRandonNames(int sizeOfWord){
        
        
                 //PARTE Q MECHE COM AS STRING
        //numeros 48,49,50,51,52,53,54,55,56,57
        //letras  65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90

 //ERICK TRABSON WITH MICAEL HELP
        ////VETOR Q CRIA AS LETRA
        do{
        this.vector_number = new int[10];     
        this.vector_letter = new int[26];
        this.atc = new int[sizeOfWord];
        this.atc1 = new char[sizeOfWord];
        this.variable_increase = 48;
        for(int ia = 0;ia<10;ia++){
            this.vector_number[ia]= variable_increase;
            variable_increase++;
        } //ERICK TRABSON WITH MICAEL HELP
        this.variable_increase = 65;
        for(int ia = 0;ia<26;ia++){
            this.vector_letter[ia]=variable_increase;
            variable_increase++;
        }
        
        /////////////////
        
       // int sizeOfWord ;//size of the names
         //ERICK TRABSON WITH MICAEL HELP
        for(int i = 0;i<sizeOfWord;i++){
        if(i < (sizeOfWord/2)+1){
           this.number_chosed = rand.nextInt(26); 
           this.atc[i]=this.vector_letter[this.number_chosed];
           //System.out.println(number_chosed);
           
        }else{
          this. number_chosed = rand.nextInt(10);
           this.atc[i]=this.vector_number[this.number_chosed];
          // System.out.println(number_chosed);
        }               
        this.atc1[i]=(char)this.atc[i];
                    }
        this.name=String.valueOf(atc1);
        
        //System.out.println(this.name);
         //ERICK TRABSON WITH MICAEL HELP
        ////
         
       }while(usedNames.contains(this.name));
        usedNames.add(this.name);
        return this.name;
    }
    public void cls(){
        System.out.println("\n");
    }


} //ERICK TRABSON WITH MICAEL HELP
    
    

