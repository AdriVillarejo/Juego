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
public class ExcepcionPerte extends Exception{
    
    public ExcepcionPerte(String message) {
        super(message);
    }

    public ExcepcionPerte() {
        super("El jugador no pertenece al Equipo");
    }
    
}