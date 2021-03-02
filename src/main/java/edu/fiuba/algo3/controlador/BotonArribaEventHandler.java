package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.Bloque;
import edu.fiuba.algo3.modelo.BloqueArriba;
import edu.fiuba.algo3.modelo.ConjuntoBloques;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class BotonArribaEventHandler extends BotonBloqueEventHandler {

    public BotonArribaEventHandler(ConjuntoBloques algoritmo) {
        super(algoritmo);
    }

    @Override
    public void handle(MouseEvent event) {
        algoritmo.agregarBloque(new BloqueArriba());
    }
}