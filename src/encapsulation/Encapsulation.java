/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author gt
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SerratedDiscInfo s1 = new SerratedDiscInfo(8, 10);
        s1.spin();
        s1.setSize(20);
        s1.setNumberOfPins(20);
         System.out.println("******************************");
        SerratedDiscInfo.setCOMPANYNAME("Hello From Company");
        int x = s1.getSize();
        int y = s1.getNumberOfPins();
        String temp = SerratedDiscInfo.getCOMPANYNAME();
        System.out.println("Name :" + temp);
        System.out.println("Size :" + x);
        System.out.println("Number Of Pins :" + y);
    }
    
}
