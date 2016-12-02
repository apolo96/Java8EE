/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo2Punto;

import java.util.Random;

/**
 *
 * @author Apolo
 */
public class PruebaPunto {
    
     public static void main(String[] args) {
         
        Random oNumR = new Random();

        Punto oPunto1 = new Punto();
        Punto oPunto2 = new Punto(oNumR.nextInt(100+1),oNumR.nextInt(100+1));
        Punto oPunto3 = new Punto(oNumR.nextInt(100+1),oNumR.nextInt(100+1));
        
        oPunto1.pintar();
        oPunto2.pintar();
        oPunto3.pintar();
        
        Punto[] cordenadas = new Punto[oNumR.nextInt(20+1)];
        
        for(Punto cordenada : cordenadas){
            cordenada = new Punto(oNumR.nextInt(100+1),oNumR.nextInt(100+1));
            cordenada.pintar();
        }
        
    }
}
