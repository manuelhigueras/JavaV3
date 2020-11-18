/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author user
 */
public class MiFechaFuncion {
   
    private int dia, mes, year;
    private boolean active;
    
    public MiFechaFuncion(int dia, int mes, int year){
        
        System.out.println("... en el constructor");
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    //public static void main(String[] args){
    //    MiFechaFuncion fecha = new MiFechaFuncion(22,7,1964); 
    //}
            
}
