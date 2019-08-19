/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;

import Clases.*;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.UnreadableException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.LinkedList;

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
public class JugadorUno extends Agent {

    String identificadorJugador;
    TableroGrafo tablero;
    LinkedList<Ficha> listaFichas;
    int numeroMaximoFichas;
    byte fase;
    
    int contador = 0;

    @Override
    public void setup() {
        comportamientoJugador agenteJugador = new comportamientoJugador();
        addBehaviour(agenteJugador);
        identificadorJugador = this.getLocalName();
        numeroMaximoFichas = 9;
        listaFichas = new LinkedList<>();
        fase = 0;
    }

    class comportamientoJugador extends CyclicBehaviour {

        @Override
        public void action() {

            ACLMessage mensaje = receive();
            if (mensaje != null) {
                System.err.println("Recibido... de: " + mensaje.getSender().getLocalName());

                try {
                    tablero = (TableroGrafo) mensaje.getContentObject();
                    // realizar jugada realizar 
                    //realizarJugada();
                    //asignarFicha();
                    definirFase();

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

        private void definirFase() {
            if (fase == 0) {
                asignarFicha();
            } else {
                realizarJugada();
            }
        }

        private void asignarFicha() {
            if (listaFichas.size() < 9) {
                int posicion = (int) (Math.random() * 24);
                Ficha fichaTemp = tablero.getNodos().get(posicion).getFicha();
                while (fichaTemp != null) {
                    posicion = (int) (Math.random() * 24);
                    fichaTemp = tablero.getNodos().get(posicion).getFicha();
                }
                Ficha ficha = new Ficha(identificadorJugador);
                listaFichas.add(ficha);
                tablero.getNodos().get(posicion).setFicha(ficha);
//                contador++;
//                System.err.println(contador + " Soy el contador");
            } else {
                fase = 1;
               // System.err.println("Cambie de fase");
                //tablero.mostrartablero();
            }

        }

        private void realizarJugada() {
            System.out.println("Realice mi jugada.... " + getLocalName());
        }
        
        private void moverFichaAlVecnio(NodoGrafo nodoContieneFichaAMover){
            // contien ficha
            for(NodoGrafo nodoPosibleMover: nodoContieneFichaAMover.getVecinos()){
                if(nodoPosibleMover.getFicha() == null){
                    // y tiene la menor eurista nos movemos a ese... trae nodo de menor euritica
                    Ficha fichaMover = nodoContieneFichaAMover.getFicha();
                    nodoPosibleMover.setFicha(fichaMover);
                    nodoContieneFichaAMover.setFicha(null);
                    break;
                        
                }  
            }    
        }
        

    }

}
