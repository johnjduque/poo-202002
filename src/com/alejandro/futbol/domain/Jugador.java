package com.alejandro.futbol.domain;

public class Jugador {
    public String nombre;
    public byte edad;
    public byte nroCamiseta;
    public String posicion;

    public Jugador(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }
}