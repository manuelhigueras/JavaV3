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
public class Cuadrado extends Figura{

    public Cuadrado(int x, int y) {
        super(x, y);
    }
    
    public double CalcularArea(){
        area = this.x + this.y;
        return area;
    }
    
    public void Dibujar(){
        System.out.println("Has dibujado un triangulo");
    }
    
}
