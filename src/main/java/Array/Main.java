/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

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
        //Version 1
        /*Demo array = new Demo();
        char[] cad = array.Recorre();
        array.toString2(cad);*/
        //Version 2
        Demo d = new Demo();
        Punto[] figura = d.crearArray();
        
        //1. mostrar los datos del punto en la ultima posicion
        Punto ultimo = figura[figura.length-1];
        System.out.println("Ultimo valor={"+ultimo.getX()+","+ultimo.getY()+"}");
        //2. cambiar la coordenadas x a valor 8 y 9 del punto de la 5ta posicion
        figura[4].setX(89);
        //3. recorrer array y mostrar todos los puntos
        for(int cont = 0; cont <= 9; cont++){
            System.out.println("Array={"+figura[cont]+"}");
        }
        //4. Decir en que posicion hay un punto con valores x=6 e y=7
        for(int cont=0; cont < figura.length; cont++){
            int value = figura[cont].getX();
            if(value == 6){
                System.out.println("El valor esta en la posicion = " + cont);
                break;
            }
            else{
                System.out.println("N/E");
            }
        }
        //5. Bucle mejorado
        for (Punto aux : figura) {
            System.out.println("Valor del bucle mejorado = " + aux);
        }
        
        
    }
    
}
