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
public class Personaje {
//Basicas

    String nombre;
    int clase;
    boolean vida;

    int PuntosVida;
    int PuntosHabilidad;
//Control del nivel
    int nivelPj;
    int ExpPj;
    int ExpSiguienteNivel;

//estadisticas del pj
    int fuerza;
    int destreza;
    int agilidad;
    int defensa;
    int critico;
    int muertes;

    public Personaje(String nombre, int clase) {
        this.nombre = nombre;
        this.clase = clase;
        PuntosHabilidad = 0;
        muertes = 0;
        asignarClase(clase);
        ExpSiguienteNivel = 10000;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\t Clase: " + clase +"\t Nivel: "+nivelPj+ "\t Puntos de salud: " + PuntosVida + "\t Fuerza: "
                + fuerza + "\t Destreza: " + destreza + "\t Agilidad: " + agilidad + "\t "
                + "Defensa: " + defensa + " \t Critico: " + critico + "\n";
    }

    public void asignarClase(int select) {
        switch (select) {
            case 1:     //humanos          
                fuerza = (int) (Math.random() * 10) + 15;
                destreza = (int) (Math.random() * 10) + 5;
                agilidad = (int) (Math.random() * 7) + 3;
                defensa = (int) (Math.random() * 20) + 10;
                critico = 5;
                PuntosVida = (int) (Math.random() * 50) + 100;
                break;
            case 2:    //elfos
                fuerza = (int) (Math.random() * 10) + 10;
                destreza = (int) (Math.random() * 15) + 15;
                agilidad = (int) (Math.random() * 10) + 20;
                defensa = (int) (Math.random() * 10) + 5;
                critico = 7;
                PuntosVida = (int) (Math.random() * 50) + 80;
                break;
            case 3:      //desierto
                fuerza = (int) (Math.random() * 15) + 20;
                destreza = (int) (Math.random() * 5);
                agilidad = (int) (Math.random() * 10);
                defensa = (int) (Math.random() * 10) + 5;
                critico = 2;
                PuntosVida = (int) (Math.random() * 60) + 140;
                break;
            case 4:      //mar
                fuerza = (int) (Math.random() * 10) + 15;
                destreza = (int) (Math.random() * 5) + 15;
                agilidad = (int) (Math.random() * 5) + 15;
                defensa = (int) (Math.random() * 10) + 5;
                critico = 10;
                PuntosVida = (int) (Math.random() * 40) + 70;
                break;
        }
    }

    public void subirNivel() {
        int fuerzaMas = 0;
        int destrezaMas = 0;
        int agilidadMas = 0;
        int defensaMas = 0;
        int criticoMas = 0;
        int PuntosVidaMas = 0;
        int fuerzaT = 0, destrezaT = 0, agilidadT = 0, defensaT = 0, criticoT = 0, PuntosVidaT = 0;
        if (ExpPj >= ExpSiguienteNivel) {
            nivelPj++;
            if (ExpPj > ExpSiguienteNivel) {
                int i = ExpPj - ExpSiguienteNivel;
                ExpPj = i;
            }

            switch (clase) {
                case 1:
                    fuerzaMas = (int) (Math.random() * 4) + 2;
                    destrezaMas = (int) (Math.random() * 2) + 1;
                    agilidadMas = (int) (Math.random() * 2) + 1;
                    defensaMas = (int) (Math.random() * 3) + 3;
                    criticoMas = 2;
                    PuntosVidaMas = (int) (Math.random() * 10) + 20;
                    fuerzaT = fuerza;
                    destrezaT = destreza;
                    agilidadT = agilidad;
                    defensaT = defensa;
                    criticoT = critico;
                    PuntosVidaT = PuntosVida;
                    fuerza = fuerza + fuerzaMas;
                    destreza = destreza + destrezaMas;
                    agilidad = agilidad + agilidadMas;
                    defensa = defensa + defensaMas;
                    critico = critico + 2;
                    PuntosVida = PuntosVida + PuntosVidaMas;
                    break;
                case 2:
                    fuerzaMas = (int) (Math.random() * 3) + 2;
                    destrezaMas = (int) (Math.random() * 5) + 2;
                    agilidadMas = (int) (Math.random() * 5) + 3;
                    defensaMas = (int) (Math.random() * 2) + 1;
                    criticoMas = 2;
                    PuntosVidaMas = (int) (Math.random() * 8) + 10;
                    fuerza = fuerza + fuerzaMas;
                    destreza = destreza + destrezaMas;
                    agilidad = agilidad + agilidadMas;
                    defensa = defensa + defensaMas;
                    critico = critico + criticoMas;
                    PuntosVida = PuntosVida + PuntosVidaMas;
                    break;
                case 3:
                    fuerzaMas = (int) (Math.random() * 6) + 3;
                    destrezaMas = (int) (Math.random() * 1) + 1;
                    agilidadMas = (int) (Math.random() * 2);
                    defensaMas = (int) (Math.random() * 3) + 4;
                    criticoMas = 2;
                    PuntosVidaMas = (int) (Math.random() * 60) + 140;
                    fuerza = fuerza + fuerzaMas;
                    destreza = destreza + destrezaMas;
                    agilidad = agilidad + agilidadMas;
                    defensa = defensa + defensaMas;
                    critico = critico + criticoMas;
                    PuntosVida = PuntosVida + PuntosVidaMas;
                    break;
                case 4:
                    fuerzaMas = (int) (Math.random() * 4) + 2;
                    destrezaMas = (int) (Math.random() * 2) + 1;
                    agilidadMas = (int) (Math.random() * 2) + 1;
                    defensaMas = (int) (Math.random() * 3) + 3;
                    criticoMas = 2;
                    PuntosVidaMas = (int) (Math.random() * 10) + 20;
                    fuerza = fuerza + fuerzaMas;
                    destreza = destreza + destrezaMas;
                    agilidad = agilidad + agilidadMas;
                    defensa = defensa + defensaMas;
                    critico = critico + criticoMas;
                    PuntosVida = PuntosVida + PuntosVidaMas;
                    break;
            }
            System.out.println(nombre + " ha subido de nivel!!! a nivel: " + nivelPj
                    + "\t Nombre: " + nombre
                    + "\t Puntos de salud: " + PuntosVida + "=" + PuntosVidaMas + "+" + PuntosVidaT
                    + "\t Fuerza: " + fuerza + "=" + fuerzaMas + "+" + fuerzaT
                    + "\t Destreza: " + destreza + "=" + destrezaMas + "+" + destrezaT
                    + "\t Agilidad: " + agilidad + "=" + agilidadMas + "+" + agilidadT
                    + "\t Defensa: " + defensa + "=" + defensaMas + "+" + defensaT
                    + "\t Critico: " + critico);

            ExpSiguienteNivel = (ExpSiguienteNivel * 2);
            if (ExpPj >= ExpSiguienteNivel) {
                subirNivel();
            }

        }
    }

}
