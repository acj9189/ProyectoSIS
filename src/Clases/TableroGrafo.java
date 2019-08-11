/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Andres
 */
public class TableroGrafo implements Serializable {

    LinkedList<nodoGrafo> Nodos;

    public TableroGrafo() {
        System.out.println("hola soy el tablero");
        realizarTablero();
        mostrartablero();
    }

    public void realizarTablero() {
        this.Nodos = new LinkedList<>();
        for (int i = 0; i < 24; i++) {
            this.Nodos.add(new nodoGrafo(i));
        }

        for (nodoGrafo nodo : this.Nodos) {
            identificarvecionos(nodo);

        }

    }

    private void identificarvecionos(nodoGrafo nodo) {
        int[]ids = {};
        switch (nodo.getIdientificador()) {
            case 0:
                ids = new int[2];
                ids[0] = 1;
                ids[1] = 9;
                break;
            case 1:
                ids = new int[3];
                ids[0] = 0;
                ids[1] = 4;
                ids[2] = 2;
                break;
            case 2:
                ids = new int[2];
                ids[0] = 1;
                ids[1] = 14;
                break;
            case 3:
                ids = new int[2];
                ids[0] = 4;
                ids[1] = 10;
                break;
            case 4:
                ids = new int[4];
                ids[0] = 1;
                ids[1] = 7;
                ids[2] = 3;
                ids[3] = 5;
                break;
            case 5:
                ids = new int[2];
                ids[0] = 4;
                ids[1] = 13;
                break;
            case 6:
                ids = new int[2];
                ids[0] = 7;
                ids[1] = 11;
                break;
            case 7:
                ids = new int[3];
                ids[0] = 4;
                ids[1] = 6;
                ids[1] = 8;
                break;
            case 8:
                ids = new int[2];
                ids[0] = 7;
                ids[1] = 12;
                break;
            case 9:
                ids = new int[3];
                ids[0] = 0;
                ids[1] = 21;
                ids[2] = 10;
                break;
            case 10:
                ids = new int[4];
                ids[0] = 3;
                ids[1] = 9;
                ids[2] = 18;
                ids[3] = 11;
                break;
            case 11:
                ids = new int[3];
                ids[0] = 6;
                ids[1] = 15;
                ids[2] = 10;
                break;
            case 12:
                ids = new int[3];
                ids[0] = 8;
                ids[1] = 17;
                ids[2] = 13;
                break;
            case 13:
                ids = new int[4];
               ids[0] = 12;
                ids[1] = 14;
                ids[2] = 5;
                ids[3] = 10;
                break;
            case 14:
                ids = new int[2];
                ids[0] = 2;
                ids[1] = 23;
                break;
            case 15:
                ids = new int[2];
                ids[0] = 11;
                ids[1] = 16;
                break;
            case 16:
                ids = new int[3];
                ids[0] = 15;
                ids[1] = 17;
                ids[2] = 19;
                break;
            case 17:
                ids = new int[2];
                ids[0] = 16;
                ids[1] = 12;
                break;
            case 18:
                ids = new int[2];
                ids[0] = 10;
                ids[1] = 19;
                break;
            case 19:
                ids = new int[4];
                ids[0] = 22;
                ids[1] = 16;
                ids[2] = 18;
                ids[3] = 20;
                break;
            case 20:
                ids = new int[2];
                ids[0] = 13;
                ids[1] = 19;
                break;
            case 21:
                ids = new int[2];
                ids[0] = 22;
                ids[1] = 9;
                break;
            case 22:
                ids = new int[3];
                ids[0] = 19;
                ids[1] = 21;
                ids[2] = 23;
                break;
            case 23:ids = new int[2];
                ids[0] = 22;
                ids[1] = 14;
                break;

        }
        asiganarVecionos(nodo, ids);
    }

    private void asiganarVecionos(nodoGrafo nodo, int[] ids) {

//        for(nodoGrafo nodoA : this.Nodos){
//            if(nodoA == nodo){
        for (int i = 0; i < ids.length; i++) {
            System.out.println(this.Nodos.get(ids[i] ).getIdientificador());
            //nodo.getVecinos().add(this.Nodos.get(this.Nodos.indexOf(ids[i])+1));
          nodo.getVecinos().add(this.Nodos.get(ids[i]));
        }
//            }
//        }

    }
    
    private void mostrartablero(){
        
        for(nodoGrafo nodo : this.Nodos){
            System.out.println("Soy nodo con id: "+ nodo.getIdientificador());
            for (nodoGrafo nodoV: nodo.getVecinos()){
                System.out.println("Soy hijo de: " + nodo.getIdientificador() + " mi vecino es: " + nodoV.getIdientificador() );
            }
        }
    
    }

    public void realizarJugada() {
    }

    public LinkedList<nodoGrafo> getNodos() {
        return Nodos;
    }

    public void setNodos(LinkedList<nodoGrafo> Nodos) {
        this.Nodos = Nodos;
    }

}
