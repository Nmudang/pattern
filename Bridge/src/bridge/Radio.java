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
public class Radio implements device {
    private boolean IsEnabled;
    public Radio(){
        IsEnabled = false;
    }
    @Override
    public void Enable() {
        IsEnabled = true;
        System.out.println("Radio on");
       }

    @Override
    public void Disable() {
        IsEnabled = false;
        System.out.println("Radio off");
    }
    public boolean get(){
        return IsEnabled;
    }
    
}
