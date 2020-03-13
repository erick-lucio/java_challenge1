/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetinho_cesar;

import org.json.JSONObject;
/**
 *
 * @author Erick
 */
public class JsonParse {

    public JsonParse() {
    }
    
    JSONObject parseJson(JSONObject obj)throws Exception{
        int key;
        
        String cipherAlphabet = cipher(13);
        
        return 1;
    } 
    String cipher(int key){
        String resp = "";
        int indexx=0;
        int realIndex;
        if(key>26){
            indexx=key%26-1;
        }else{
            indexx=key-1;
        }
        
        String normalAlphabet = "abcdefghijklmnopqrstuvwxyz";
        //O INDEXX NADA MAIS E Q O LOCAL POR ONDE ELE DEVE COMEÇAR BASEADO NA CHAVE
        /*
        for(int i = 0;i<26;i++){
            indexx=i;
            if(indexx>=26){
                indexx=0;
            }
        }
        for(int iterations=0;iterations<26;iterations++){
            resp+=normalAlphabet.charAt(indexx);
            if(indexx>=26){
                indexx=0;
            }
        } 
        */
        return resp;
    }
}
