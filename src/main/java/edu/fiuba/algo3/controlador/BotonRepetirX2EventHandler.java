package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.BloquePersonalizado;
import edu.fiuba.algo3.modelo.BloqueRepetir;
import edu.fiuba.algo3.modelo.ConjuntoBloques;
import edu.fiuba.algo3.vista.ContenedorConjuntoBloques;
import edu.fiuba.algo3.vista.VistaAlgoritmo;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;

public class BotonRepetirX2EventHandler extends BotonConjuntoBloquesEventHandler {

    public BotonRepetirX2EventHandler(ConjuntoBloques algoritmo, BloquePersonalizado bloquePersonalizado) {
        super(algoritmo, bloquePersonalizado);
    }

    @Override
    public void handle(MouseEvent event) {
        BloqueRepetir bloqueRepetir = new BloqueRepetir(2);
        Stage stage = new Stage();

        ContenedorConjuntoBloques contenedor = new ContenedorConjuntoBloques(algoritmo, bloqueRepetir, bloquePersonalizado, stage);
        VistaAlgoritmo vistaAlgoritmo = new VistaAlgoritmo(bloqueRepetir, contenedor);
        bloqueRepetir.addObserver(vistaAlgoritmo);
        
        stage.setScene(new Scene(contenedor,720,420));
        stage.setResizable(false);
        stage.setTitle("Creación bloque repetir dos veces");
        stage.show();
    }
}