/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetinho_cesar;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Iterator;

import org.json.simple.JSONArray;

import org.json.simple.parser.JSONParser;




/**
 *
 * @author Erick
 */
public class JsonParse {

    public JsonParse() {
    }
    //
    String parseJson(JSONObject jsonobj)throws Exception{
       //
        //System.out.println(jsonobj.toString());
        String json=jsonobj.toString();
       
        ObjectMapper objectMapper = new ObjectMapper();
        Obj12 obj1 = objectMapper.readValue(json, Obj12.class);  
        //System.out.println(obj1);
        obj1.setDecifrado(cipher(obj1.getNumero_casas(),obj1.getCifrado()));
        //SHA1
        
		String value = obj1.getDecifrado();

		String sha1 = "";
		
		// With the java libraries
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        digest.reset();
	        digest.update(value.getBytes("utf8"));
	        sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e){
			e.printStackTrace();
		}
                obj1.setResumo_criptografico(sha1);
        //
       
        //
        //String cipherAlphabet = cipher(7,"ylhspaf pazlsm pz avv vicpvbz av il aybl. qlhu ihbkypsshyk");
        
 
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(obj1);
        //System.out.println(jsonString);
        return jsonString;
    } 
    String cipher(int key,String chipherPhrase){
        String resp = "";
        int indexx=0;
        int realIndex;
        if(key>=26){
            indexx=key-26;
        }else{
            indexx=key;
        }
        String normalAlphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] tempvar = chipherPhrase.toCharArray();
  
        for(int i = 0;i<chipherPhrase.length();i++){
            if(!(tempvar[i] == ' ' ||tempvar[i] == '.' ||tempvar[i] == '0'||tempvar[i] == '1'||tempvar[i] == '2'||tempvar[i] == '3'||tempvar[i] == '4'||tempvar[i] == '5'||tempvar[i] == '6'||tempvar[i] == '7'||tempvar[i] == '8'||tempvar[i] == '9')){
                
           
                
                int varpositon = normalAlphabet.indexOf(tempvar[i])-indexx;
                if(varpositon>=26){
                    varpositon= varpositon-26;
                }
                if(varpositon<0){
                    varpositon= 26+(varpositon);
                }
                
                tempvar[i]=normalAlphabet.charAt(varpositon);
                
            }
            
           
            
           
        }
        for(int leng=0;leng<tempvar.length;leng++){
            resp+=tempvar[leng];
        }
    
        
        return resp;
    }
}
