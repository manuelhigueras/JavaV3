/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayMultipleDimensiones;

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
        
        ////////////////////////////////////////////////////////////
        //CLASE:CAMBIADO VALOR DE LA POSICION ESPECIFICA CON ESE VALOR
        int[] numeros = new int[5];
        
        for(int n: numeros){
            System.out.print(n+" ");
        }
        
        numeros[3] = 6;
        
        System.out.println("..............");
        
        for(int n: numeros){
            System.out.print(n + " ");
        }
        
        System.out.println("..............");
        for(int n: numeros){
            System.out.print(n + " ");
        }
        
        //EJECICIO DE ARRAY MULTIDIMENSIONAL 
        //SE PUEDE HACER UN ARRAY DE 3X3??
        
        //Ejercicio arbol de navidad
        //int p = 2;
        //int o = 2;

//        char[][] relleno = { 
//            {' ', ' ', '*', ' ', ' ', ' '},
//            {' ', ' ','******', ' ', ' '},
//            {' ', ' ', '********', ' ', ' '},
//            {' ', ' ', '************', ' ', ' '},
//            {' ', ' ', '****', ' ', ' '},
//        };

        char[][] relleno = {
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', '*', ' '},
            {'*', '*', '*', '*', '*', '*', '*'},
            {' ', '*', '*', '*', '*', '*', ' '},
            {' ', ' ', '*', '*', '*', ' ', ' '},
            {' ', ' ', '*', '*', '*', ' ', ' '},
        };
        
        for(char[] a: relleno){
            for(char b: a){
                System.out.print(b);
            }
            System.out.println(a);
        }
        
        
        
        //     *
        //   ******
        //  ********
        //************
        //    ****
        
        //
        
        //CLASE:
        // *  *  *                               
        // *  m  *
        // *  *  *
        // m = (1,1)
        
        //int[][] cantidad = new int[2][3];
        
        int[][] cantidades = {{3,67}, {1,8,45}};
        
        cantidades[1][1] = 6;
        for(int[] f: cantidades){
            System.out.println("");
            for(int c: f){
                System.out.print(c + " ");
            }
        }
        
    }
    
}
