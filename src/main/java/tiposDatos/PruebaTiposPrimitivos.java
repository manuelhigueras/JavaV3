/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposDatos;

import deporte.Pelota;

/**
 *
 * @author user
 */
public class PruebaTiposPrimitivos {
    
    //Atrubytis 
    //Se deckaran dentro de la clase pero fuera de cualquier metodo
    // o constructor variable miembro (de la clase)
    
    public static void main(String[] args){
        //Variables locales o de metodo
        // se declaran dentro de un metodo o constructor 
        
        //tipo primitivo
        int a = 9;
        
        //variables de referencia
        Pelota p = null;
        
        //8 tipos primitivos
        
        boolean activo = true;
        boolean mayor = 2 > 5; //false
        
        char letra = 'a';
        char pi = '\u03A6';
        
        System.out.println("pi " + pi);
        
        byte b = 1; //-127 a 128
        //byte b2 = 128;
        
        int num = 56; //el 56 literal de tipo int
        
        short s = 4000;
        
        int edad = 100; //--->32 bits
        //byte edadByte = edad; 32 bits no pueden entrar en 8 bits
        
        //Se tiene que hace un casting que fuerza el cambio
        if(edad < 128){
            byte edadByte = (byte) edad;
            System.out.println("edad conveniente " + edadByte);
        }
        
        int aniosLuz = 5000;
        byte aniosLuzB = (byte) aniosLuz;
        System.out.println("años luz conv " + aniosLuzB);
        
        float carga = 34400.51723345634f; //REDONDEO A 34.400,517
        double cargaTotal = 333.77;
        
        //conversion automatica
        
        double aaaa= 5;
        
        carga = (float) cargaTotal;
        System.out.println("Carga es " + carga);
        
        System.out.println("numero aleatorio " + (int) (Math.random()*100));
        
        int salario = 2000;
        System.out.println("te doy la mitad de mi salario. ¿Cuanto es?");
        //float tedoy = salario / 2;
       
        System.out.println(24/2.8);
        //System.out.println(carga);
        

    }
    
    
    
}
