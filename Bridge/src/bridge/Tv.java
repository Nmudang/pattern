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
public class Tv implements device {
    private boolean IsEnabled;
    public Tv(){
        IsEnabled = false;
    }
    @Override
    public void Enable() {
        IsEnabled = true;
        System.out.println("Tv on");
       }

    @Override
    public void Disable() {
        IsEnabled = false;
        System.out.println("Tv off");
    }
    public boolean get(){
        return IsEnabled;
    }
}
    
