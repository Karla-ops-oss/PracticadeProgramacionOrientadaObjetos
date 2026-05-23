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

    interface Profesion {
        // Por defecto, todos los métodos en una interfaz son public y abstract
        void calcularSueldo();
    }

    class Ingeniero implements Profesion {
        private int horas;
        private double tarifa;

        public Ingeniero(int horas, double tarifa) {
            this.horas = horas;
            this.tarifa = tarifa;
        }

        @Override
        public void calcularSueldo() {
            double sueldo = horas * tarifa;
            System.out.println("Sueldo calculado por horas de desarrollo/proyecto: $" + sueldo);
        }
    }

    class Medico implements Profesion {
        private int horas;
        private double tarifa;
        private double bonoEspecial;

        public Medico(int horas, double tarifa, double bonoEspecial) {
            this.horas = horas;
            this.tarifa = tarifa;
            this.bonoEspecial = bonoEspecial;
        }

        @Override
        public void calcularSueldo() {
            double sueldo = (horas * tarifa) + bonoEspecial;
            System.out.println("Sueldo calculado (Base + Bono por turnos/riesgo): $" + sueldo);
        }
    }