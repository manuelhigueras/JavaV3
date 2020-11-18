/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle_while;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Version 1
//        int numAdivinar = 2;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce del 1..10:");
//        int input = sc.nextInt();
//        System.out.println("Has introducido: " + input);
        //VERSION 1
        /*while(numAdivinar != input) {
            if(input != numAdivinar){
                System.out.println("Fallo !!");
            }
            System.out.println("Introduce del 1..10:");
            input = sc.nextInt();
        }
        if(input == numAdivinar){
            System.out.println("Acerto !!");
        }*/
        
        //Version 2
        /*boolean acerto = false;
        int input;
        Scanner sc;
        int numAdivinar = 2;
        while (!acerto) {
            sc = new Scanner(System.in);
            System.out.println("Introduce del 1..10:");
            input = sc.nextInt();
            if(input != numAdivinar){
                System.out.println("Fallo !!");
                
            }
            else{
                System.out.println("Acerto");
                acerto = true;
            }
        }
        */
        
        //Version 3
//        boolean acerto = false;
//        int input;
//        Scanner sc;
//        int numAdivinar = 2;
//        do{
//            sc = new Scanner(System.in);
//            System.out.println("Introduce del 1..10:");
//            input = sc.nextInt();
//            if(input != numAdivinar){
//                System.out.println("Fallo !!");
//                
//            }
//            else{
//                System.out.println("Acerto");
//                acerto = true;
//            }
//        }while(!acerto);      
          
          
        
    }
    
}
