/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estudios.reproductor;

/**
 *
 * @author PaEstudiar
 */
public class Reproductor {

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("nombre1","artista1",500,true,true);
        Cancion cancion2 = new Cancion();
        System.out.println(cancion1.toString());
        System.out.println(cancion2.toString());
//        cancion2.setArtista("artista2");
//        cancion2.setNombre("nombre2");
//        cancion2.setDuracion(250);
//        cancion2.esLarga();
//        cancion1.getNombre();
//        cancion1.getDuracion();
//        cancion2.adelantarCancion(20, 40);
    }
}
