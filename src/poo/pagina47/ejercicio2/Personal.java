package poo.pagina47.ejercicio2;

abstract class Personal {
    protected String nombre;
    protected double pagoPorHora;
    protected int horasTrabajadas;

    public abstract void registrar();

    public abstract void calcularSueldo();
}
