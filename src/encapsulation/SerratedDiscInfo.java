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
public class SerratedDiscInfo { // classe at least 8 byte
   private int size; // 4 byte
    private int numberOfPins; // 4 byte
    private static String COMPANYNAME ; 
    public static void  setCOMPANYNAME(String name){
        COMPANYNAME = name ; 
    }
    public static String  getCOMPANYNAME(){
    return COMPANYNAME ; 
    }
    public void  setSize(int size){
        this.size = size ; 
    }
    public int  getSize(){
    return size ; 
    }
    public void  setNumberOfPins(int numberOfPins){
        this.numberOfPins = numberOfPins ; 
    }
    public int  getNumberOfPins(){
    return numberOfPins ; 
    }
    public SerratedDiscInfo(int a , int b){
    size = a ; //try with this if parameter was size not a
    numberOfPins = b ;  //try with this if parameter was numberOfPins not b
    }
    
    public void spin(){
        System.out.println("Spining Now");
         System.out.println(size);
    }  
}
