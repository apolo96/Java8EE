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
public class MainFunctions {
    
    public static void main(String[] args) {
        List<Persona> mundo = Persona.crearMundo();
        OperacionesImplementadas operaciones = new OperacionesImplementadas();
        operaciones.mostrarPersonas(mundo);
        System.out.println('M');
        System.out.println(operaciones.filtroPersonas(mundo,operaciones.esMasculino()));
        System.out.println('F');
        operaciones.mostrarFiltroPersonas(mundo,operaciones.esFemenino());
        System.out.println("Persona de 25 años de edad y sexo masculino");
        operaciones.mostrarFiltroPersonas(mundo,operaciones.cumpleCondiciones(25, 'M'));
    }
}
