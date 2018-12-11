/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_28_json;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo
 */
public class Eva3_28_json {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            URL url = new URL("http://bulk.openweathermap.org/sample/");
                    url.openConection();
            try {
                HttpURLConection http =  (HttpURLConnection)url.openConnection();
            } catch (IOException ex) {
               
            }
        } catch (MalformedURLException ex) {
         
        }
    
}
}