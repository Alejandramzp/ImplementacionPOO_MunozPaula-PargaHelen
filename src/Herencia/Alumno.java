/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author camper
 */
public class Alumno extends Persona {
   
    public int nota;

    public Alumno(int nota, String nombre, String apellido, int edad) {
        
        super(nombre, apellido, edad);
        this.nota = nota;
    }
    
}
