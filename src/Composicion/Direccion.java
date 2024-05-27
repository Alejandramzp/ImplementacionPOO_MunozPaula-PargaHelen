/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composicion;

/**
 *
 * @author camper
 */
public class Direccion {
    public String calle;
    public int numero;
    public String ciudad;

    public Direccion(String calle, int numero, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }
    
    public String toString(){
        return numero+ "" +" "+calle+","+ciudad;
    }
}

class Persona{
    public String nombre;
    public Direccion direccion;

    public Persona(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public void saludar(){
        System.out.println("Hola,Soy " +nombre+ " Vivo en: "+direccion);
    }
}
