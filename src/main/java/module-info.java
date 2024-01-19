module org.example.calculatorjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.calculatorjavafx to javafx.fxml;
    exports org.example.calculatorjavafx;
}