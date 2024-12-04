module com.example.jugadoresxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.logging;


    opens com.example.jugadoresxml to javafx.fxml;
    exports com.example.jugadoresxml;
}