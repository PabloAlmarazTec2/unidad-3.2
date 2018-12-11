/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_19_finally;

import java.util.Scanner;

/**
 *
 * @author Pablo Aaron Almaraz Avalos 18550326
 */
public class Eva3_19_finally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner(System.in);
        int iDendo,iDisor;
        System.out.println("Introduce el dividendo: ");
        iDendo = input.nextInt();
        System.out.println("Introduce el divisor: ");
        iDisor = input.nextInt();
        int iResu = 0;
        try{
        iResu = iDendo / iDisor;
        }catch(ArithmeticException e){
            //Se puede generar excepciones
        e.printStackTrace();
            System.out.println("División entre cero.");
        }finally{//Siempre se ejecuta
            //Se puede generar excepciones
            //Cerrar archivos, liberar recursos
            System.out.println("Bloque Finally");
        }
        System.out.println("Resultado: " +iResu);
        
    }
    
}