module com.example.giocatore_grafica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.giocatore_grafica to javafx.fxml;
    exports com.example.giocatore_grafica;
}