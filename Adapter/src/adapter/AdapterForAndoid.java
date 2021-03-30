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
/* ลืมสายชารทแอนดอยมา ทำยังไงดีน้า */
public class AdapterForAndoid implements LightningPhone {
    
    private final MicroUsbPhone microUsbPhone;
    
    public AdapterForAndoid(MicroUsbPhone microUsbPhone) {
        this.microUsbPhone = microUsbPhone;
    }

    @Override
    public void recharge() {
        microUsbPhone.recharge();
        }

    @Override
    public void useLightning() {
        microUsbPhone.useMicroUsb();
    }
    
}
