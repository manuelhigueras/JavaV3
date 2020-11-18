/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloques;

/**
 *
 * @author user
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        {
            
            int a = 1;
            a++;
            System.out.println(a);
        
        }
        
        //a--;
        int r = suma(3,2);
        System.out.println(r);
        
        
    }

    private static int suma(int a, int b) {
        int total = a + b;
        return total;
    }
    
}
