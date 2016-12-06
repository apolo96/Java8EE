/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo4Stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Apolo
 */
@FunctionalInterface
public interface OperacionIf {
        
        public abstract void mostrarPersonas(List<Persona> personas);

	default Predicate<Persona> cumpleCondiciones(int edad, char genero) {
		return persona -> (persona.getEdad() >= edad && persona.getSexo() == genero);
	}

	default public Predicate<Persona> esDeGenero(char genero) {
		return persona -> persona.getSexo() == genero;
	}
	
        default public Predicate<Persona> esFemenino() {
		return esDeGenero('F');
	}
        
	default public Predicate<Persona> esMasculino() {
		return esDeGenero('M');
	}
        
	default public List<Persona> filtroPersonas(List<Persona> personas, Predicate<Persona> condicion) {
		return personas.stream().filter(condicion).collect(Collectors.<Persona>toList());
	}
	
	default public void mostrarFiltroPersonas(List<Persona> personas, Predicate<Persona> condicion) {
		personas.stream().filter(condicion).forEach(p -> System.out.println(p));
	}
        
        default public Predicate<Persona> tieneMasDe(int edad) {
		return persona -> persona.getEdad() >= edad;
	}
}
