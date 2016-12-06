/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo4Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Apolo
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private char sexo;
    
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public Persona(Mundo mundo) {
        this(mundo.nombre,mundo.edad,mundo.sexo);
    }
     
    public static List<Persona> crearMundo(){
        List<Persona> personas = new ArrayList<>();
        Random r = new Random();
        int num = r.nextInt(6) + 5;
        for (int i = 1; i <= num; i++) {
            int edad = r.nextInt(48) + 18;
            char sexo = r.nextBoolean() ? 'M' : 'F';
            personas.add(new Persona.Mundo().ponNombre("Persona"+i).ponEdad(edad).ponSexo(sexo).nacer());
        }
        return personas;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    
    
    static public class Mundo {
        
        private String nombre;
        private int edad;
        private char sexo;
           
        public Persona nacer(){
            return new Persona(this);
        }
        
        public Mundo ponNombre(String nombre){
            this.nombre = nombre;
            return this;
        }
        
        public Mundo ponEdad(int edad){
            this.edad = edad;
            return this;
        }
        
        public Mundo ponSexo(char sexo){
            this.sexo = sexo;
            return this;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public char getSexo() {
            return sexo;
        }

    }
    
}
