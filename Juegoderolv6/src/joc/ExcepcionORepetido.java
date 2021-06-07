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
public class ExcepcionORepetido extends Exception{
    
    
    public  ExcepcionORepetido(String message) {
        super(message);
    }

    public ExcepcionORepetido() {
        super("El Objeto ya existe");
    }
    
}