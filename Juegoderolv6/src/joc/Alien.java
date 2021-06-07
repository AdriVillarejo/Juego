// Clase de alien

package joc;

public class Alien extends Player{
        
    

    public Alien(String name, int pAtaque, int pDefensa, int life) {
      
        super(name, pAtaque, pDefensa, life);
    // if para sumar o restar vida     
        if (super.getLife() > 20){
            setpAtaque(pAtaque + 3);
            setpDefensa(pDefensa - 3);
        }
    }
     public Alien() {
        super();

 
    }
}
    
    
    

