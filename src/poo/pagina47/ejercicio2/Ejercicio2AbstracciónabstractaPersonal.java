package poo.pagina47.ejercicio2;
import java.util.Scanner;

public class Ejercicio2AbstracciónabstractaPersonal {
    public static void main(String[] args) {
        System.out.println("--- Gestión de Personal (Abstracción) ---");

        Empleado emp = new Empleado();
        emp.registrar();
        emp.calcularSueldo();
    }
}

abstract class Personal {
    protected String nombre;
    protected double pagoPorHora;
    protected int horasTrabajadas;

    public abstract void registrar();
    public abstract void calcularSueldo();
}

class Empleado extends Personal {
    private Scanner entrada = new Scanner(System.in);

    @Override
    public void registrar() {
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese el pago por hora: ");
        pagoPorHora = entrada.nextDouble();
        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();
        System.out.println("¡Personal registrado exitosamente!");
    }

    @Override
    public void calcularSueldo() {
        double sueldoTotal = pagoPorHora * horasTrabajadas;
        System.out.println("\n--- Recibo de Pago ---");
        System.out.println("Empleado: " + nombre);
        System.out.println("Sueldo Total a recibir: $" + sueldoTotal);
    }
}
