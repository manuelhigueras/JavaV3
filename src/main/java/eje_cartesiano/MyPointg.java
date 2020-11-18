/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje_cartesiano;

/**
 *
 * @author user
 */
public class MyPointg {
    public int x,y,z;
    public double total;
    public String color;

    public MyPointg() {
        this.x = 0;
        this.y = 0;
    }
    
    public MyPointg(int x, int y, String color) {
        this.x = x;
        this.y = y;
    }

    public double triangulo(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        total = x*y*4;
        return total;
    }
    
    @Override
    public String toString() {
        return "Ejes Cartesianos{" + "x=" + x + ", y=" + y + '}';
    }
    
    public void dibuja(){
        int num_rand = (int) (Math.random()*10);
        int y1 = 0;
        int x1;
        if(num_rand > 5){
            y1=4;
        }
        x1 = y1 + 2;
    }
    
/*
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
*/    
    
}
