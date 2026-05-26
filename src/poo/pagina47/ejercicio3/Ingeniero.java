package poo.pagina47.ejercicio3;

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
