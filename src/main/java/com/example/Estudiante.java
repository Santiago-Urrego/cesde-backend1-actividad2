package com.example;

public class Estudiante { // Clase Estudiante con atributos privados y métodos públicos

    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante() { // Constructor sin parámetros que asigna valores por defecto
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.promedio = 0.0;
    }

    
    public Estudiante(String nombre, int edad, double promedio) { // Constructor que recibe parámetros para inicializar los atributos
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }


    public String getNombre() { // Getter para el nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Setter para el nombre
        this.nombre = nombre;
    }

    public int getEdad() { // Getter para la edad
        return edad;
    }

    public void setEdad(int edad) { // Setter para la edad con control de acceso para evitar edades negativas
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor a 0");
        }
    }

    public double getPromedio() { // Getter para el promedio
        return promedio;
    }

    public void setPromedio(double promedio) { // Setter para el promedio con control de acceso para evitar promedios fuera del rango 0.0 - 5.0
        this.promedio = promedio;
    }

    public boolean haAprobado() { // Método para determinar si el estudiante ha aprobado o no, considerando un promedio de 3.0 como mínimo para aprobar
        return promedio >= 3.0;
    }



    public void mostrarInfo() { // Método para mostrar la información del estudiante, incluyendo su estado de aprobación
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (haAprobado()) { // Control de acceso para mostrar el estado de aprobación
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}
