/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author camper
 */
public class Pmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Animal animal1 = new Gato();
       Animal animal2 = new Vaca();
       
       System.out.println("Sonido del animal:");
       animal1.hacerSonido();
       animal2.hacerSonido();
        
    }   
    
}
