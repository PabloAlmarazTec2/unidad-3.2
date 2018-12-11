/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_25_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Pablo almaraz avalos 18550326
 */
public class Eva3_25_archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 FileInputStream fisLeerArchivo = null;
        
       FileOutputStream fosEscribirArchivo = null;
       
        try {
            fisLeerArchivo = new FileInputStream("C:/archivos/trabajo.bmp");          //Abrir
            fosEscribirArchivo = new FileOutputStream("C:/archivos/copia.bmp");    //Lo crea
            int iValor = fisLeerArchivo.read();    //Leemos byte por byte
            
            while(iValor !=-1){   //Fin del archivo
       // Escribir lo que leemos en el otro archivo
       fosEscribirArchivo.write(iValor);
       iValor=fisLeerArchivo.read();
}
            fosEscribirArchivo.flush();          // 
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("......");
        }finally{  
            //Cerramos los archivos
            try{
            if(fisLeerArchivo !=null){
            fisLeerArchivo.close();
            }
            if(fosEscribirArchivo !=null){
            fosEscribirArchivo.close();
            }
            }catch(IOException ex){
            ex.printStackTrace();
            }
        }
        
    }
    
}
