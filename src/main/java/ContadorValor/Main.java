/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContadorValor;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    private int serialNumber;
    public static int count = 0;
    
    public static void main(String[] args) {
      
        //Intancia de clase
        System.out.println(Count.count);
        
        //Variable de clase
        Count cont = new Count();
        System.out.println(cont);
        System.out.println(cont.getSerialNumber());
        
        Count cont2 = new Count();
        System.out.println(cont2);
        System.out.println(cont2.getSerialNumber());
        
        Count cont3 = new Count();
        System.out.println(cont3);
        System.out.println(cont3.getSerialNumber());
        
        
        
    }
    
    
    
}
