package com.quiz1.App;

import com.quiz1.domain.DispensadorDeAgua;

public class AppDispensador {
    public static void main(String[] args) {
        DispensadorDeAgua dispensador = new DispensadorDeAgua(12345, "Kalley", 10);

        System.out.println("marca del dispensador "+ dispensador.marca);

        dispensador.mostrarNivel();
        dispensador.calentar(30);
        dispensador.servir(false, 1);
        dispensador.servir(true, 0.4);
        dispensador.servir(false, 9);
        dispensador.mostrarNivel();
        dispensador.calentar(50);
        dispensador.servir(true, 0.8);
        dispensador.enfriar(65);
        dispensador.servir(true, 0.7);
        dispensador.vaciar();
        dispensador.mostrarNivel();
        dispensador.llenar();
        dispensador.mostrarNivel();

    }
}
