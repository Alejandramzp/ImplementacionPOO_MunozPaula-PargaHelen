/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

/**
 *
 * @author camper
 */
abstract class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodo abstracto para detalles especificos de la persona
    abstract String ObtenerDetalles();
}   
class Estudiante extends Persona{
    public int nota;

    public Estudiante(int nota, String nombre, int edad) {
        super(nombre, edad);
        this.nota = nota;
    }
    
    //Implementacion del metodo abstracto
    @Override
    public String ObtenerDetalles(){
        return "Estudiante: "+super.nombre+" Edad: "+super.edad+" Nota: "+nota;
    }
        
}

    