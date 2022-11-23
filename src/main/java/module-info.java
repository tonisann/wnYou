module com.example.wnyou {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wnyou to javafx.fxml;
    exports com.example.wnyou;
}