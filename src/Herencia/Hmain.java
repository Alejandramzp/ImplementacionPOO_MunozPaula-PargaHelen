/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Herencia;

/**
 *
 * @author camper
 */
public class Hmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno1 = new Alumno(100, "Christopher", "Bang", 26);
        
        System.out.println("Nombre:"+" "+ alumno1.nombre);
        System.out.println("Apellido:"+" "+ alumno1.apellido);
        System.out.println("Edad:"+" "+ alumno1.edad);
        System.out.println("Nota:"+" "+ alumno1.nota);
    }   
    
}
