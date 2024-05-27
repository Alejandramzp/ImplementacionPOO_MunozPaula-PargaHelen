/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author camper
 */
public class Animal {
    
    public String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
    
    //Método sobrecargado para que el animal emita un sonido
    public void hacerSonido(String sonido){
        System.out.println("El " + nombre +" hace el sonido: " + sonido);
    }
    
    //Método sobrecargado para que el animal emita un sonido un # de veces
    public void hacerSonido(String sonido,int veces){
        System.out.println("El " + nombre +" hace el sonido: " + sonido +" "+veces +" veces");
    }
}
