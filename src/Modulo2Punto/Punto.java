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
public class Punto {
    
    private int x;
    private int y;
    
    public Punto(){
       this.x = new Random().nextInt(20+1);
       this.y = new Random().nextInt(20+1);
    }
    
    public Punto(int x , int y){
        this.x = x;
        this.y = y;
    }
    
    public Punto(Punto punto){
        this.x = punto.x;
        this.y = punto.y;
    }
    
    public void pintar(){
        System.out.println("Punto x: "+ this.x + " Punto y: " + this.y);
    } 
}
