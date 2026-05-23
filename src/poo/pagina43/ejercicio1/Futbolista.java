package poo.pagina43.ejercicio1;

public class Futbolista extends  SeleccionFutbol{

    private int dorsal;
    private String demarcacion;

    // Constructor que invoca al de la superclase usando 'super'
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    // Métodos específicos
    public void jugarPartido() {
        System.out.println(nombre + " está jugando el partido como " + demarcacion + ".");
    }

    public void entrenar() {
        System.out.println(nombre + " está entrenando en la cancha.");
    }
}
