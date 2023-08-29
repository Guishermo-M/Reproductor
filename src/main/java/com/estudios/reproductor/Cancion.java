/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudios.reproductor;

/**
 *
 * @author PaEstudiar
 */
import java.util.Scanner;

public class Cancion {
    Scanner scanner = new Scanner(System.in);
    private String nombre;
    private String artista;
    private int duracion;
    private Boolean esFavorita;
    private Boolean esDescargada;    
      
    public Cancion(String nombre, String artista, int duracion, Boolean esFavorita, Boolean esDescargada) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.esFavorita = esFavorita;
        this.esDescargada = esDescargada;
    }

    public Cancion() {
//        System.out.println("nombre:");
//        String nombre = scanner.nextLine();
//        System.out.println("artista:");
//        String artista = scanner.nextLine();
//        System.out.println("duracion en segundos:");
//        int duracion = scanner.nextInt();
//        System.out.println("es Favorita?:");
//        Boolean esFavorita = scanner.nextBoolean();
//        System.out.println("es Descargada?:");
//        Boolean esDescargada = scanner.nextBoolean();
//        this.nombre = nombre;
//        this.artista = artista;
//        this.duracion = duracion;
//        this.esFavorita = esFavorita;
//        this.esDescargada = esDescargada;
    }

    public String getNombre() {
       System.out.println(nombre);
       return nombre;        
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public Boolean getEsFavorita() {
        return esFavorita;
    }

    public Boolean getEsDescargada() {
        return esDescargada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setEsFavorita(Boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    public void setEsDescargada(Boolean esDescargada) {
        this.esDescargada = esDescargada;
    }
    
    public void adelantarCancion() {
        int segActual = scanner.nextInt();
        int segAdelantado = scanner.nextInt();
        
    if (segActual < duracion && segActual + segAdelantado < duracion && segAdelantado < duracion) {
        int minutosAdelantados = segAdelantado / 60;
        int segundosAdelantados = segAdelantado % 60;

        System.out.println("Estabas en el minuto: " + (segActual / 60) + " minuto(s) y " + (segActual % 60) + " segundo(s).");
        System.out.println("Te adelantaste " + minutosAdelantados + " minuto(s) y " + segundosAdelantados + " segundo(s).");
        System.out.println("Terminaste en el minuto: " + ((segActual + segAdelantado) / 60) + " minuto(s) y " + ((segActual + segAdelantado) % 60) + " segundo(s).");
    } else {
        System.out.println("Error: Los valores proporcionados no cumplen con las restricciones.");
    }
    }
    
    public void esLarga(){
    if (this.duracion >= 300) {
        System.out.println("La cancion es Larga");
    } else if (this.duracion < 300 && this.duracion >0) {
        System.out.println("La cancion es Normal.");
    } else {
        System.out.println("La cancion no dura nada.");
    }
}

    @Override
    public String toString() {
        return "\nCancion:\n" + "Nombre: " + nombre + "\nArtista: " + artista + "\nDuracion:" + (duracion/60) + "m" + (duracion%60) + "s";
    }
    
    
}
