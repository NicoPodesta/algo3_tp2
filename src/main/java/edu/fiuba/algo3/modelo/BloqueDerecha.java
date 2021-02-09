package edu.fiuba.algo3.modelo;

public class BloqueDerecha implements Bloque {

    @Override
    public void ejecutar(Personaje personaje) {
        personaje.moverHaciaLaDerecha();
    }
}