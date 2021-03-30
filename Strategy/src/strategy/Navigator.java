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
public class Navigator {
    public void buidRoute(RouteStrategy routeStrategy,String a,String b) {
        routeStrategy.buidRouteAtoB(a, b);
    }
}
