package com.example;

public class CuentaBancaria {

    //Atributos privados

    private String titular;
    private double saldo;

    //Requerimientos:

    

    public CuentaBancaria(String titular, double saldoInicial) { // Constructor que recibe el titular y el saldo inicial
        this.titular = titular;
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial; // Control de acceso para evitar saldos negativos al crear la cuenta
        }
    }

    
    public String getTitular() { // Getter para el titular
        return titular;
    } 

    public double getSaldo() { // Getter para el saldo
        return saldo;
    } 

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double cantidad) { // Método para depositar dinero
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser positiva."); // Control de acceso para evitar cantidades negativas
        }
    }

    public void retirar(double cantidad) { // Método para retirar dinero
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
            } else {
                System.out.println("Fondos insuficientes para retirar esa cantidad."); // Control de acceso para evitar sobregiros
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva."); // Control de acceso para evitar cantidades negativas
        }
    }



}
