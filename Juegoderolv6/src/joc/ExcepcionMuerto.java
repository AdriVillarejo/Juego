/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

/**
 *
 * @author Jesús Parra <Jesús Parra>
 */
public class ExcepcionMuerto extends Exception{
    
    public ExcepcionMuerto(String message) {
        super(message);
    }

    public ExcepcionMuerto() {
        super("El jugador esta muerto");
    }
    
}