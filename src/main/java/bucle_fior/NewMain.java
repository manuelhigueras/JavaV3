/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle_fior;

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
        double raiz = Math.sqrt(13);
        double LD = Math.round(raiz);
        System.out.println(raiz);
        System.out.println(LD);
        
        /*For sencillo Mostrar la raiz cuadra de los numero entre 10 y 50.
        */
        
        for (int i = 10; i <= 50; i++) {
            double raiz_cuadrada = Math.sqrt(i);
            System.out.println("Raiz de " + i + " = " + raiz_cuadrada);
        }
        
        //Ejemplo 2. Mostrar el alfabeto de la A a la Z
        //char letra, letra2;
        
        //Version moderna 2
        //int inicio = (int) 'A';
        //int fin = (int) 'Z';
        
        
        //Version facil 1
        //letra = 'A';
        /*for (int i = 0; i <= 25; i++) {
            letra2 = (char) (letra + i);
            System.out.println("Letra="+letra2);
        }*/
        
        //Version 2
        /*for (; inicio <= fin; inicio++) {
            System.out.println("LETRA=" + (char) inicio);
        }*/
        
        //Version 3
        /*for (char l='A'; l <= 'Z'; l++){
            System.out.println("LETRA=" + l);   
        }*/
        
        for (char i= 'A', j='a'; i <= 'Z'; i++, j++) {
            System.out.println("LETRA=" + i + " LETRA MIN=" + j); 
        }
        
    }
    
}
