package poo.pagina40.ejercicio2;

class Pregunta {
    private String enunciado;
    private String respuestaCorrecta;
    private int puntosGanados;
    private int puntosPerdidos;


    public Pregunta(String enunciado, String respuestaCorrecta, int puntosGanados, int puntosPerdidos) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
        this.puntosGanados = puntosGanados;
        this.puntosPerdidos = puntosPerdidos;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public int getPuntosGanados() {
        return puntosGanados;
    }

    public int getPuntosPerdidos() {
        return puntosPerdidos;
    }

    public boolean verificarRespuesta(String respuestaUsuario) {
        return this.respuestaCorrecta.equalsIgnoreCase(respuestaUsuario.trim());
    }
}
