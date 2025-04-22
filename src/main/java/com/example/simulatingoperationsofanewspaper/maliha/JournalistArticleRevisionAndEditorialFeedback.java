package com.example.simulatingoperationsofanewspaper.maliha;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.time.LocalDate;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JournalistArticleRevisionAndEditorialFeedback {
    @FXML
    private ComboBox<String> statusFilterComboBox;
    @FXML
    private ComboBox<String> categoryFilterComboBox;
    @FXML
    private ListView<Article> articleListView;
    @FXML
    private Label titleLabel;
    @FXML
    private Label categoryLabel;
    @FXML
    private TextArea feedbackArea;
    @FXML
    private TextArea contentArea;
    @FXML
    private FlowPane imagePreviewContainer;
    @FXML
    private Button addImageButton;
    @FXML
    private Button removeImageButton;
    @FXML
    private Button saveDraftButton;
    @FXML
    private Button resubmitButton;
    @FXML
    private Button refreshButton;
    @FXML
    private ListView<ArticleRevision> revisionHistoryListView;
    @FXML
    private TextArea editorCommentsArea;
    @FXML
    private TextArea requiredChangesArea;
    @FXML
    private DatePicker deadlineDatePicker;
    @FXML
    private ComboBox<String> statusComboBox;
    @FXML
    private ComboBox<String> priorityComboBox;
    @FXML
    private TextArea originalContentArea;
    @FXML
    private TextArea revisedContentArea;
    @FXML
    private TextArea changesMadeArea;
    @FXML
    private TextArea revisionNotesArea;

    private User user;
    private Article currentArticle;
    private ObservableList<Article> articles;
    private ObservableList<ArticleRevision> revisions;
    private ObservableList<EditorialFeedback> feedbackList;
    private final String[] categories = {
            "Politics", "Business", "Technology", "Science", "Health",
            "Sports", "Entertainment", "Education", "Environment", "Other"
    };
    @FXML
    private Button submitRevisionButton;
    private final String[] statuses = { "Pending", "Acknowledged", "Clarification Requested", "Completed" };
    private final String[] priorities = { "High", "Medium", "Low" };

    @FXML
    public void initialize() {
        // Initialize combo boxes
        statusFilterComboBox.setItems(FXCollections.observableArrayList("All", "In Revision"));
        statusFilterComboBox.getSelectionModel().selectFirst();

        categoryFilterComboBox.setItems(FXCollections.observableArrayList(categories));
        categoryFilterComboBox.getSelectionModel().selectFirst();

        // Initialize articles list
        articles = FXCollections.observableArrayList();
        articleListView.setItems(articles);

        // Initialize revision history list
        revisions = FXCollections.observableArrayList();
        revisionHistoryListView.setItems(revisions);

        // Initialize date picker
        deadlineDatePicker.setValue(LocalDate.now());

        // Initialize combo boxes
        ObservableList<String> statusList = FXCollections.observableArrayList(statuses);
        statusComboBox.setItems(statusList);
        statusComboBox.getSelectionModel().selectFirst();

        ObservableList<String> priorityList = FXCollections.observableArrayList(priorities);
        priorityComboBox.setItems(priorityList);
        priorityComboBox.getSelectionModel().selectFirst();

        // Set up article selection listener
        articleListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                loadArticleDetails(newVal);
            }
        });

        // Set up revision selection listener
        revisionHistoryListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                loadRevisionDetails(newVal);
            }
        });

        // Load initial data
