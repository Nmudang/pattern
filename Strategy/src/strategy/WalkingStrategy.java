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
public class WalkingStrategy  implements RouteStrategy {

    @Override
    public void buidRouteAtoB(String a, String b) {
        System.out.println("from " + a + " to " + b + " by Walking");  
    }
    
}
