/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopiña;

/**
 *
 * @author david
 */
public class Armas {
    int TipoArma;
    static boolean capacitado;
    static double dañoArma;
    String efecto;
    static int nivel = 1;

    public Armas(int TipoArma) {
        this.TipoArma = TipoArma;
        this.capacitado = capacitado;
        this.dañoArma = dañoArma;
        this.efecto = efecto;
        this.nivel = nivel;
    }

    public int getTipoArma() {
        return TipoArma;
    }

    public void setTipoArma(int TipoArma) {
        this.TipoArma = TipoArma;
    }

    public boolean isCapacitado() {
        return capacitado;
    }

    public void setCapacitado(boolean capacitado) {
        this.capacitado = capacitado;
    }

    public double getDañoArma() {
        return dañoArma;
    }

    public void setDañoArma(double dañoArma) {
        Armas.dañoArma = dañoArma;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        Armas.nivel = nivel;
    }

    public static void mejorarArma() {
        //TOFIX materiales de la clase Jugador
        int materiales = 0;
        int materialesNecesarios = 0;

        if (materiales >= materialesNecesarios) {
            nivel++;
            dañoArma = dañoArma + (Math.random() * 10) + 20;
        }
    }

    public static String capacitado(int TipoArma) {
        //Clases clases
        String tipoArma = "";
        //TOFIX poner las clases para ver si pueden o no llevar el arma
        switch (TipoArma) {
            case 1:
                tipoArma = "Fusil";
                break;
            case 2:
                tipoArma = "Pistola";
                break;
            case 3:
                tipoArma = "Cañon grande";
                break;
            case 4:
                tipoArma = "Francotirador";
                break;
        }
        return tipoArma;
    }

    @Override
    public String toString() {
        return "Armas{" + "TipoArma=" + TipoArma + ", tipoArma="+ capacitado(TipoArma) + ", Efecto=" + efecto + ", Nivel=" + nivel + 
                ", Capacitado=" + capacitado + '}';
    }


}
