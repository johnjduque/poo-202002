package com.alejandro.futbol.domain;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeFutbol {
    public String nombre;
    public String pais;
    public short anioFundacion;
    public short nroTitulos;
    public List<Jugador> jugadores;

    public void entrenar(String lugar) {
        System.out.println(nombre + " está entrenando en " + lugar);
    }

    public boolean jugarPartido(String lugar, EquipoDeFutbol contrario) {
        System.out.println(this.nombre + " está jugando en " + lugar + " contra " + contrario.nombre);
        return true;
    }

    public Jugador comprarJugador(Jugador jugador, int precio) {
        jugadores.add(jugador);
        return jugador;
    }

    public void venderJugador(Jugador jugador, int precio, EquipoDeFutbol destino) {
        this.jugadores.remove(jugador);
        destino.jugadores.add(jugador);
    }

    public void mostrarDelanteros() {
        jugadores.forEach(jugador -> {
            if (jugador.posicion.equalsIgnoreCase("Delantero")) {
                System.out.println(jugador.nombre);
            }
        });
    }

    public void prestarJugador(Jugador jugador, long precio, EquipoDeFutbol destino, byte tiempoDePrestamo, String opcionDeCompra){
        this.jugadores.remove(jugador);
        destino.jugadores.add(jugador);
    }

    public void cederJugador(Jugador jugador, EquipoDeFutbol destino,byte tiempoDePrestamo){
        this.jugadores.remove(jugador);
        destino.jugadores.add(jugador);
    }

    public void formarLaTitular(ArrayList<Jugador> jugadoresTitulares){
        jugadoresTitulares.forEach(jugador -> {
            System.out.println(nombre + " presenta su lista de titulares " + jugador.nombre);
        });

    }

}
