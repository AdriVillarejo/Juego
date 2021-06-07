package joc;


public class ExcepcionRepetido extends Exception{
    
    public ExcepcionRepetido(String message) {
        super(message);
    }

    public ExcepcionRepetido() {
        super("El equipo esta repetido");
    }
    
}