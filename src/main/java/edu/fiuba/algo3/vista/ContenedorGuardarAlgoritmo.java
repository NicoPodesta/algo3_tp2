package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonAgregarEventHandler;
import edu.fiuba.algo3.modelo.BloquePersonalizado;
import edu.fiuba.algo3.modelo.ConjuntoBloques;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ContenedorGuardarAlgoritmo extends GridPane {

    public ContenedorGuardarAlgoritmo(ConjuntoBloques algoritmo,
                                      ArrayList<BloquePersonalizado> bloquesPersonalizados, Stage stage) {
        setHgap(10);
        setVgap(10);
        add(new Text("Agregar Nobre del Algoritmo"),0,0);
        TextField texto = crearTextField();
        add(texto, 1,0);
        Button agregar = new Button("Agregar");
        agregar.setOnMouseClicked(new BotonAgregarEventHandler(algoritmo, bloquesPersonalizados,
                texto.getText(), stage));
        add(agregar, 1, 1);
        setAlignment(Pos.CENTER);
    }

    private TextField crearTextField() {
        TextField texto = new TextField();
        texto.setPrefColumnCount(20);
        return texto;
    }
}