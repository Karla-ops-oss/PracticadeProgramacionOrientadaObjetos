package poo.pagina43.ejercicio1;


public class SeleccionFutbol {

    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }


    public void concentrarse() {
        System.out.println(nombre + " " + apellidos + " se está concentrando.");
    }

    public void viajar() {
        System.out.println(nombre + " " + apellidos + " está viajando con el equipo.");
    }
}