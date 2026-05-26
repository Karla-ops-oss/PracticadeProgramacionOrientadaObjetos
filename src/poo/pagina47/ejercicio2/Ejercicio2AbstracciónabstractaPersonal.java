package poo.pagina47.ejercicio2;

public class Ejercicio2AbstracciónabstractaPersonal {
    public static void main(String[] args) {
        System.out.println("--- Gestión de Personal (Abstracción) ---");

        Empleado emp = new Empleado();
        emp.registrar();
        emp.calcularSueldo();
    }
}

