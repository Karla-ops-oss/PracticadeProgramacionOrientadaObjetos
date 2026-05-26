package poo.pagina47.ejercicio1;

public class Ejercicio1PolimorfismoVehículo {
    public static void main(String[] args) {
        System.out.println("--- Demostración de Polimorfismo ---");

        Vehiculo[] misVehiculos = new Vehiculo[3];
        misVehiculos[0] = new Automovil();
        misVehiculos[1] = new Barco();
        misVehiculos[2] = new Avion();

        for (Vehiculo v : misVehiculos) {
            v.moverse();
        }
    }
}

