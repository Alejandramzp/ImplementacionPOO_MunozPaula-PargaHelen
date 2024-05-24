/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author camper
 */
public class Persona {
       // Ocultación de los detalles internos de una clase y el acceso a sus datos solo a través de métodos públicos.
   private String nombre;
   private int edad;
   
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodos para acceder y modificar
    
    //Getter para obtener el nombre
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    //SETTER para establecer el nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
