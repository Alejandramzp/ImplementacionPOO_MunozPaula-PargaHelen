/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author camper
 */
public class Animal {
    public void hacerSonido(){
        System.out.println("Sonido del animal");
    }
}

class Gato extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("Gato: MIAU MIAU");
    }
}
class Vaca extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("Vaca: MUU");
    }
}
