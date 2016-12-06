/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo4Java8;

/**
 *
 * @author Apolo
 */

//En la definición de interfaz funcional se indica que en
//un interfaz pueden existir múltiples métodos abstractos
//siempre que todos menos uno sobrescriban un método
//público de la clase Object

@FunctionalInterface
public interface Vehiculo {
    
    public void run();
    
    default public void stop(){
        System.out.println("Parar");
    }
    
    @Override
    public String toString();
    
}
