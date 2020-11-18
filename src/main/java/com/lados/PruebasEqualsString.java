/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lados;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PruebasEqualsString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inmutable
//        String a = "Ramona";
//        String b = "Ramona";
//        String c = new String("Ramona");
//        System.out.println("a == b? " + (a == b));
//        System.out.println("a equals b? " + (a.equals(b)));
//        System.out.println("a == c? " + (a == c));
//        System.out.println("a equals c? " + (a.equals(c)));
//        
        String[] array = {"Manuel", "Luis", "Marco", "Jose", "Ibariche"};
        
        System.out.println("Introduce un nombre: ");
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int cont = 0;
        String nombre = sc.next();
        for(String a: array){
            cont++;
            if(nombre.equals(a)){
                System.out.println("Presente");
                pos = cont;
            }
            else{
                System.out.println("No asistio");
            }
        }
        
        if(pos > -1){
            System.out.println("El sujeto esta alli en la pos = " + pos);
        }
        else{
            System.out.println("El sujeto no esta");
        }
        
        
        
    }
    
}
