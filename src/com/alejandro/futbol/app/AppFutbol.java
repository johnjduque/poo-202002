package com.alejandro.futbol.app;

import com.alejandro.futbol.domain.EquipoDeFutbol;
import com.alejandro.futbol.domain.Jugador;

import java.util.ArrayList;
import java.util.Arrays;

public class AppFutbol {
    public static void main(String[] args) {
        Jugador duque = new Jugador("Jefferson Duque", "Delantero");

        Jugador aristi = new Jugador("Victor Aristizabal", "DELANTERO");

        Jugador mac = new Jugador("Macnelly Torres", "Creativo");

        Jugador cardona = new Jugador("chicho serna", "Creativo");

        EquipoDeFutbol nacional = new EquipoDeFutbol();
        nacional.nombre = "Atl. Nacional";
        nacional.jugadores = new ArrayList<>(Arrays.asList(duque, mac, aristi));

        EquipoDeFutbol boca = new EquipoDeFutbol();
        boca.nombre = "Boca Juniors";
        boca.jugadores = new ArrayList<>();

        nacional.entrenar("Guarne");
        boca.jugarPartido("Miami", nacional);

        System.out.println("Boca antes de comprar: " + boca.jugadores.size());
        boca.comprarJugador(cardona, 5000000);
        nacional.venderJugador(duque, 8000000, boca);

        System.out.println("Boca después de comprar: " + boca.jugadores.size());

        nacional.mostrarDelanteros();

        Jugador quintana = new Jugador("Quintana", "Portero");

        Jugador henriquez = new Jugador("Charales", "Defensa central");

        nacional.nombre = "Atl. Nacional";
        ArrayList<Jugador> jugadoresTitulares = new ArrayList<>(Arrays.asList(quintana, henriquez));
        nacional.formarLaTitular(jugadoresTitulares);
    }
}
