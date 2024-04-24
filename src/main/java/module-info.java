module com.netocalegari.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.netocalegari.javafxjdbc to javafx.fxml;
    exports com.netocalegari.javafxjdbc;
    exports com.netocalegari.javafxjdbc.gui;
    opens com.netocalegari.javafxjdbc.gui to javafx.fxml;
}