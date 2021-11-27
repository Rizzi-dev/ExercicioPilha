module com.mycompany.progrpilha {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.progrpilha to javafx.fxml;
    exports com.mycompany.progrpilha;
}
