package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.BloqueIzquierda;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.input.MouseEvent;

public class BotonBloqueIzquierdaEventHandler extends BotonBloqueEventHandler {

    public BotonBloqueIzquierdaEventHandler(Tablero tablero) {
        super(tablero);
    }

    @Override
    public void handle(MouseEvent event) {
        agregarBloqueAlTablero(new BloqueIzquierda());
    }
}