/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author user
 */
public class Tickets {
    
    private int edad;
    private boolean fam_num = false;
    private double costo;

    public Tickets(int edad) {
        this.edad = edad;
        this.fam_num = fam_num;
        costo = 0;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isFam_num() {
        return fam_num;
    }

    public void setFam_num(boolean fam_num) {
        this.fam_num = fam_num;
    }

    public double getCosto() {
        return costo;
    }
    
    public void precioTicket(boolean fam_num){
        if(this.fam_num  || edad > 60){
            this.costo = 5;
        }
        else{
            if(this.fam_num & edad < 10){
                this.costo = 4;
            }
            else{
                this.costo = 7;
            }
        }
    }
    
    public void precioTicketV2(){
        if((edad >= 0) && (edad <=7)){
            this.costo = 4;
        }
        else{
            if(edad > 7 && edad <= 15){
                this.costo = 5;
            }
            else{
                if(edad > 15 && edad <=60){
                    this.costo = 6;
                }
                else{
                    if(edad > 60){
                        this.costo = 0;
                    }
                }
            }
        }
    }  

    @Override
    public String toString() {
        return "Tickets{" + "edad=" + edad + ", fam_num=" + fam_num + ", costo=" + costo + '}';
    }
    
}
