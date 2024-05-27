/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Abstraccion;

/**
 *
 * @author camper
 */
public class Amain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Estudiante estudiante = new Estudiante(100,"Tobias",25);
        
        System.out.println(estudiante.ObtenerDetalles());
    }    
}