//        loadArticles();
//        loadRevisions();
    }

    public void initData(User user) {
        this.user = user;
        if (user != null) {
            loadArticles();
        } else {
            showAlert("Error", "User not properly initialized");
        }
    }

    private void loadArticles() {
        try {
            List<Article> allArticles = ArticleFileManager.loadArticlesFromFile("submitted_articles.bin");
            articles.clear();
            articles.addAll(allArticles.stream()
                    .filter(article -> article.getAuthor().equals(user.getUsername()) &&
                            "In Revision".equals(article.getStatus()))
                    .toList());
        } catch (IOException | ClassNotFoundException e) {
            showAlert("Error", "Failed to load articles: " + e.getMessage());
        }
    }

    private void loadRevisions() {
        // To be implemented
    }

    private void loadArticleDetails(Article article) {
        currentArticle = article;
        titleLabel.setText(article.getTitle());
        categoryLabel.setText(article.getCategory());
        feedbackArea.setText(article.getFeedback());
        contentArea.setText(article.getContent());

        // Clear existing images
        imagePreviewContainer.getChildren().clear();

        // Load images
        for (String imagePath : article.getImages()) {
            createImagePreview(imagePath);
        }
    }

    private void loadRevisionDetails(ArticleRevision revision) {
        // To be implemented
    }

    private void createImagePreview(String imagePath) {
        ImageView imageView = new ImageView(new Image(new File(imagePath).toURI().toString()));
        imageView.setFitWidth(100);
        imageView.setFitHeight(80);
        imageView.setPreserveRatio(true);

        // Add click handler to show enlarged image
        imageView.setOnMouseClicked(e -> showEnlargedImage(imagePath));

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(imageView);
        StackPane.setAlignment(imageView, Pos.CENTER);

        imagePreviewContainer.getChildren().add(stackPane);
    }

    private void showEnlargedImage(String imagePath) {
        Stage stage = new Stage();
        stage.setTitle("Image Preview");

        ImageView imageView = new ImageView(new Image(new File(imagePath).toURI().toString()));
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(800);
        imageView.setFitHeight(600);

        StackPane root = new StackPane(imageView);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        imageView.setOnMouseClicked(e -> stage.close());
    }

    @FXML
    public void handleAddImage(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif"));

        File selectedFile = fileChooser.showOpenDialog(new Stage());
        if (selectedFile != null) {
            String imagePath = selectedFile.getAbsolutePath();
            currentArticle.addImage(imagePath);
            createImagePreview(imagePath);
        }
    }

    @FXML
    public void handleRemoveImage(ActionEvent event) {
        // Get the selected image from the container
        // This would need to be implemented based on how you want to select images
        // For now, we'll just remove the last image
        if (!currentArticle.getImages().isEmpty()) {
            String lastImage = currentArticle.getImages().remove(currentArticle.getImages().size() - 1);
            imagePreviewContainer.getChildren().remove(imagePreviewContainer.getChildren().size() - 1);
        }
    }

    @FXML
    public void handleSaveDraft(ActionEvent event) {
        if (currentArticle == null) {
            showAlert("Error", "Please select an article to save");
            return;
        }

        try {
            currentArticle.setContent(contentArea.getText());
            ArticleFileManager.saveArticleToFile(currentArticle, "drafts.bin");
            showAlert("Success", "Draft saved successfully");
        } catch (IOException e) {
            showAlert("Error", "Failed to save draft: " + e.getMessage());
        }
    }

    @FXML
    public void handleResubmit(ActionEvent event) {
        if (currentArticle == null) {
            showAlert("Error", "Please select an article to resubmit");
            return;
        }

        try {
            currentArticle.setContent(contentArea.getText());
            currentArticle.setStatus("Submitted");
            ArticleFileManager.saveArticleToFile(currentArticle, "submitted_articles.bin");
            ArticleFileManager.removeArticleFromFile(currentArticle, "drafts.bin");
            loadArticles();
            showAlert("Success", "Article resubmitted successfully");
        } catch (IOException e) {
            showAlert("Error", "Failed to resubmit article: " + e.getMessage());
        }
    }

    @FXML
    public void handleRefresh(ActionEvent event) {
        loadArticles();
    }

    @Deprecated
    public void handleBack(ActionEvent event) {
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    public void handleSubmitRevision(ActionEvent event) {
        // To be implemented
    }

    // Feedback Management Methods
    @FXML
    private void handleAcknowledgeFeedback(ActionEvent event) {
        // To be implemented
    }

    @FXML
    private void handleRequestClarification(ActionEvent event) {
        // To be implemented
    }

    // History and Export Methods
    @FXML
    private void handleViewHistory(ActionEvent event) {
        // To be implemented
    }

    @FXML
    private void handleExportFeedback(ActionEvent event) {
        // To be implemented
    }

    // Utility Methods
    @FXML
    private void handleLoadArticles(ActionEvent event) {
        // To be implemented
    }
}