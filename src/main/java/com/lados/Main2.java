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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int posicion = 0;
        Figura[] cuadrado = new Figura[4];
        int x = 0;
        int y = 0;
        String color;
        
        Scanner sc = new Scanner(System.in);
        
        while(posicion < 4){
            System.out.println("Introduce x: ");
            x = sc.nextInt();
            System.out.println("Introduce y: ");
            y = sc.nextInt();
            System.out.println("Introduce color: ");
            color = sc.next();
            Figura f1 = new Figura(x,y,color);
            boolean encontrado = false;
        
            for(int i = 0; i < cuadrado.length; i++){
                if(f1.equals(cuadrado[1])){
                  encontrado = true;
                 break;
                }
            }
        
            if(!encontrado){
                cuadrado[posicion] = f1;
                posicion++;
            }
        }
        
        for(Figura f: cuadrado){
            System.out.println(f);
        }
    }
    
}
