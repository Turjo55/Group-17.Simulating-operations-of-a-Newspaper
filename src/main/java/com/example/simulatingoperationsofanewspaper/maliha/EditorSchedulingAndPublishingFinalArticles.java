package com.example.simulatingoperationsofanewspaper.maliha;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import java.time.LocalDate;
import java.time.LocalTime;

public class EditorSchedulingAndPublishingFinalArticles {
    @FXML
    private ListView<Article> articleListView;
    @FXML
    private TextField titleField;
    @FXML
    private TextField categoryField;
    @FXML
    private DatePicker publicationDatePicker;
    @FXML
    private Spinner<Integer> hourSpinner;
    @FXML
    private Spinner<Integer> minuteSpinner;
    @FXML
    private CheckBox printCheckBox;
    @FXML
    private CheckBox onlineCheckBox;
    @FXML
    private ImageView layoutPreviewImageView;
    @FXML
    private ComboBox<String> statusComboBox;
    @FXML
    private Button loadArticlesButton;
    @FXML
    private Button refreshButton;
    @FXML
    private Button scheduleButton;
    @FXML
    private Button publishButton;
    @FXML
    private Button previewButton;

    private User user;
    private ObservableList<Article> articles;
    private final String[] statuses = { "Draft", "Scheduled", "Published", "Archived" };

    @FXML
    public void initialize() {
        // Initialize articles list
        articles = FXCollections.observableArrayList();
        articleListView.setItems(articles);

        // Initialize date picker
        publicationDatePicker.setValue(LocalDate.now());

        // Initialize time spinners
        SpinnerValueFactory<Integer> hourFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 23,
                LocalTime.now().getHour());
        hourSpinner.setValueFactory(hourFactory);

        SpinnerValueFactory<Integer> minuteFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 59,
                LocalTime.now().getMinute());
        minuteSpinner.setValueFactory(minuteFactory);

        // Initialize status combo box
        ObservableList<String> statusList = FXCollections.observableArrayList(statuses);
        statusComboBox.setItems(statusList);
        statusComboBox.getSelectionModel().selectFirst();

        // Set up article selection listener
        articleListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                loadArticleDetails(newVal);
            }
        });

        // Load initial data
        loadArticles();
    }

    public void initData(User user) {
        this.user = user;
    }

    private void loadArticles() {
        // To be implemented
    }

    private void loadArticleDetails(Article article) {
        // To be implemented
    }

    @Deprecated
    private void handleLoadArticles(ActionEvent event) {
        // To be implemented
    }

    @Deprecated
    private void handleRefresh(ActionEvent event) {
        // To be implemented
    }

    @Deprecated
    private void handleSchedule(ActionEvent event) {
        // To be implemented
    }

    @Deprecated
    private void handlePublish(ActionEvent event) {
        // To be implemented
    }

    @Deprecated
    private void handlePreview(ActionEvent event) {
        // To be implemented
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}