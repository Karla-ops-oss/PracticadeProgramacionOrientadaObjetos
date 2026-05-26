package poo.pagina47.ejercicio3;

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
