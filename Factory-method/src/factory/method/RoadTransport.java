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
public class RoadTransport extends  Logistics {

    public RoadTransport(String origin, String dest) {
        super(origin, dest);
    }
    
    public Transport conCreateTransport() {
        return new Truck();
    }
    public String roadPass(){
        return super.getOrigin() + " Yaowarat " + super.getDesDestination();
    }
    
}
