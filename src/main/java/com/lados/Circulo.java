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
public class Circulo extends Figura{
    int radio;
    double area;

    public Circulo(int radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }
    
    @Override
    public double CalcularArea(){
        area = 2.14* radio;
        return area;
    }
    
    public void Dibujar(){
        System.out.println("Has dibujado un triangulo");
    }
    
}
