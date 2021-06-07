package joc;

public class Human extends Player {

    public Human(String name, int pAtaque, int pDefensa, int life, String NombreEquipo) {
        super(name, pAtaque, pDefensa, life, NombreEquipo);
        
        if(super.getLife() > 100){
            setLife(100);
        }
    }

   
        
        
        
    }
    
    

    
   
