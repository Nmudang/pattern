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
public class FileDec implements IFile{
    String name;
    public FileDec(String name){
        this.name = name;
    }
    public String toString(){
        return "FileDec" + name;
    }
}
