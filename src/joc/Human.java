package joc;

public class Human extends Player {

    public Human(String name, int pAtaque, int pDefensa, int life) {
        super(name, pAtaque, pDefensa, life);
        // if para que cuando el daño sea menor que 100 no le quite vida
        if(super.getLife() > 100){
            setLife(100);
        }
    }
        public Human() {
        
    
    }
}
    
    

    
   
