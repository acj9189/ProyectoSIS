/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author Andres
 */
public class nodoGrafo {
    
    private int idientificador;
    private LinkedList<nodoGrafo> vecinos;
    private ficha ficha;

    public nodoGrafo() {
        this.ficha = null;
    }

    public nodoGrafo(int idientificador ) {
        this.ficha = null;
        this.idientificador = idientificador;
        this.vecinos = new LinkedList<>();
    
    }

    public nodoGrafo(ficha ficha) {
        this.ficha = ficha;
    }

    public ficha getFicha() {
        return ficha;
    }

    public void setFicha(ficha ficha) {
        this.ficha = ficha;
    }

    public LinkedList<nodoGrafo> getVecinos() {
        return vecinos;
    }

    public void setVecinos(LinkedList<nodoGrafo> vecinos) {
        this.vecinos = vecinos;
    }

    public int getIdientificador() {
        return idientificador;
    }

    public void setIdientificador(int idientificador) {
        this.idientificador = idientificador;
    }
    
    
    
    
    
    
    
    
    
}
