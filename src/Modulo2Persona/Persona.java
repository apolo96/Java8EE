/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo2Persona;

/**
 *
 * @author Apolo
 */
public class Persona {
    
    private String nombre;
    private byte edad;
    private char sexo;
    private String dni;
    private boolean bCasado;
    
    public Persona(){
        
    }
    
    public Persona(Persona persona){
    
    }

    public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.bCasado = bCasado;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public String getDni() {
        return dni;
    }

    public boolean isbCasado() {
        return bCasado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setbCasado(boolean bCasado) {
        this.bCasado = bCasado;
    }

    @Override
    public String toString() {
        String edad = String.valueOf(this.edad);
        String sexo = String.valueOf(this.sexo);
        String dni = String.valueOf(this.dni);
        String bCasado = String.valueOf(this.bCasado);
        return "Nombre: "+ this.nombre + " Edad: "+edad +" Sexo: "+sexo+" Dni: "+ dni+" Casado: "+bCasado;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
    
    
}
