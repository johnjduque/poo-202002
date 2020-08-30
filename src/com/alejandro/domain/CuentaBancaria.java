package com.alejandro.domain;

import java.util.Date;

public class CuentaBancaria {
    public Banco banco;
    public String numero;
    public Persona propietario;
    public float saldo;
    public char tipoCuenta; // A ó C
    public Date fechaDeCreacion;

    public CuentaBancaria(Banco banco, String numero, Persona propietario, float saldo, char tipoCuenta, Date fechaDeCreacion) {
        this.banco = banco;
        this.numero = numero;
        this.propietario = propietario;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        this.fechaDeCreacion = new Date();
    }

    public boolean retirar(float valorARetirar) {
        if (saldo > valorARetirar) {
            saldo -= valorARetirar;
            return true;
        } else {
            return false;
        }
    }

    public void consignar(float valorAConsignar) {
        saldo += valorAConsignar;
    }

    public String obtenerDescripcionDeTipo() {
        String descripcion = null;

        switch (tipoCuenta) {
            case 'A' :
                descripcion = "Ahorros";
                break;
            case 'C':
                descripcion = "Corriente";
                break;
            default:
                descripcion = "Ninguna";
                break;
        }

        return descripcion;
    }

    public boolean transferir(CuentaBancaria cuentaDestino, float valorATransferir) {
        if (saldo > valorATransferir) {
            this.retirar(valorATransferir);
            cuentaDestino.consignar(valorATransferir);
            return true;
        } else {
            return false;
        }
    }
}
