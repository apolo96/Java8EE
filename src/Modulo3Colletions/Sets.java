/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo3Colletions;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Apolo
 */
public class Sets {
    
    public static void main(String[] args) {
     
        int n;
        Random aleatorio = new Random();
        // SET Los elementos no conservan el orden de entrada
    
        // HashSet, se han ignorado los repetidos y el orden no es previsible.
        Set<Integer> hashNumeros = new HashSet<>();
        
        //TreeSet, se han ignorado los repetidos y están ordenados de menor a mayor.
        Set<Integer> treeNumeros = new TreeSet<>();
        
        int cantidad  = aleatorio.nextInt(6) + 1;

        for (int i = 1; i < cantidad; i++) {
            n = aleatorio.nextInt(49) + 1;
            hashNumeros.add(n);
            treeNumeros.add(n);
        }
        System.out.println("Elementos en el HashSet:"+ treeNumeros.size());
        for(Integer numero : hashNumeros) {
            System.out.println(numero);
        }
        System.out.println();
        System.out.println("Elementos en el TreeSet:"+ treeNumeros.size());
        for(Integer numero : treeNumeros) {
            System.out.println(numero+"");
        }
    }
}
