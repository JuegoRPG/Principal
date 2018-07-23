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
public class Mapa {
    /**
     * Contantes para crear la zona y limitar las zonas que se crean en el mapeado de la partida
     */
    String zona;
    double cantidadZonas=0;
    /**
     * Metodo para crar zonas de forma aleatoria hasta un limite en este caso 10 zonas aleatorias
     */
    public void crearZona(){
        String zona;
        int aleatorio;
        aleatorio = (int) (Math.random() * 5 + 1);//Deberia escoger entre 1 y 5 para crear 10 zonas distintas
        if (cantidadZonas > 10){//Limitador de zonas a crear
        switch(aleatorio){
             case 1:
                zona = "Desertico";
                System.out.println(zona);
                break;
             case 2:
                zona = "Boscosa";
                System.out.println(zona);
                break;
             case 3:
                zona = "Acuatica";
                System.out.println(zona);
                break;
             case 4:
                zona = "Montañosa";
                System.out.println(zona);
                break;
             case 5:
                zona = "Praderas";
                System.out.println(zona);
                break;
        }
        cantidadZonas++;//Contador de las zonas en aumento para salir del if
        }else{
            System.out.println("No se pueden crear mas zonas");
        }
    }
}
