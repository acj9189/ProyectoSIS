/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;

import Clases.*;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public class Arbitro extends Agent {

    String NombreArbitro;
    TableroGrafo tablero;
    AID aidUno;
    AID aidDos;
    byte desicionQuinJuegaPrimero;
    ArbolDesicion arbolDesicion;

    @Override
    public void setup() {
        byte desicionJugar = (byte) (Math.random() * 2);
        comportamientoArbitro agenteArbitro = new comportamientoArbitro(desicionJugar);
        addBehaviour(agenteArbitro);

    }

    class comportamientoArbitro extends CyclicBehaviour {

        public comportamientoArbitro(byte desicion) {
            NombreArbitro = "Andres";
            tablero = new TableroGrafo();
            aidUno = new AID();
            aidDos = new AID();
            aidUno.setLocalName("B");
            aidDos.setLocalName("A");
            desicionQuinJuegaPrimero = desicion;
        }

        @Override
        public void action() {

            if (desicionQuinJuegaPrimero == 0) {
                enviarMensaje(aidUno);
                enviarMensaje(aidDos);
            } else {
                enviarMensaje(aidDos);
                enviarMensaje(aidUno);
            }

            //System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            // tablero.mostrartablero();
        }

        public void enviarMensaje(AID aid) {
            ACLMessage mensaje = new ACLMessage(ACLMessage.REQUEST);
            mensaje.setSender(getAID());
            mensaje.setLanguage("Español");
            mensaje.addReceiver(aid);
            try {
                mensaje.setContentObject(tablero);
            } catch (IOException ex) {
                Logger.getLogger(Arbitro.class.getName()).log(Level.SEVERE, null, ex);
            }
            send(mensaje);
            ACLMessage respuesta = blockingReceive();
            if (respuesta != null) {
                System.err.println("Recibido... de: " + respuesta.getSender().getLocalName());
                try {
                    tablero = (TableroGrafo) respuesta.getContentObject();
                } catch (UnreadableException ex) {
                    Logger.getLogger(Arbitro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

}
