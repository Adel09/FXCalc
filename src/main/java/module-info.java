module com.crumlabs.fxcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.crumlabs.fxcalculator to javafx.fxml;
    exports com.crumlabs.fxcalculator;
}