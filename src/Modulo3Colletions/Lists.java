/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modulo3Colletions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Apolo
 */
public class Lists {
    
    public static void main(String[] args) {
        
        // ArrayList -> acceden a una posición de forma muy rápida
        
        List<String> cards = new ArrayList<>();
        
        cards.add("Audi v8");
        cards.add("Ferrari loto");
        cards.add("Nissan 350z");
        cards.add("Lamborghini murcielago");
        cards.add("Ford fiesta");
        
        int numCards = cards.size();
        
        // Remove Elment ArrayList
        cards.remove(numCards - 1);
        
        numCards = cards.size();
        
        // Classic
        for(int x = 0; x < numCards;x++){
            System.out.println(cards.get(x));
        }
        
        // Best for
        cards.stream().forEach((card) -> {
            System.out.println(card);
        });
        
        // Iterator 
        Iterator<String> oCard = cards.iterator();  
        while(oCard.hasNext()){
            System.out.println(oCard.next()); 
        }
        
        
        // LinkedList -> para trabajar con inserciones y borrado muy rápidos
        
        List<String> futball = new LinkedList<>();
        
        futball.add("Barca");
        futball.add("Atleti");
        futball.add("Real");

        int numFutball = futball.size();

        // Remove Elment ArrayList
        futball.remove(numFutball - 1);
        
        numFutball = futball.size();
        // Classic
        for(int x = 0; x < numFutball;x++){
            System.out.println(futball.get(x));
        }
        
        // Best for
        futball.stream().forEach((futb) -> {
            System.out.println(futb);
        });
        
        // Iterator 
        Iterator<String> oFutball;  
        oFutball = futball.iterator();
        while(oFutball.hasNext()){
            System.out.println(oFutball.next()); 
        }
    }
}
