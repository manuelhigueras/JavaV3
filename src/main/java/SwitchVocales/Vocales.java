/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchVocales;

/*Dado un char de tipo letra debe decirnos si es una vocal y cual o si es una consonante*/

public class Vocales {
    private char letra;

    public Vocales(char letra) {
        this.letra = letra;
    }
    
    public void Comprueba(){
        switch(this.letra){
            case 'a':
                System.out.println("Es una A");
                break;
            case 'e':
                System.out.println("Es una E");
                break;
            case 'i':
                System.out.println("Es una I");
                break;
            case 'o':
                System.out.println("Es una O");
                break;
            case 'u':
                System.out.println("Es una U");
                break;
            default: 
                System.out.println("Es una consonante");
        }
    }
    
}
