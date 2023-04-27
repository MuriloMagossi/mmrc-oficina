module com.oficina.mmrc {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.oficina.mmrc to javafx.fxml;
    exports com.oficina.mmrc;
    exports com.oficina.mmrc.entidades;
    opens com.oficina.mmrc.entidades to javafx.fxml;
}