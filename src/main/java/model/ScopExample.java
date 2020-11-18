/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class ScopExample {
    
    private int i =1;
    
    public void firstMethod(){
        int i=4, j =5;
        this.i = i + j;
        secondMethod(7);
    }
    public void secondMethod(int i){
        int j=8;
        this.i = i + j;
    }
}
