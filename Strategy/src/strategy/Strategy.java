/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author User
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "Korea";
        String b = "Thailand";
        RouteStrategy walk = new WalkingStrategy();
        RouteStrategy road = new RoadStrategy();
        RouteStrategy bts = new PublicTransportStrategy();
        RouteStrategy airplan = new AirplanStrategy();
        
        Navigator navigator = new Navigator();
        navigator.buidRoute(walk, a, b);
        navigator.buidRoute(road, a, b);
        navigator.buidRoute(bts, a, b);
        navigator.buidRoute(road, a, b);
        navigator.buidRoute(airplan, a, b);
    }
    
}
