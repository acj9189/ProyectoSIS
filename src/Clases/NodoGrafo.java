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
public class NodoGrafo implements Serializable{
    
    private int idientificador;
    private LinkedList<NodoGrafo> vecinos;
    private Ficha ficha;

    public NodoGrafo() {
        this.ficha = null;
    }

    public NodoGrafo(int idientificador ) {
        this.ficha = null;
        this.idientificador = idientificador;
        this.vecinos = new LinkedList<>();
    
    }

    public NodoGrafo(Ficha ficha) {
        this.ficha = ficha;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public LinkedList<NodoGrafo> getVecinos() {
        return vecinos;
    }

    public void setVecinos(LinkedList<NodoGrafo> vecinos) {
        this.vecinos = vecinos;
    }

    public int getIdientificador() {
        return idientificador;
    }

    public void setIdientificador(int idientificador) {
        this.idientificador = idientificador;
    }
    
    
    
    
    
    
    
    
    
}
