/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JBuscaminas;

import java.util.Random;

/**
 *
 * @author user
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NumAleat buscaminas = new NumAleat();
        int[] array = buscaminas.generateArrayV2(5);
        array = buscaminas.ordenaArray(array, 5);
        buscaminas.imprimeCampo(5);
        
//        Random rd = new Random(5);
//        int num2 = 0;
//        for(int cont=0; cont < 5; cont++){
//            num2 = rd.nextInt(5);
//            System.out.println(num2);
//        }
        
    }
    
}
