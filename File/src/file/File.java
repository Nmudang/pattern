/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author User
 */
public class File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IFile fileName = new FileDec("Hello.py");
        System.out.println(fileName.toString());
        ToppingFile compress = new CompressFile(fileName);
        System.out.println(compress.getTop());
        compress = new EncryptFile(fileName);
        System.out.println(compress.getTop());
        compress = new ChecksumFile(fileName);
        System.out.println(compress.getTop());
        
        
        
    }
    
}
