package com.tiendamascota;

import java.util.ArrayList;

public class Mascota {
    public String nombre;
    public list<Juguete> juguetes;
    public list<Comida> comidas;
    public Collar collar;
    public Persona persona;
    public Veterinario veterinario;

    public Mascota(Collar collar, Persona persona, Veterinario veterinario) {
        this.collar = collar;
        this.persona = persona;
        this.veterinario = veterinario;
    }

    public Mascota (){
        this.juguetes = new ArrayList<>();
        this.comidas = new ArrayList<>();
    }
}
