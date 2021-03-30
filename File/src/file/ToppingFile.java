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
public abstract class ToppingFile {
    private IFile fileName;
    
    public ToppingFile(IFile fileName){
        this.fileName = fileName;
    }
    public abstract String getTop();
    public String toString(){
        return fileName.toString();
    }
}
