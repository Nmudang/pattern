/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.method;

/**
 *
 * @author User
 */
abstract class Logistics {
    private String origin;
    String dest;
    
    public Logistics(String origin,String dest){
        this.origin = origin;
        this.dest = dest;
    }
    public String PlanDelivery()
    {
        Transport product = conCreateTransport();
        return origin+ " to "+ dest +" "+ product.Deliverly();
    }
    public abstract Transport conCreateTransport();
    
    public String getOrigin(){
        return origin;
    }
    public String getDesDestination(){
        return dest;
    }
    
    
}
