/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Squals;

import com.lados.Figura;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura f1 = new Figura(3,5,"Rojo");
        Figura f2 = new Figura(3,5,"Amarillo");
        Figura f3 = f2;
        
        if(f1 == f2){
            System.out.println("APUNTADOR DE MEMORIA IGUAL");
            System.out.println("" + f1 + " - " + f2);
        }    
        else{
            System.out.println("APUNTADOR DE MEMORIA DISTINCA");
            System.out.println("" + f1 + " - " + f2);
        }
        if(f1.equals(f1)){
            System.out.println("IGUAL");
        }else{
            System.out.println("DESIGUAL");
        }
        
    }
    
}
