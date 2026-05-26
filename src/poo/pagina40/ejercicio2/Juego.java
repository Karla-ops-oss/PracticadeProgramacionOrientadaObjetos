package poo.pagina40.ejercicio2;

import java.util.Scanner;

class Juego {
    private int puntajeAcumulado;
    private Scanner teclado;

    public Juego() {
        this.puntajeAcumulado = 0;
        this.teclado = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("=== ¡BIENVENIDO AL JUEGO DE PREGUNTAS! ===");


        jugarNivel1();

        System.out.println("\n-------------------------------------------");
        System.out.println("¡Avanzando al NIVEL 2!");
        System.out.println("-------------------------------------------");

        jugarNivel2();

        System.out.println("\n===========================================");
        System.out.println("¡JUEGO TERMINADO!");
        System.out.println("PUNTAJE TOTAL ACUMULADO (Nivel 1 + Nivel 2): " + puntajeAcumulado + " puntos.");
        System.out.println("===========================================");
    }

    private void jugarNivel1() {
        System.out.println("\n--- NIVEL 1 ---");

        Pregunta[] preguntasNivel1 = {
                new Pregunta("¿Cuál es el río más largo del mundo? (Amazonas / Nilo)", "Amazonas", 10, -5),
                new Pregunta("¿Cuánto es 5 + 7?", "12", 10, -5)
        };

        procesarNivel(preguntasNivel1);
    }

    private void jugarNivel2() {
        System.out.println("\n--- NIVEL 2 (Cada acierto +20, cada error -10) ---");

        Pregunta[] preguntasNivel2 = {
                new Pregunta("1. ¿Cuál es el océano más grande del mundo?", "Pacifico", 20, -10),
                new Pregunta("2. ¿Qué país tiene forma de bota?", "Italia", 20, -10),
                new Pregunta("3. ¿Cuál es el tercer planeta del sistema solar?", "Tierra", 20, -10),
                new Pregunta("4. ¿Qué idioma se habla principalmente en Brasil?", "Portugues", 20, -10)
        };

        procesarNivel(preguntasNivel2);
    }

    private void procesarNivel(Pregunta[] preguntas) {
        for (Pregunta p : preguntas) {
            System.out.println("\n" + p.getEnunciado());
            System.out.print("Tu respuesta: ");
            String respuesta = teclado.nextLine();

            if (p.verificarRespuesta(respuesta)) {
                System.out.println("¡CORRECTO! (+" + p.getPuntosGanados() + " puntos)");
                puntajeAcumulado += p.getPuntosGanados();
            } else {
                System.out.println("INCORRECTO. (" + p.getPuntosPerdidos() + " puntos)");
                puntajeAcumulado += p.getPuntosPerdidos();
            }
            System.out.println("Puntaje actual: " + puntajeAcumulado);
        }
    }
}
