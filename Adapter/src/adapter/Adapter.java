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
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    LightningPhone iphone = new Iphone("Mingyu");
    MicroUsbPhone android = new Android("Wonwoo");
    iphone.useLightning();
    iphone.recharge();
        System.out.println("------------");
        /*ลืมเอาสายชารืท android มา*/
    LightningPhone adapter = new AdapterForAndoid(android);
    adapter.useLightning();
    adapter.recharge();
    }
    
}
