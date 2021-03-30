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
public class ChecksumFile extends ToppingFile{
    public ChecksumFile(IFile fileName) {
        super(fileName);
    }

    public String getTop() {
        return  super.toString()+" ChecksumFile";    
    }
    
}
    