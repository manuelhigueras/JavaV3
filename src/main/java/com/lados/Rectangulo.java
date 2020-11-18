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
public class Rectangulo extends Figura{
    
    public Rectangulo(int x, int y) {
        super(x, y);
    }
    
    @Override
    public double CalcularArea(){
        area = (this.x * this.y);
        return area;
    }
    
    @Override
    public void Dibujar(){
        System.out.println("Has dibujado un rectangulo");
    }
    
}
