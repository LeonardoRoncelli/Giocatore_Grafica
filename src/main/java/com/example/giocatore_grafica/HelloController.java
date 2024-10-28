package com.example.giocatore_grafica;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    private Giocatore[]giocatori=new Giocatore[100];

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public void onaggiungiClick(ActionEvent actionEvent) {
        Funzioni.aggiunta(giocatori);
    }
}