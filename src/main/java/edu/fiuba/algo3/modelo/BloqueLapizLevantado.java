package edu.fiuba.algo3.modelo;

public class BloqueLapizLevantado implements Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.levantarLapiz();
    }
}