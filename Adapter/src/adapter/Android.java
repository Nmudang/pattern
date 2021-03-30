/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author User
 */
public class Android implements MicroUsbPhone{

   private boolean connected;
    private String namePhone;
    
    public Android(String namePhone){
        this.namePhone = namePhone;
    }
    public void useMicroUsb() {
        connected = true;
        System.out.println("MicroUsb connected");
    }
    public void recharge() {
        if(connected) {
            System.out.println(namePhone+" Recharge started");
            System.out.println(namePhone+" Recharge finished");
        } else {
            System.out.println(namePhone+" Connect MicroUsb first");
        }
    }
    public String toString(){
        return namePhone;
    }
}
