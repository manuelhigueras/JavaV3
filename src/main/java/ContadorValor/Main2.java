/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContadorValor;

import static ContadorValor.Count2.count;

/**
 *
 * @author user
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    
    private int serialNumber;
    public static int count = 0;
    
    public static void main(String[] args) {
        
        System.out.println(count);
        
        Count3 p = new Count3();
        System.out.println(p.getSerialNumber());
        
    }
    
    
    
}
