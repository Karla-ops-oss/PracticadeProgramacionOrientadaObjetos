package com.animales.app;

public class Main {
    public static void main(String[] args) {
        // 1. Crear un objeto de la clase Animal usando el constructor
        Animal miAnimal = new Animal("León", "Carnívoro", 4);

        System.out.println("--- Información del Animal Inicial ---");
        System.out.println("Nombre: " + miAnimal.getNombre());
        System.out.println("Orden: " + miAnimal.getOrden());
        System.out.println("Extremidades: " + miAnimal.getExtremidades());

        System.out.println("\n--- Modificando datos con Setters ---");
        miAnimal.setNombre("Águila Real");
        miAnimal.setOrden("Accipitriformes");
        miAnimal.setExtremidades(2);

        System.out.println("Nuevo Nombre: " + miAnimal.getNombre());
        System.out.println("Nuevo Orden: " + miAnimal.getOrden());
        System.out.println("Nuevas Extremidades: " + miAnimal.getExtremidades());
    }
}
