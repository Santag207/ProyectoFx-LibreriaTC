module proyectofxlibreriatc.proyectofxlibreriatc {
    requires javafx.controls;
    requires javafx.fxml;


    opens proyectofxlibreriatc.proyectofxlibreriatc to javafx.fxml;
    exports proyectofxlibreriatc.proyectofxlibreriatc;
}