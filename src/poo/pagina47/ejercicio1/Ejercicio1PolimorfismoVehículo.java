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

class Vehiculo {
    public void moverse() {
        System.out.println("El vehículo se está moviendo de forma general.");
    }
}

class Automovil extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El automóvil avanza sobre ruedas por la carretera: ¡Brum brum!");
    }
}

class Barco extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El barco navega cruzando las olas del mar: ¡Flashh!");
    }
}

class Avion extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El avión vuela por los aires rompiendo las nubes: ¡Fiuuu!");
    }
}
