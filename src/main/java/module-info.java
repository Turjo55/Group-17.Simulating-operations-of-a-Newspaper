module com.example.simulatingoperationsofanewspaper {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.simulatingoperationsofanewspaper.TanvirulADMIN to javafx.base, javafx.fxml;

    exports com.example.simulatingoperationsofanewspaper;
}