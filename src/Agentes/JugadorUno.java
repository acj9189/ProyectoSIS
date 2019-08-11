/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;

import Clases.TableroGrafo;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*import Clases.*;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;*/

/**
 *
 * @author Andres
 */



public class JugadorUno extends Agent{
    
    @Override
    public void setup(){
        comportamientoJugador agenteJugador = new comportamientoJugador();
        addBehaviour(agenteJugador);
    }
    
    class comportamientoJugador extends CyclicBehaviour{
        TableroGrafo tablero;
        

        @Override
        public void action() {
            ACLMessage mensaje = receive();
            if(mensaje!= null){
                System.err.println("Recibido... de: " + mensaje.getSender().getLocalName());
              
                try {
                    tablero = (TableroGrafo)mensaje.getContentObject();
                       // realizar jugada realizar 
                    realizarJugada();
                    
                    ACLMessage respuesta = mensaje.createReply();
                    respuesta.setPerformative(ACLMessage.INFORM);
                    respuesta.setContentObject(tablero);
                    send(respuesta);
                } catch (Exception ex) {
                    Logger.getLogger(JugadorUno.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        //mensaje = null;
        }
        
        private void realizarJugada(){
            System.out.println("Realice mi jugada.... " + getLocalName());
        }
    }

}
