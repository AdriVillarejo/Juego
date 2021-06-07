package joc;

public class Alien extends Player{

    public Alien(String name, int pAtaque, int pDefensa, int life, String NombreEquipo) {
        super(name, pAtaque, pDefensa, life, NombreEquipo);
        
        if (super.getLife() > 20){
            setpAtaque(pAtaque + 3);
            setpDefensa(pDefensa - 3);
        }
    }

   
        
        
        
        
    }
    
    
    

