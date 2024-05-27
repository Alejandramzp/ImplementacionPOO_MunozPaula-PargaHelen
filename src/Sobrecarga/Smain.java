/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author camper
 */
public class Smain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal perro = new Animal("perro");
      Animal gato = new Animal("gato");
      
      perro.hacerSonido();
      perro.hacerSonido("Guau");
      perro.hacerSonido("Guau",3);
      
      gato.hacerSonido();
      gato.hacerSonido("Miau");
      gato.hacerSonido("Miau",3);
    }    
}
