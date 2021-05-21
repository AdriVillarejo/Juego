package inici;
import java.util.*;
import joc.*;


public class Juegoderol {
   
    public static void main(String[] args) {
        
        System.out.println(provaFase());
    
    }
        
    
    
        public void provaFase(){
        
        System.out.println("Creando el humano");
        Human human1 = new Human("Passif", 20, 25, 25);
        System.out.println("Humano creado");
        System.out.println("----------");
        
        System.out.println("Creando el guerrero");
        Warrior warrior1 = new Warrior("Parrilla", 20, 20, 30);
        System.out.println("Guerrrero creado");
        System.out.println("----------");
        
        System.out.println("Creando el alien");
        Alien alien1 = new Alien("Jorge" , 30, 15, 25);
        System.out.println("Alien creado");
        System.out.println("----------");
        
        human1.ataque(alien1);
        
        warrior1.ataque(human1);
        
        alien1.ataque(warrior1);
             
       
    }
        
            
    
}
