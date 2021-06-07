package inici;
import java.util.*;
import joc.*;


public class Juegoderol {
   
    public static void main(String[] args) {    
        
        provaFase();
        
    }
   
        public static void provaFase(){
        
        System.out.println("Creando el humano...");
        Human human1 = new Human("Passif", 20 , 8 , 55, "Fila 8");
        System.out.println("Humano creado :)");
        System.out.println(" ");
        
        System.out.println("Creando el guerrero...");
        Warrior warrior1 = new Warrior("Parrilla", 15, 10, 65, "Fila 4,5");
        System.out.println("Guerrrero creado :) ");
        System.out.println(" ");
        
        System.out.println("Creando el alien...");
        Alien alien1 = new Alien("Jorge" , 30 , 6 , 50, "Fila 5");
        System.out.println("Alien creado :)");
        System.out.println(" ");
        
        human1.ataque(alien1);
        
        warrior1.ataque(human1);
        
        alien1.ataque(warrior1);
             
        
        Team ClanComputacion = new Team("Clan Computación");
        Team XancletaTeam = new Team ("Xancleta Team");
        
        ClanComputacion.add(alien1);
        ClanComputacion.add(human1);
        ClanComputacion.add(warrior1);
        XancletaTeam.add(alien1);
        
        System.out.println(" ");
        ClanComputacion.getMembers();
        System.out.println(" ");
        XancletaTeam.getMembers();  
        
        
       
    }
        
             
       
        
            
    
}
