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
public class Zona {
    String tipoZona;
    double cantidadZonas=0;
    int tamanho;
    String tipoRecursos;
    int recursos;
    int nivelZona;
    /**
     * Metodo para crar zonas de forma aleatoria hasta un limite (en este caso 10 zonas aleatorias)
     */
    public void crearZona(){
      int aleatorio;
       aleatorio = (int) (Math.random() * 5 + 1);//Deberia escoger entre 1 y 5 para crear 10 zonas distintas
        if (cantidadZonas > 10){//Limitador de zonas a crear
        switch(aleatorio){
             case 1:
                tipoZona = "Desertico";
                System.out.println(tipoZona);
                tamanho = (int) (Math.random() * 50 + 1);//Tamaño de la zona crearla en metros
                nivelZona = (int) (Math.random() * 20 + 1);//Genera el nivel de la zona
                break;
             case 2:
                tipoZona = "Boscosa";
                System.out.println(tipoZona);
                tamanho = (int) (Math.random() * 50 + 1);//Tamaño de la zona crearla en metros
                nivelZona = (int) (Math.random() * 20 + 1);//Genera el nivel de la zona
                break;
             case 3:
                tipoZona = "Acuatica";
                System.out.println(tipoZona);
                tamanho = (int) (Math.random() * 50 + 1);//Tamaño de la zona crearla en metros
                nivelZona = (int) (Math.random() * 20 + 1);//Genera el nivel de la zona
                break;
             case 4:
                tipoZona = "Montañosa";
                System.out.println(tipoZona);
                tamanho = (int) (Math.random() * 50 + 1);//Tamaño de la zona crearla en metros
                nivelZona = (int) (Math.random() * 20 + 1);//Genera el nivel de la zona
                break;
             case 5:
                tipoZona = "Praderas";
                System.out.println(tipoZona);
                tamanho = (int) (Math.random() * 50 + 1);//Tamaño de la zona crearla en metros
                nivelZona = (int) (Math.random() * 20 + 1);//Genera el nivel de la zona
                break;
        }
        cantidadZonas++;//Contador de las zonas en aumento para salir del if
        }else{
            System.out.println("No se pueden crear mas zonas");
        }
    }
    /**
     * Metodo para crear los recuros de la zona distingiendo por tipo de zona para tener distintos
     * tipos de recursos en cada una de ellas.
     * @param tipoZona pasar el tipo de zona que se crea en el metodo anterior si se puede.
     */
    public void crearRecursos(String tipoZona){
    int recursos;
    String tipoRecursos;
    
    if(tipoZona == "Desertico"){
    recursos = (int) (Math.random() * 10 + 1);//Crea recursos de forma aleatoria
    tipoRecursos = "Diamantes";//Tipo de recurso que se creara en la zona (Añadir mas tipos)
    }else if(tipoZona == "Boscosa"){
     recursos = (int) (Math.random() * 100 + 1);//Crea recursos de forma aleatoria
     tipoRecursos = "Madera";//Tipo de recurso que se creara en la zona (Añadir mas tipos)
    }else if(tipoZona == "Acuatica"){
     recursos = (int) (Math.random() * 30 + 1);//Crea recursos de forma aleatoria
     tipoRecursos = "Petroleo";//Tipo de recurso que se creara en la zona (Añadir mas tipos)
    }else if(tipoZona == "Montañosa"){
     recursos = (int) (Math.random() * 50 + 1);//Crea recursos de forma aleatoria
     tipoRecursos = "Cobre";//Tipo de recurso que se creara en la zona (Añadir mas tipos)
    }else if(tipoZona == "Praderas"){
     recursos = (int) (Math.random() * 75 + 1);//Crea recursos de forma aleatoria
     tipoRecursos = "Aloe Vera";//Tipo de recurso que se creara en la zona (Añadir mas tipos)
    }
    }
}
