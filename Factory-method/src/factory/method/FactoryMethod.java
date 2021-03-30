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
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "Korea";
        String b = "Japan";
        RoadTransport road = new RoadTransport(a,b);
        client_method(road);
        System.out.println(road.roadPass());
        System.out.println(road.getOrigin());
        System.out.println("----------------");
        SeaTransport sea = new SeaTransport(a,b);
        client_method(sea);  
        System.out.println(sea.oceanPass());
    }
    public static void client_method(Logistics creator)
    {   
        
        creator.conCreateTransport();
        System.out.println(creator.PlanDelivery());
        System.out.println("Origin "+creator.getOrigin());
        System.out.println("Destination " +creator.getDesDestination());
        
    }
    
}
