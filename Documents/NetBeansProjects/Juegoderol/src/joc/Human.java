package joc;

public class Human extends Player {

    public Human(String name, int pAtaque, int pDefensa, int life) {
        super(name, pAtaque, pDefensa, life);
        
        if(super.life > 100){
            super.life = 100;
        }
    }

   
        
        
        
    }
    
    

    
   
