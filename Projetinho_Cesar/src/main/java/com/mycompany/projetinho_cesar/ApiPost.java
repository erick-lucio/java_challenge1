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
    void sendPost()throws Exception{
                String url= "https://api.codenation.dev/v1/challenge/dev-ps/submit-solution?token=a4d944dd47ea6faba16e39103cd132be80a5a939";
                String charset = "UTF-8"; 
                URLConnection connection = new URL(url).openConnection();
                connection.setDoOutput(true); // Triggers POST.
                connection.setRequestProperty("Accept-Charset", charset);
                connection.setRequestProperty("Content-Type", "application/json;charset=" + charset);

                try (OutputStream output = connection.getOutputStream()) {
                  output.write(param.getBytes(charset));
                }

                InputStream response = connection.getInputStream();

                  }

}
