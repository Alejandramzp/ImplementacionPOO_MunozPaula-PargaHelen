/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author camper
 */
public class Emain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Persona persona1 = new Persona("Helen", 24);
        System.out.println("Nombre:"+""+persona1.getNombre());
        System.out.println("Edad:"+""+persona1.getEdad());
        
        //Modificar el nombre y edad
        persona1.setNombre("Paula");
        persona1.setEdad(25);
        
        //Volver a mostrar la persona 1 modificada
        System.out.println("Nombre:"+""+persona1.getNombre());
        System.out.println("Edad:"+""+persona1.getEdad());
        
    }   
    
}
