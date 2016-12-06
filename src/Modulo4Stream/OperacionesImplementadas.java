/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo4Stream;

import java.util.List;

/**
 *
 * @author Apolo
 */
public class OperacionesImplementadas implements OperacionIf{

    @Override
    public void mostrarPersonas(List<Persona> personas) {
        for(Persona persona : personas){
            System.out.println(persona);
        }
    }
    public OperacionesImplementadas() {
    }
    
    
}
