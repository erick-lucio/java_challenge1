/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetinho_cesar;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Erick
 */
public class ApiPost {
               
    void sendPost(String jsonInputString)throws Exception{
      String url_key = "https://api.codenation.dev/v1/challenge/dev-ps/submit-solution?token=a4d944dd47ea6faba16e39103cd132be80a5a939";
      URL url = new URL (url_key);
      HttpURLConnection con = (HttpURLConnection)url.openConnection();
      con.setRequestMethod("POST");
      con.setRequestProperty("Content-Type", "application/json; utf-8");//mudar o tipo
      con.setRequestProperty("Accept", "application/json");
      con.setDoOutput(true);
      
      try(OutputStream os = con.getOutputStream()) {
        byte[] input = jsonInputString.getBytes("utf-8");
        os.write(input, 0, input.length);           
      }
      try(BufferedReader br = new BufferedReader(
          new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
      }
}











                  }

}
