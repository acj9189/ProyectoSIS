/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;
import Clases.*;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

/**
 *
 * @author Andres
 */



public class JugadorUno extends Agent{
    
    @Override
    public void setup(){
    }
    
    class comportamientoJugador extends CyclicBehaviour{
        TableroGrafo tablero;

        @Override
        public void action() {
            //tablero = new TableroGrafo();

        }
    }

}
