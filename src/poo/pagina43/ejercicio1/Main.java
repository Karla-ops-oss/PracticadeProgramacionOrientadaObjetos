package poo.pagina43.ejercicio1;

public class Main {
    public static void main(String[] args) {

        Futbolista jugador = new Futbolista(1, "Lionel", "Messi", 36, 10, "Delantero");
        Entrenador tecnico = new Entrenador(2, "Lionel", "Scaloni", 45, "AFA-9921");
        Masajista fisio = new Masajista(3, "Juan", "Pérez", 50, "Lic. Fisioterapia", 15);

        System.out.println("--- Acciones Comunes (Herencia) ---");
        jugador.concentrarse();
        tecnico.viajar();
        fisio.concentrarse();

        System.out.println("\n--- Acciones Específicas de cada Clase ---");

        jugador.jugarPartido();
        tecnico.dirigirEntrenamiento();
        fisio.darMasaje();
    }
}
