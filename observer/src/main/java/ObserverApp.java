/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;


/**
 *
 * @author User
 */
public class ObserverApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] w = {"s","e"};
        Customer cus = new Customer();
        ICustom bus = new Business("Business 1");
        ICustom oth = new Other("Other 1");
        cus.add(bus);
        cus.add(oth);
        cus.editCus(bus);
        cus.editCus(oth);
        bus.editCus(cus, "Businessman 2");
        cus.notifyCus();
        
    }
    
    
}
