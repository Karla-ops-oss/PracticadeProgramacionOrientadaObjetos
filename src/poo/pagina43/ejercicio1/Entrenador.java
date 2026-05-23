package poo.pagina43.ejercicio1;

class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(nombre + " está dirigiendo el partido desde el banquillo.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " está dirigiendo la sesión de entrenamiento.");
    }
}
