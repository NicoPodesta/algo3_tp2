package edu.fiuba.algo3.modelo;

public class BloqueArriba implements Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.moverHaciaArriba();
    }

    @Override
    public void ejecutarInvertido(Personaje personaje) {
        personaje.moverHaciaAbajo();
    }
}