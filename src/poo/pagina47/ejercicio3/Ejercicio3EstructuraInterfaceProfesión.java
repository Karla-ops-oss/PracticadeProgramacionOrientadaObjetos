package poo.pagina47.ejercicio3;

public class Ejercicio3EstructuraInterfaceProfesión {
        public static void main(String[] args) {
            System.out.println("--- Sistema de Profesiones (Interfaces) ---");

            Profesion ing = new Ingeniero(160, 25.0); // 160 horas a $25 la hora
            Profesion med = new Medico(120, 40.0, 500.0); // 120 horas a $40 + bono de riesgo

            System.out.print("Ingeniero -> ");
            ing.calcularSueldo();

            System.out.print("Médico    -> ");
            med.calcularSueldo();
        }
    }

