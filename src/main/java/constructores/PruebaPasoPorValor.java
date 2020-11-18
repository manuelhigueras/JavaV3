/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author user
 */
public class PruebaPasoPorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dia = 20;
        incrementa(dia);
        System.out.println("dia es " + dia);
        
        MiFechaFuncion f = new MiFechaFuncion(20,3,2020);
        incrementa(f);
        System.out.println("dia dentro " + dia);
        
        MiFechaFuncion fecha = new MiFechaFuncion(22,7,1964); 
        
    }
    
    /*
    * @param funcion que que ejecuta un cambio de fecha
    */
    
    //paso por valor
    public static void incrementa(int dia){
        
        dia++;
        System.out.println("dia dentro " + dia);
        
    }
    
    /*
     * @param funcion que que ejecuta un cambio de fecha
    */

    //paso por referencia
    public static void incrementa(MiFechaFuncion f){
        f.setDia(f.getDia() + 1);
        System.out.println("dia dentro es " + f.getDia());
    }
    
    public static void incrementar(int x, int y, int z){
       MiFechaFuncion fecha = new MiFechaFuncion(x,y,z);
    }
    
}
