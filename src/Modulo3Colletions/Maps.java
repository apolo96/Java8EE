/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo3Colletions;

import Modulo3ArrayListPersona.Persona;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author Apolo
 */
public class Maps {
    
    
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        // Para definirlos se utiliza la interfaz Map<K,V>
        
        // HashMap<K,V> (ignora repetidos)
        Map<String,Persona> socios = new HashMap<>();
        
        // TreeMap<K,V> (ordenados por clave) 
        Map<String,Persona> empleados = new TreeMap<>();
        
        // LinkedHashMap<K,V> (orden de inserción)
        Map<String,Persona> futbolistas = new LinkedHashMap<>();
        
        int numPersonas = aleatorio.nextInt(10) + 1;
        
        for (Integer i = 0; i < numPersonas; i++) {
            Integer cod = aleatorio.nextInt(500) + 1;
            socios.put(cod.toString(),new Persona("Andres S Polo"+i,10+i,cod));
            empleados.put(cod.toString(), new Persona("Andres E Polo"+i,10+i,cod));
            futbolistas.put(cod.toString(), new Persona("Andres F Polo"+i,10+i,cod));
        }
        
        System.out.println("Numero de socios " + socios.size());
        
        for(Map.Entry<String,Persona> socio : socios.entrySet()){
            String key = socio.getKey();
            Persona oSocio = socio.getValue();
            System.out.println("Key: "+ key);
            System.out.println("Object" + oSocio.toString());
        }
    }
}
