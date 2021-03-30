/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.io.PrintStream;

/**
 *
 * @author User
 */
public class Factory {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args)  {
		FactoryFurniture modern = new Modern();
		FactoryFurniture victorian = new Victorian();
                System.out.println("Modern...");
                client_method(modern);
                System.out.println("--------------------");
                System.out.println("Victorian...");
                client_method(victorian);}
   public static void client_method(FactoryFurniture factory){
       System.out.println(factory.createChair());
       System.out.println(factory.createChair());
   }
}
