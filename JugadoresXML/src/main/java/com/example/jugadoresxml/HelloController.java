package com.example.jugadoresxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label equipoLabel;
    @FXML
    private Label nombreLabel;
    @FXML
    private Label posicionlabel;
    @FXML
    private Label idLabel;
    @FXML
    private Label anoLabel;

    XML xml = new XML();
    int posicion;
    Jugador jugador;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        posicion = 0;

            try {
                xml.LeerXML("Jugadores.xml");

                jugador = xml.Read(posicion);

                mostrarJugadores();

            } catch (SAXException e) {
                throw new RuntimeException(e);
            } catch (ParserConfigurationException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


    }

    @FXML
    public void jugadorPosteriorOnClick (ActionEvent actionEvent){
        posicion++;
        if(posicion>=xml.cantidadRegistros()){

            vaciarJugadores();

        }
        else{

            jugador = xml.Read(posicion);

            mostrarJugadores();
        }
    }

    @FXML
    public void jugadorAnteriorOnClick (ActionEvent actionEvent){
        if(posicion >= 0)posicion--; //La posicion no debe ser <0

        if(posicion<0){
            vaciarJugadores();
        }
        else{

            jugador = xml.Read(posicion);

            mostrarJugadores();
        }

    }

    public void mostrarJugadores () {
        idLabel.setText(String.valueOf(jugador.getId()));
        nombreLabel.setText(jugador.getNombre());
        equipoLabel.setText(jugador.getEquipo());
        anoLabel.setText(String.valueOf(jugador.getAno()));
        posicionlabel.setText(jugador.getPosicion());
    }

    public void vaciarJugadores(){
        idLabel.setText("");
        nombreLabel.setText("");
        equipoLabel.setText("");
        anoLabel.setText("");
        posicionlabel.setText("");
    }
}

