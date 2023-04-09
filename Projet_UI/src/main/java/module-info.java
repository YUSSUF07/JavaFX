module com.fx.projet_ui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.fx.projet_ui to javafx.fxml;
    exports com.fx.projet_ui;
}