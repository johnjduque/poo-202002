package com.alejandro.domain;

public class Persona {
    public long identificacion;
    public String nombre;
    public char genero;
    public long celular;
    public String email;

    public Persona(long identificacion, String nombre, char genero, long celular, String email) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.genero = genero;
        this.celular = celular;
        this.email = email;
    }
}
