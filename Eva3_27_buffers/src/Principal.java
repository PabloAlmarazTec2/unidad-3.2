
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 abrir el archivo inputStream
leer bytes inputstreamreader
convertir a texto BufferedReader
------------------------------------
inputStream
inputStreamWrittter
BufferedReader
 */

/**
 *
 * @author Pablo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            InputStream isAbrir = null;
            InputStreamReader isLeer = null;
            BufferedReader brTexto = null;
            
            isAbrir = Files.newInputStream(Paths.get("C:\\Users\\Pablo\\Desktop\\archivos\\archivo.txt"));
            isLeer = new InputStreamReader(isAbrir);
            brTexto = new BufferedReader(isLeer);
            String sLinea = brTexto.readLine();
            while(sLinea !=null){
                System.out.println(sLinea);
                sLinea = brTexto.readLine();
            
            }
            brTexto.close();
        } catch (IOException ex) {
          ex.printStackTrace();
        }
        
        
        
        
        
        
        
    }
    
}
