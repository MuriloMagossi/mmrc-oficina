module com.projinter.projinter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.projinter.projinter to javafx.fxml;
    exports com.projinter.projinter;
}