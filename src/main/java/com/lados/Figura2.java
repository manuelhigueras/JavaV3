/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lados;

/**
 *
 * @author user
 */
public class Figura2 {
    Figura[] x;
    public Figura[] creaFigura(int tamPos){
        x = new Figura[tamPos];
        for(int i=0; i<tamPos; i++){
            x[i] = new Figura(i,i*5);
        }
        return x;
    }
    
    public void ImprimeFigura(){
        for(int i=0; i<x.length; i++){
            System.out.println("valor = " + x[i].x + ", " + x[i].y);
        }
    }
    
    
}
