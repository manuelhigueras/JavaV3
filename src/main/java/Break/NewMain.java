/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Break;

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
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do{
            System.out.println("Introduce un numero:");
            numero = sc.nextInt();
            if(numero < 0){
                break;
            }
            if(numero % 2 == 0){
                System.out.println("Par");
                continue;
            }
            else{
                System.out.println("Impar");
            }
        }while(true);
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
