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
public class ArbolDesicion {
    
    private NodoArbol Raiz;

    public ArbolDesicion() {
    }

    public ArbolDesicion(NodoArbol Raiz) {
        this.Raiz = Raiz;
    }

    public void setRaiz(NodoArbol Raiz) {
        this.Raiz = Raiz;
    }

    public NodoArbol getRaiz() {
        return Raiz;
    }
    
}
