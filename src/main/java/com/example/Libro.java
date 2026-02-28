package com.example;

public class Libro { // Clase Libro con atributos privados y métodos públicos

    private String titulo;
    private String autor; 
    private int paginas;

    public Libro() { // Constructor sin parámetros
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.paginas = 0;
    }

    public Libro(String titulo, String autor) { // Constructor con título y autor
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }

    public Libro(String titulo, String autor, int paginas) { // Constructor con todos los parámetros
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarDetalles() { // Método para mostrar los detalles del libro
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + paginas);
    }

}
