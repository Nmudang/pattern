/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

/**
 *
 * @author User
 */
public class Other  implements ICustom {
    private String name;
    private String before;
    public Other(String name){
        this.name = name;
        this.before = before;
    }
    @Override
    public void notifytoCus() {
        System.out.println("hello Other");   
    }

    @Override
    public String getName() {
        return "Other "+name;
    }

    @Override
    public void editCus(Customer cus,String name) {
      before = this.name;
      this.name = name;
      cus.editCus(this);
    }
    
    @Override
    public String getBefor() {
        return before;
    }

}