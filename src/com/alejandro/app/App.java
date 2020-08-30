package com.alejandro.app;

import com.alejandro.domain.Banco;
import com.alejandro.domain.CuentaBancaria;
import com.alejandro.domain.Persona;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Persona alejandro = new Persona(1234, "alejandro", 'M', 321456, "j@uco" );
        
        Banco banco1 = new Banco("Bancolombia");
        
        alejandro.nombre = "Alejandro Ramírez";

        CuentaBancaria cuentaDeAlejo = new CuentaBancaria(banco1, "12345", alejandro, 100000, 'A',new Date());
        CuentaBancaria otraCuenta = new CuentaBancaria(banco1, "1256", alejandro, 50000, 'C', new Date());

        cuentaDeAlejo.tipoCuenta = 'A';
        cuentaDeAlejo.numero = "1235";
        cuentaDeAlejo.propietario = alejandro;

        otraCuenta.tipoCuenta = 'A';
        otraCuenta.numero = "9876";
        otraCuenta.propietario = alejandro;

        System.out.println("El propietario de la cuenta " + cuentaDeAlejo.numero + " es "
                            + cuentaDeAlejo.propietario.nombre);

        System.out.println("El saldo antes de consignar es " + cuentaDeAlejo.saldo);
        cuentaDeAlejo.consignar(300000);
        System.out.println("El saldo después de consignar es " + cuentaDeAlejo.saldo);
        cuentaDeAlejo.retirar(120000);
        System.out.println("El saldo después de retirar es " + cuentaDeAlejo.saldo);

        cuentaDeAlejo.transferir(otraCuenta, 80000);
        System.out.println("El saldo después de transferir de mi cuenta es " + cuentaDeAlejo.saldo);
        System.out.println("El saldo después de transferir de otra cuenta es " + otraCuenta.saldo);

    }
}
