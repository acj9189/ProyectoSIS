/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Agentes.JugadorUno;
import java.io.Serializable;

/**
 *
 * @author Andres
 */
public class Ficha  implements Serializable{
    
    private String identificadorJugador;
    private int CostoMoverFicha;

    public Ficha() {
    }

    public Ficha(String identificadorJugador) {
        this.identificadorJugador = identificadorJugador;
    }

    public Ficha(String identificadorJugador, int CostoMoverFicha) {
        this.identificadorJugador = identificadorJugador;
        this.CostoMoverFicha = CostoMoverFicha;
    }

    public int getCostoMoverFicha() {
        return CostoMoverFicha;
    }

    public String getIdentificadorJugador() {
        return identificadorJugador;
    }

    public void setCostoMoverFicha(int CostoMoverFicha) {
        this.CostoMoverFicha = CostoMoverFicha;
    }

    public void setIdentificadorJugador(String identificadorJugador) {
        this.identificadorJugador = identificadorJugador;
    }
}
