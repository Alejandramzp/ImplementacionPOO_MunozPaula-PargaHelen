/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Composicion;

/**
 *
 * @author camper
 */
public class Cmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Direccion direccionPepe = new Direccion("Calle 15", 456, "Medellin");
      
      Persona persona1 = new Persona("Pepe", direccionPepe);
      
      persona1.saludar();
     
    }    
}