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
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Remote RemoteTv = new Remote(new Tv());
        Remote RemoteRadio = new Remote(new Radio());
        RemoteTv.TogglePower();
        RemoteTv.TogglePower();
        RemoteRadio.TogglePower();
        RemoteRadio.TogglePower();
    }
    
}
