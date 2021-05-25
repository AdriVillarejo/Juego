package joc;

public class Alien extends Player{

    public Alien(String name, int pAtaque, int pDefensa, int life) {
        super(name, pAtaque, pDefensa, life);
        
        if (super.life > 20){
            super.pAtaque += 3;
            super.pDefensa -=3; 
        }
    }

   
        
        
        
        
    }
    
    
    

