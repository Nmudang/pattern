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
public class Iphone implements LightningPhone {

    private boolean connected;
    private String namePhone;
    
    public Iphone(String namePhone){
        this.namePhone = namePhone;
    }
    @Override
    public void recharge() {
        if (connected) {
            System.out.println(namePhone+" Recharge started");
            System.out.println(namePhone+" Recharge finished");
        } else {
            System.out.println(namePhone+" Connect lightning first");
        }
    }

    @Override
    public void useLightning() {
        connected = true;
        System.out.println("Lightning connected");
    }
    public String toString(){
        return namePhone;
    }

}
