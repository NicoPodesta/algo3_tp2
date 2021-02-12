package edu.fiuba.algo3.modelo;

public class BloqueAbajo implements Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.moverHaciaAbajo();
    }

    @Override
    public void ejecutarInvertido(Personaje personaje) {
        personaje.moverHaciaArriba();
    }
}