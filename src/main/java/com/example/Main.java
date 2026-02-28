package com.example;

public class Main {
    public static void main(String[] args) {
Libro l1 = new Libro(); 
l1.mostrarDetalles(); // Salida esperada con valores por defecto

Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
l2.mostrarDetalles();

Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
l3.mostrarDetalles();

Libro l4 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);
l4.mostrarDetalles();


Libro l5 = new Libro("Cyberpunk 2077: No hay coincidencias", "Rafal Kosik", 432);
l5.mostrarDetalles();

System.out.println("_____________");


CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
cuenta.depositar(200);
System.out.println("Saldo actual: " + cuenta.getSaldo());
cuenta.retirar(1000);

CuentaBancaria cuenta2 = new CuentaBancaria("Carlos", -100);
System.out.println("Titular: " + cuenta2.getTitular());




System.out.println("_____________");

Estudiante e = new Estudiante("Pedro", 21, 2.5);
e.mostrarInfo();

Estudiante e2 = new Estudiante();
e2.mostrarInfo();

Estudiante e3 = new Estudiante("Ana", 19, 3.5);
e3.mostrarInfo();


    }
}