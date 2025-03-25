module com.example.simulatingoperationsofanewspaper {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulatingoperationsofanewspaper to javafx.fxml;
    exports com.example.simulatingoperationsofanewspaper;
}