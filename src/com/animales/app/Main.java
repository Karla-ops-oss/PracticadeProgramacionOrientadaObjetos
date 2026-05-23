package com.animales.app;

public class Main {
    public static void main(String[] args) {
        // 1. Crear un objeto de la clase Animal usando el constructor
        Animal miAnimal = new Animal("León", "Carnívoro", 4);

        // 2. Mostrar la información inicial usando los métodos Getters
        System.out.println("--- Información del Animal Inicial ---");
        System.out.println("Nombre: " + miAnimal.getNombre());
        System.out.println("Orden: " + miAnimal.getOrden());
        System.out.println("Extremidades: " + miAnimal.getExtremidades());

        System.out.println("\n--- Modificando datos con Setters ---");
        // 3. Modificar las propiedades usando los métodos Setters
        miAnimal.setNombre("Águila Real");
        miAnimal.setOrden("Accipitriformes");
        miAnimal.setExtremidades(2);

        // 4. Mostrar los datos actualizados
        System.out.println("Nuevo Nombre: " + miAnimal.getNombre());
        System.out.println("Nuevo Orden: " + miAnimal.getOrden());
        System.out.println("Nuevas Extremidades: " + miAnimal.getExtremidades());
    }
}
