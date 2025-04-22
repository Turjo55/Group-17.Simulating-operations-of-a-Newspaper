package com.example.simulatingoperationsofanewspaper.maliha;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EditorEditingAndFormattingArticles {
    @FXML
    private ComboBox<String> categoryFilterComboBox;
    @FXML
    private ComboBox<String> priorityFilterComboBox;
    @FXML
    private ListView<Article> articleListView;
    @FXML
    private Label titleLabel;
    @FXML
    private Label authorLabel;
    @FXML
    private ComboBox<String> categoryComboBox;
    @FXML
    private ComboBox<String> priorityComboBox;
    @FXML
    private TextArea contentArea;
    @FXML
    private TextArea editorNotesArea;
    @FXML
    private Button saveButton;
    @FXML
    private Button submitButton;
    @FXML
    private Button refreshButton;

    private User user;
    private ObservableList<Article> articles;
    private final String[] categories = {
            "Politics", "Business", "Technology", "Science", "Health",
            "Sports", "Entertainment", "Education", "Environment", "Other"
    };
    private final String[] priorities = {
            "High", "Medium", "Low"
    };

    @FXML
    public void initialize() {
        // Initialize combo boxes
        String[] allCategories = new String[categories.length + 1];
        allCategories[0] = "All";
        System.arraycopy(categories, 0, allCategories, 1, categories.length);

        ObservableList<String> categoryOptions = FXCollections.observableArrayList(allCategories);
        categoryFilterComboBox.setItems(categoryOptions);
        categoryFilterComboBox.getSelectionModel().selectFirst();

        String[] allPriorities = new String[priorities.length + 1];
        allPriorities[0] = "All";
        System.arraycopy(priorities, 0, allPriorities, 1, priorities.length);

        ObservableList<String> priorityOptions = FXCollections.observableArrayList(allPriorities);
        priorityFilterComboBox.setItems(priorityOptions);
        priorityFilterComboBox.getSelectionModel().selectFirst();

        ObservableList<String> categoryList = FXCollections.observableArrayList(categories);
        categoryComboBox.setItems(categoryList);
        categoryComboBox.getSelectionModel().selectFirst();

        ObservableList<String> priorityList = FXCollections.observableArrayList(priorities);
        priorityComboBox.setItems(priorityList);
        priorityComboBox.getSelectionModel().selectFirst();

        // Initialize articles list
        articles = FXCollections.observableArrayList();
        articleListView.setItems(articles);

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

    @FXML
    private void handleSave(ActionEvent event) {
        // To be implemented
    }

    @FXML
    private void handleSubmit(ActionEvent event) {
        // To be implemented
    }

    @FXML
    private void handleRefresh(ActionEvent event) {
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