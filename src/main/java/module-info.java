module com.netocalegari.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.netocalegari.javafxjdbc to javafx.fxml;
    exports com.netocalegari.javafxjdbc;
}