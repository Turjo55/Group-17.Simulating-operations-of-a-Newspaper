module com.example.simulatingoperationsofanewspaper {
    requires javafx.controls;
    requires javafx.fxml;

    // Allow FXML to access these packages
    opens com.example.simulatingoperationsofanewspaper to javafx.fxml;
    opens com.example.simulatingoperationsofanewspaper.HRM to javafx.fxml;
    opens com.example.simulatingoperationsofanewspaper.TanvirulHRM to javafx.fxml;

    // Export main package (optional)
    exports com.example.simulatingoperationsofanewspaper;
}