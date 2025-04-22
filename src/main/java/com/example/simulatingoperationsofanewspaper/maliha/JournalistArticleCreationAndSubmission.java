package com.example.simulatingoperationsofanewspaper.maliha;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.Scene;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JournalistArticleCreationAndSubmission {
    @FXML
    private TextField titleField;
    @FXML
    private ComboBox<String> categoryComboBox;
    @FXML
    private TextArea contentArea;
    @FXML
    private FlowPane imagePreviewContainer;
    @FXML
    private ListView<Article> draftsListView;
    @FXML
    private Label statusLabel;
    @FXML
    private Button addImageButton;
    @FXML
    private Button saveDraftButton;
    @FXML
    private Button submitButton;
    @FXML
    private Button loadDraftButton;

    private User user;
    private Article currentArticle;
    private ObservableList<Article> drafts;
    private final String[] categories = {
            "Politics", "Business", "Technology", "Science", "Health",
            "Sports", "Entertainment", "Education", "Environment", "Other"
    };

    @FXML
    public void initialize() {
        // Initialize category combo box
        categoryComboBox.setItems(FXCollections.observableArrayList(categories));
        categoryComboBox.getSelectionModel().selectFirst();

        // Initialize drafts list
        drafts = FXCollections.observableArrayList();
        draftsListView.setItems(drafts);

        // Set up draft selection listener
        draftsListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                loadArticleIntoForm(newVal);
            }
        });

        // Create a new article
        currentArticle = new Article("", "", "");
    }

    public void initData(User user) {
        this.user = user;
        currentArticle.setAuthor(user.getUsername());
        loadUserDrafts();
    }

    private void loadUserDrafts() {
        try {
            List<Article> userDrafts = ArticleFileManager.loadArticlesFromFile("drafts.bin");
            drafts.clear();
            drafts.addAll(userDrafts.stream()
                    .filter(article -> article.getAuthor().equals(user.getUsername()))
                    .toList());
        } catch (IOException | ClassNotFoundException e) {
            showAlert("Error", "Failed to load drafts: " + e.getMessage());
        }
    }

    @FXML
    public void handleCategorySelection(ActionEvent event) {
        String selectedCategory = categoryComboBox.getValue();
        if (selectedCategory != null) {
            currentArticle.setCategory(selectedCategory);
        }
    }

    private void createImagePreview(String imagePath) {
        // Create image view
        ImageView imageView = new ImageView(new Image(new File(imagePath).toURI().toString()));
        imageView.setFitWidth(100); // Reduced size
        imageView.setFitHeight(80); // Reduced height
        imageView.setPreserveRatio(true);

        // Add click handler to show enlarged image
        imageView.setOnMouseClicked(e -> showEnlargedImage(imagePath));

        // Create remove button
        Button removeButton = new Button("×");
        removeButton.setStyle("-fx-background-color: red; -fx-text-fill: white; -fx-font-weight: bold;");
        removeButton.setOnAction(e -> removeImage(imagePath));

        // Create stack pane to overlay button on image
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(imageView, removeButton);
        StackPane.setAlignment(removeButton, Pos.TOP_RIGHT);
        StackPane.setMargin(removeButton, new Insets(5));

        // Add to container
        imagePreviewContainer.getChildren().add(stackPane);
    }

    private void showEnlargedImage(String imagePath) {
        // Create new stage for enlarged image
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Image Preview");

        // Create image view
        ImageView imageView = new ImageView(new Image(new File(imagePath).toURI().toString()));
        imageView.setPreserveRatio(true);

        // Set initial size
        imageView.setFitWidth(800);
        imageView.setFitHeight(600);

        // Create scene and show
        Scene scene = new Scene(new StackPane(imageView));
        stage.setScene(scene);
        stage.show();

        // Add click handler to close
        imageView.setOnMouseClicked(e -> stage.close());
    }

    private void removeImage(String imagePath) {
        // Remove from UI
        imagePreviewContainer.getChildren().removeIf(node -> {
            if (node instanceof StackPane) {
                StackPane stackPane = (StackPane) node;
                ImageView imageView = (ImageView) stackPane.getChildren().get(0);
                return imageView.getImage().getUrl().equals(new File(imagePath).toURI().toString());
            }
            return false;
        });

        // Remove from article
        currentArticle.getImages().remove(imagePath);
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
    public void handleSaveDraft(ActionEvent event) {
        try {
            // Update article with current content
            currentArticle.setTitle(titleField.getText());
            currentArticle.setContent(contentArea.getText());
            currentArticle.setCategory(categoryComboBox.getValue());
            currentArticle.setStatus("Draft");

            // Save to drafts file
            ArticleFileManager.saveArticleToFile(currentArticle, "drafts.bin");

            // Update status and refresh drafts list
            statusLabel.setText("Status: Draft Saved");
            loadUserDrafts();
            showAlert("Success", "Draft saved successfully!");
        } catch (IOException e) {
            showAlert("Error", "Failed to save draft: " + e.getMessage());
        }
    }

    @FXML
    public void handleLoadDraft(ActionEvent event) {
        Article selectedDraft = draftsListView.getSelectionModel().getSelectedItem();
        if (selectedDraft != null) {
            loadArticleIntoForm(selectedDraft);
        } else {
            showAlert("Warning", "Please select a draft to load");
        }
    }

    private void loadArticleIntoForm(Article article) {
        titleField.setText(article.getTitle());
        contentArea.setText(article.getContent());
        categoryComboBox.setValue(article.getCategory());

        // Clear existing images
        imagePreviewContainer.getChildren().clear();

        // Load images
        for (String imagePath : article.getImages()) {
            createImagePreview(imagePath);
        }

        // Update current article
        currentArticle = article;
        statusLabel.setText("Status: " + article.getStatus());
    }

    @FXML
    public void handleSubmit(ActionEvent event) {
        // Validate input
        if (titleField.getText().isEmpty() || contentArea.getText().isEmpty()) {
            showAlert("Error", "Title and content are required!");
            return;
        }

        try {
            // Update article with current content
            currentArticle.setTitle(titleField.getText());
            currentArticle.setContent(contentArea.getText());
            currentArticle.setCategory(categoryComboBox.getValue());
            currentArticle.setStatus("Submitted");

            // Save to submitted articles file
            ArticleFileManager.saveArticleToFile(currentArticle, "submitted_articles.bin");

            // Remove from drafts if it exists
            if (drafts.contains(currentArticle)) {
                ArticleFileManager.removeArticleFromFile(currentArticle, "drafts.bin");
                drafts.remove(currentArticle);
            }

            // Clear the form
            titleField.clear();
            contentArea.clear();
            categoryComboBox.getSelectionModel().selectFirst();
            imagePreviewContainer.getChildren().clear();
            currentArticle = new Article("", "", "");
            currentArticle.setAuthor(user.getUsername());

            // Update status and refresh drafts list
            statusLabel.setText("Status: Submitted for Review");
            loadUserDrafts();
            showAlert("Success", "Article submitted successfully!");
        } catch (IOException e) {
            showAlert("Error", "Failed to submit article: " + e.getMessage());
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