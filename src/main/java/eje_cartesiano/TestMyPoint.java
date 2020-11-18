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
public class TestMyPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyPointg start = new MyPointg();
        MyPointg end = new MyPointg();
        
        start.x = 10;
        start.y =10;
        
        end.x = 20;
        end.y = 30;
        
        System.out.println("Start point is x= " + start.x);
        System.out.println("Start point is y= " + start.y);
        
        MyPointg stray = new MyPointg();
        stray = end;
        stray.x = 47;
        stray.y = 50;
        
        System.out.println(stray.toString());
        
        MyPointg stray2 = new MyPointg();
        stray2.x = end.x;
        stray2.y = end.y;
        
        System.out.println("... crear un nuevo punto");
        MyPointg punto = new MyPointg();
        System.out.println("x " + punto.x);    
        System.out.println("y " + punto.y);            
        System.out.println("color " + punto.color);    
        
    }
    
}
