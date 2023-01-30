module com.example.redovnost {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.redovnost to javafx.fxml;
    exports com.example.redovnost;
}