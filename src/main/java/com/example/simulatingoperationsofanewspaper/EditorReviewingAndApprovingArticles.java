package com.example.simulatingoperationsofanewspaper;

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
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EditorReviewingAndApprovingArticles {
    @FXML
    private ComboBox<String> statusFilterComboBox;
    @FXML
    private ComboBox<String> categoryFilterComboBox;
    @FXML
    private ListView<Article> articleListView;
    @FXML
    private Label titleLabel;
    @FXML
    private Label authorLabel;
    @FXML
    private Label categoryLabel;
    @FXML
    private TextArea contentArea;
    @FXML
    private FlowPane imagePreviewContainer;
    @FXML
    private ComboBox<String> priorityComboBox;
    @FXML
    private ComboBox<String> newCategoryComboBox;
    @FXML
    private TextArea feedbackArea;
    @FXML
    private Button refreshButton;
    @FXML
    private Button requestRevisionButton;
    @FXML
    private Button approveButton;
    @FXML
    private Button backButton;

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
        statusFilterComboBox.setItems(FXCollections.observableArrayList("All", "Submitted", "In Revision"));
        statusFilterComboBox.getSelectionModel().selectFirst();

        categoryFilterComboBox.setItems(FXCollections.observableArrayList(categories));
        categoryFilterComboBox.getSelectionModel().selectFirst();

        priorityComboBox.setItems(FXCollections.observableArrayList(priorities));
        priorityComboBox.getSelectionModel().selectFirst();

        newCategoryComboBox.setItems(FXCollections.observableArrayList(categories));
        newCategoryComboBox.getSelectionModel().selectFirst();

        // Initialize articles list
        articles = FXCollections.observableArrayList();
        articleListView.setItems(articles);

        // Set up article selection listener
        articleListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                loadArticleDetails(newVal);
            }
        });

        // Load initial articles
        loadArticles();
    }

    public void initData(User user) {
        this.user = user;
    }

    private void loadArticles() {
        try {
            List<Article> allArticles = ArticleFileManager.loadArticlesFromFile("submitted_articles.bin");
            articles.clear();
            articles.addAll(allArticles.stream()
                    .filter(article -> !"Approved".equals(article.getStatus()))
                    .toList());
        } catch (IOException | ClassNotFoundException e) {
            showAlert("Error", "Failed to load articles: " + e.getMessage());
        }
    }

    private void loadArticleDetails(Article article) {
        titleLabel.setText(article.getTitle());
        authorLabel.setText(article.getAuthor());
        categoryLabel.setText(article.getCategory());
        contentArea.setText(article.getContent());

        // Clear existing images
        imagePreviewContainer.getChildren().clear();

        // Load images
        for (String imagePath : article.getImages()) {
            createImagePreview(imagePath);
        }
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
    public void handleRefresh(ActionEvent event) {
        loadArticles();
    }

    @FXML
    public void handleRequestRevision(ActionEvent event) {
        Article selectedArticle = articleListView.getSelectionModel().getSelectedItem();
        if (selectedArticle == null) {
            showAlert("Error", "Please select an article to request revision");
            return;
        }

        String feedback = feedbackArea.getText();
        if (feedback.isEmpty()) {
            showAlert("Error", "Please provide feedback for the revision request");
            return;
        }

        try {
            selectedArticle.setStatus("In Revision");
            selectedArticle.setFeedback(feedback);
            ArticleFileManager.saveArticleToFile(selectedArticle, "submitted_articles.bin");
            loadArticles();
            showAlert("Success", "Revision requested successfully");
        } catch (IOException e) {
            showAlert("Error", "Failed to request revision: " + e.getMessage());
        }
    }

    @FXML
    public void handleApprove(ActionEvent event) {
        Article selectedArticle = articleListView.getSelectionModel().getSelectedItem();
        if (selectedArticle == null) {
            showAlert("Error", "Please select an article to approve");
            return;
        }

        try {
            selectedArticle.setStatus("Approved");
            selectedArticle.setPriority(priorityComboBox.getValue());
            selectedArticle.setCategory(newCategoryComboBox.getValue());
            ArticleFileManager.saveArticleToFile(selectedArticle, "approved_articles.bin");
            ArticleFileManager.removeArticleFromFile(selectedArticle, "submitted_articles.bin");
            loadArticles();
            showAlert("Success", "Article approved successfully");
        } catch (IOException e) {
            showAlert("Error", "Failed to approve article: " + e.getMessage());
        }
    }

    @FXML
    public void handleReject(ActionEvent event) {
        Article selectedArticle = articleListView.getSelectionModel().getSelectedItem();
        if (selectedArticle == null) {
            showAlert("Error", "Please select an article to reject");
            return;
        }

        String feedback = feedbackArea.getText();
        if (feedback.isEmpty()) {
            showAlert("Error", "Please provide feedback for the rejection");
            return;
        }

        try {
            selectedArticle.setStatus("Rejected");
            selectedArticle.setFeedback(feedback);
            ArticleFileManager.saveArticleToFile(selectedArticle, "rejected_articles.bin");
            ArticleFileManager.removeArticleFromFile(selectedArticle, "submitted_articles.bin");
            loadArticles();
            showAlert("Success", "Article rejected successfully");
        } catch (IOException e) {
            showAlert("Error", "Failed to reject article: " + e.getMessage());
        }
    }

    @FXML
    public void handleBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor_Dashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            showAlert("Error", "Failed to return to dashboard: " + e.getMessage());
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}