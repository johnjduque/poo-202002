package com.quiz1.domain;

public class DispensadorDeAgua {
    public long serial;
    public String marca;
    public double cantidadMaxima;
    public double cantidadaActual;
    public double temperatura;

    public DispensadorDeAgua(long serial){
        this.serial = serial;
    }

    public DispensadorDeAgua(long serial, String marca, double cantidadMaxima) {
        this(serial);
        this.marca = marca;
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadaActual = this.cantidadMaxima;
    }

    public boolean servir(boolean caliente, double cantidadAServir){
        if ((cantidadaActual - cantidadAServir) >= 0){
            cantidadaActual -= cantidadAServir;

            if (caliente){
                System.out.println("se sirvió agua caliente a "+ temperatura + " °C");
            }
            else {
                System.out.println("se sirvió agua al clima");
            }
            return true;
        }
        else {
            return false;
        }
    }

    public void llenar(){
        this.cantidadaActual = this.cantidadMaxima;
    }

    public void vaciar(){
        this.cantidadaActual = 0;
    }

    public boolean calentar(double grados){
        if ((this.temperatura + grados) >= 100){
            return false;
        }
        else{
            this.temperatura += grados;
            return true;
        }
    }

    public void enfriar(double grados){
        this.temperatura -= grados;
    }

    public void mostrarNivel(){
        System.out.println("el dispensador tiene "+ this.cantidadaActual + " litros");
    }

}
