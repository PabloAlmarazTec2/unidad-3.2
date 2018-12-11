/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_22_throws;

/**
 *
 * @author Pablo almaraz avalos 18550326
 */
public class Eva3_22_throws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.println("Inicia Main");
        try {
            A();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Termina Main");
    }
     public static void A() throws Exception{
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
        
    }
    public static void B() throws Exception{
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
}
    public static void C() throws Exception{
        System.out.println("Inicia C");
        throw new Exception("cargando :v");
        //Se puede captturar o propagar
       
}
}