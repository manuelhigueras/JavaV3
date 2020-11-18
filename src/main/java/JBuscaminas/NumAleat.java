/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JBuscaminas;

import java.util.Random;

/**
 *
 * @author user
 */
public class NumAleat {
    
    public int num, guardaNum;
    public int[] array;
    
//    public NumAleat(int max){
//        Random rd = new Random(max);
//        this.num = rd.nextInt(max);
//        this.tam = max;
//    }
    
//    public int[] generateArray(){
//        array = new int[this.tam];
//        guardaNum = 0;
//        for(int cont=0; cont < this.tam; cont++){
//            if(this.num != guardaNum){
//                guardaNum = this.num;
//            }
//            else{
//                guardaNum = comparaNumero(guardaNum, this.num, tam);
//            }
//            array[cont] = guardaNum;
//            System.out.println(array[cont]);
//        }
//        return array;
//    }
    
    public int[] generateArrayV2(int tam){
        array = new int[tam];
        Random rd = new Random(tam);
        boolean cond = true;
        int cont = 0;
        while(cond == true){
            this.num = rd.nextInt(tam);
            if(this.num != this.guardaNum){
                this.guardaNum = this.num;
                array[cont] = num;
                cont++;
            }
            else{
                this.num = rd.nextInt(tam);
            }
            if(cont == tam)
                cond = false;
        }
        return array;
    }
    
    public int[] ordenaArray(int[] a, int tam){
        Random rd = new Random(tam);
        int num2, num4;
        num2 = 0;
        num4 = 0;
        for(int cont = 0; cont < tam; cont++){
            num2 = a[cont];
            for(int cont2 = 1; cont2 < tam; cont2++){
                num4 = a[cont2];
                if(num2 == num4){
                      System.out.println("ES IGUAL");
//                    this.num = rd.nextInt(tam);
//                    a[cont] = this.num;
                }    
            }
        }
        return a;
    }
    
    public void imprimeCampo(int tam){
        for(int cont=0; cont < tam; cont++){
            System.out.println(array[cont]);
        }
    }
    
//    public int comparaNumero(int num1, int num2, int max){
//        
//        if(num1 == num2){
//            Random rd2 = new Random(this.tam);
//            this.num = rd2.nextInt(this.tam);
//            if(this.num == num1){
//                this.num = rd2.nextInt(this.tam);
//            }
//        }
//        return this.num;
//    }
    
}
