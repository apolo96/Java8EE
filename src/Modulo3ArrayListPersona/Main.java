/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo3ArrayListPersona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Apolo
 */
public class Main {
    
    private static final int PERSONAS_MAX = 20;
    private static final int ALET_MAX = 4;
    
    public static void main(String[] args) {
          
        List<Persona> personas = new ArrayList<>();
        
        Random rd = new Random();
        
        int np = rd.nextInt(PERSONAS_MAX + 1);
        
        for(int x = 0;x < np;x++){
            int alet = rd.nextInt(ALET_MAX + 1);
            switch(alet){
                case 1:
                    personas.add(new Persona("Andres",21,014));
                    break;
                case 2:
                    personas.add(new Obrero("Lina",33,013));
                    break;
                case 3:
                    personas.add(new Tecnico("Neyza",25,012));
                    break;
            }           
        }  
        
        Iterator<Persona> persona = personas.iterator();
        while(persona.hasNext()){
            String dataPersona = persona.next().toString();
            System.out.println(dataPersona);
        }
        
    }
}
