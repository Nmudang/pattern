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
public interface device {
    public static boolean IsEnabled = false;
    public void Enable();
    public void Disable();
    public boolean get();
}
