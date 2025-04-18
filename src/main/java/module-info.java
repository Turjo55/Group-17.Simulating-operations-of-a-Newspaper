module com.example.simulatingoperationsofanewspaper {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.simulatingoperationsofanewspaper.TanvirulHRM to javafx.base, javafx.fxml;

    exports com.example.simulatingoperationsofanewspaper;
}