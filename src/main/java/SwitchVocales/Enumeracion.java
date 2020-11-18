/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchVocales;

/**
 *
 * @author user
 */
public class Enumeracion {
    
    private enum Orientacion { NORTE, SUR, ESTE, OESTE }
    
    public static void main(String[] args) {
        Orientacion o = Orientacion.NORTE;
        
        switch(o){
            case NORTE:
                System.out.println("...Voy al norte");
                break;
            case SUR:
                System.out.println("...Voy al sur");
                break;
            case ESTE:
                System.out.println("...Voy al este");
                break;
            case OESTE:
                System.out.println("...Voy al oeste");
                break;
            default:
                System.out.println("ESTAS EN EL CENTRO");
        }
        
    }
    
}
