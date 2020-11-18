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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura f = new Figura(5,5);
        f.x = 4;
        f.y = 5;
        f.Dibujar();
        System.out.println("Area de f es " + f.CalcularArea());
        
        Circulo c = new Circulo(5,5,5);
        System.out.println("Area de f es " + c.CalcularArea());

        Cuadrado q = new Cuadrado(2,4);
        System.out.println("Area de f es " + q.CalcularArea());
        
        Rectangulo rect = new Rectangulo(4,4);
        System.out.println("Area de f es " + rect.CalcularArea());
        
        Figura2 array = new Figura2();
        Figura[] fig = array.creaFigura(14);
        
        Figura f2 = new Figura(7,5);
        
        //array.ImprimeFigura();
        
        dibujarCuadro(fig);
        
        Figura[] figuras = new Figura[4];
        figuras[0] = f;
        figuras[1] = f2;
        figuras[2] = q;
        figuras[3] = rect;
        
    }
    
    public static void dibujarCuadro(Figura[] figurasADibujar){
        for(Figura f: figurasADibujar){
            f.Dibujar();
        }
    }
    
}
