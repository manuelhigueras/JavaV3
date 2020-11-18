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
public class MainTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tickets boleto = new Tickets(55);
        //Version 1.0
        /*boolean cond;
        boleto.setFam_num(false);
        cond = boleto.isFam_num();
        boleto.precioTicket(cond);
        System.out.println(boleto.toString());*/
        //Version 2.0
        boleto.precioTicketV2();
        System.out.println(boleto.toString());
        
    }
    
}
