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
public class NodoArbol {
    
    private LinkedList<NodoArbol> listaHijos;
    private LinkedList<TableroGrafo> tablero;
    private byte tipoNodo = 0;
    
    private int heuristicaH;
    private int costoMoverFichaF;
    private int CantidadFichasAdversarioG;

    public NodoArbol(LinkedList<NodoArbol> listaHijos, LinkedList<TableroGrafo> tablero, int heuristicaH, int distanciaOrigenF, int distanciaDestinoG) {
        this.listaHijos = listaHijos;
        this.tablero = tablero;
        this.heuristicaH = heuristicaH;
        this.costoMoverFichaF = distanciaOrigenF;
        this.CantidadFichasAdversarioG = distanciaDestinoG;
    }

    public NodoArbol() {
        
    }

    public int getDistanciaDestinoG() {
        return CantidadFichasAdversarioG;
    }

    public int getDistanciaOrigenF() {
        return costoMoverFichaF;
    }

    public int getHeuristicaH() {
        return heuristicaH;
    }

    public void setDistanciaDestinoG(int distanciaDestinoG) {
        this.CantidadFichasAdversarioG = distanciaDestinoG;
    }

    public void setDistanciaOrigenF(int distanciaOrigenF) {
        this.costoMoverFichaF = distanciaOrigenF;
    }

    public void setHeuristicaH(int heuristicaH) {
        this.heuristicaH = heuristicaH;
    }

    public void setListaHijos(LinkedList<NodoArbol> listaHijos) {
        this.listaHijos = listaHijos;
    }

    public void setTablero(LinkedList<TableroGrafo> tablero) {
        this.tablero = tablero;
    }

    public LinkedList<NodoArbol> getListaHijos() {
        return listaHijos;
    }

    public LinkedList<TableroGrafo> getTablero() {
        return tablero;
    }
    
    
    
    
    
    
}
