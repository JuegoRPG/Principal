/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugodepiña;

/**
 *
 * @author User
 */
public class Arma {

    String TipoArma="";
    static boolean capacitado;
    static int dañoArma;
    String efecto;
    int nivel;

    public Arma(String TipoArma) {
        this.TipoArma = TipoArma;
        asignarArma(TipoArma);
        dañoArma = 5;
        nivel = 1;

    }

    public void mejorarArma() {
        //TOFIX materiales de la clase Jugador

        //esto es conceptual
        int materiales = 0;
        int materialesNecesarios = 0;

        if (materiales >= materialesNecesarios) {
            nivel++;
            dañoArma = dañoArma + (int) (Math.random() * 10) + 20;
        }
    }

    public void asignarArma(String tipo) {
        switch (tipo) {
            case "Fusil":
                dañoArma = (int) (Math.random() * 20) + 15;
                break;
            case "Metralleta":
                dañoArma = (int) (Math.random() * 20) + 15;
                break;

            case "Pistola":
                dañoArma = (int) (Math.random() * 20) + 15;
                break;
            case "Francotirador":
                dañoArma = (int) (Math.random() * 20) + 15;
                break;

        }
    }

    @Override
    public String toString() {
        return "Armas{" + "TipoArma=" + TipoArma +"Daño: "+dañoArma+", Efecto=" + efecto + ", Nivel=" + nivel+'}';
    }

}
