/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lados;

import java.util.Objects;

/**
 *
 * @author user
 */
public class Figura {
    
    protected int x, y;
    protected double area;
    protected String color;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Figura(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public double CalcularArea(){
        area = (this.x * this.y)/2;
        return area;
    }
    
    public void Dibujar(){
        System.out.println("Has dibujado un triangulo de x = " + this.x + " - " + this.y);
    }

    @Override
    public String toString() {
        return "Figura{" + "x=" + x + ", y=" + y + ", area=" + area + ", color=" + color + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Figura other = (Figura) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
