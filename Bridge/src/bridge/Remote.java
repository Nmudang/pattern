/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author User
 */
public class Remote {

    private device idevice;

    public Remote(device idevice) {
        this.idevice = idevice;
    }

    public void TogglePower() {
        if (idevice.get()) {
            idevice.Disable();
        } else {
            idevice.Enable();

        }
    }

}
