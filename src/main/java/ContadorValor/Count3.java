/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContadorValor;

import java.io.File;

/**
 *
 * @author user
 */
public class Count3 {
    // - private 
    // + public 
    //_______ static
    private static int serialNumber;
    public static int count = 0;
    
    //CONSTRUCTOR - SE EJECUTA CADA VEZ QUE INSTANCIO UN OBJETO DE LA CLASE
    public Count3(){
        System.out.println("... CONSTRUCTOR");
        count++;
        serialNumber = count;
    }

    //BLOQUE ESTATICO - SE EJECUTA 1 VEZ PARA TODA LA APLICACION
    //                - CUANDO SE CARGA LA CLASE
    static{
        System.out.println("... STATIC");
        count = Integer.getInteger("valorInicioCounter");
        System.out.println(count);
    }
    
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Count3.count = count;
    }

    @Override
    public String toString() {
        return "Count{" + "serialNumber=" + serialNumber + '}';
    }
    
}
