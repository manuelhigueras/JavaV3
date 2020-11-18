/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchVocales;

import operadores.Categoria;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    private enum categoria {BENJ, INF, ALEV, JUV, SENIOR};
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Version 1.0
        /*
        Vocales x = new Vocales('b');
        Vocales y = new Vocales('e');
        
        x.Comprueba();
        y.Comprueba();
        */
        
        categoria c = categoria.INF;
        int precio = 0;
        switch(c){
            case BENJ:
                precio = 4;
                break;
            case INF:
                precio = 5;
                break;
            case ALEV:
                precio = 6;
                break;
            case JUV:
                precio = 9;
                break;
            case SENIOR:
                precio = 14;
                break;
             
        }
        
    }
    
}
