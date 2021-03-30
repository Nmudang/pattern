/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Customer {
    private ArrayList<ICustom> custom;
    WriteLogFile log;
    public Customer(){
        custom = new ArrayList<ICustom>(); 
        log = new WriteLogFile();
    }
    public void add(ICustom name){
        custom.add(name);
        System.out.println("add");
        log.wirte("add " + name.getName());
        
        
    }
    public void editCus(ICustom name){
        System.out.println("editCus");
        log.wirte("edit " +name.getBefor() + " to "+name.getName());
        saveGoogle(name.getName());
    }

    public void saveGoogle(String name){
        System.out.println("saveGoogle" + name);
    }
    public void notifyCus(){
         for (ICustom i : custom) {
            i.notifytoCus();
         }
    }
}
