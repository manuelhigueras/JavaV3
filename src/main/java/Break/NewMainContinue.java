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
public class NewMainContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        calcular salario; 
        pedir Categoria - A, B o C
        Salario = 1000 + si eres A o C 500 euros.
        */
        String categoria;
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        double salario = 1000;
        int contarEmpleadoCategoriaNoB = 0;
        
        while(cont < 5){
            System.out.println("Categoria empleado:");
            categoria = sc.next();
            if(categoria.equals("B")){
                System.out.println("...Salario de "+ categoria+" es " + salario + "€");
                continue;
            }
            salario += 100;
            System.out.println("...Salario de "+ categoria+" es " + salario + "€");
            cont++;
            contarEmpleadoCategoriaNoB++;
        }
        System.out.println("Empleado con sueldo 1200 " + contarEmpleadoCategoriaNoB);
    }
    
}
