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
public class VidioCompressor {
     public String CompressFile(String file) {
         System.out.println("VidioCompressor "+file);
        return file;
    }
}
