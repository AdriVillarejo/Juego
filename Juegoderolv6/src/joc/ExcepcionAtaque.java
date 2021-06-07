  
package joc;

public class ExcepcionAtaque extends Exception{
    
    public ExcepcionAtaque(String message) {
        super(message);
    }

    public ExcepcionAtaque () {
        super("El jugador no se puede atacar a si mismo");
    }
    
}