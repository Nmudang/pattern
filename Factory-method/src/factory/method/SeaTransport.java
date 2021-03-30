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
public class SeaTransport extends  Logistics {

    public SeaTransport(String origin, String dest) {
        
        super(origin, dest);
    }
    
    public Transport conCreateTransport() {
        return new Ship();
    }
    public String oceanPass(){
        return super.getOrigin() + " Atlantique " + super.getDesDestination() ;
    }
}