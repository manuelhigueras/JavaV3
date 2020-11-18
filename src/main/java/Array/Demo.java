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
public class Demo {
   
    char[] s;

    public Demo() {
        this.s = new char[26];
    }
    
    public char[] Recorre(){
        for(int i=0; i<26; i++){
            s[i] = (char) ('A' + i);
        }
        return s;
    } 

    public void toString2(char[] s) {
        for(int i = 0; i < 26; i++){
            System.out.println("Demo{" + "s=" + s[i] + '}');
        }
    }
    
    /**
     * Metodo que crea un array de 10 objetos 
     */
    
    public Punto[] crearArray(){
        Punto[] p;
        p = new Punto[10];
        for(int i=0; i<10; i++){
            p[i] = new Punto(i,i+1);
        }
        return p;
    }
  
}
