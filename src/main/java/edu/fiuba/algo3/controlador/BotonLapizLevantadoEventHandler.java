package edu.fiuba.algo3.controlador;


import edu.fiuba.algo3.modelo.BloqueLapizLevantado;
import edu.fiuba.algo3.modelo.Tablero;
import javafx.scene.input.MouseEvent;

public class BotonLapizLevantadoEventHandler extends BotonBloqueEventHandler {

    public BotonLapizLevantadoEventHandler(Tablero tablero) {
        super(tablero);
    }

    @Override
    public void handle(MouseEvent event) {
        agregarBloqueAlTablero(new BloqueLapizLevantado());
    }
}