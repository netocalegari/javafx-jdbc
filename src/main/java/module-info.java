module com.netocalegari.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.sql;


    opens com.netocalegari.javafxjdbc to javafx.fxml;
    exports com.netocalegari.javafxjdbc;
    exports com.netocalegari.javafxjdbc.gui;
    exports com.netocalegari.javafxjdbc.model.services;
    exports com.netocalegari.javafxjdbc.model.entities;
    exports com.netocalegari.javafxjdbc.model.dao;
    opens com.netocalegari.javafxjdbc.gui to javafx.fxml;
}