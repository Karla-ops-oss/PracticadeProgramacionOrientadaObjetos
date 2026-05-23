package poo.pagina40.ejercicio1;

class Animal {

    private String nombre;
    private String orden;
    private int extremidades;


    public Animal(String nombre, String orden, int extremidades) {
        this.nombre = nombre;
        this.orden = orden;
        this.extremidades = extremidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Orden
    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {

        if (extremidades >= 0) {
            this.extremidades = extremidades;
        } else {
            System.out.println("Error: Las extremidades no pueden ser negativas.");
        }
    }
}
