module com.example.ir2023 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lucene.core;
    requires lucene.analyzers.common;
    requires lucene.queryparser;
    requires org.apache.opennlp.tools;

    opens com.example.controllers to javafx.fxml;
    exports com.example.controllers;
}