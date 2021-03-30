/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author User
 */
public class AudioMixer {
    private boolean check;
    public boolean CanEnhancement(String file) {
        System.out.println("AudioMixer " +file);
        check = true;
        return check;
    }
    public String EnhanceAudio(String file) {
        System.out.println("AudioMixer2 " +file);
        return "check: " + check + " ( " +file+ " ) ";
    }
}