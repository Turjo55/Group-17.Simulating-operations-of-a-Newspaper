package com.example.simulatingoperationsofanewspaper.maliha;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EditorAssigningArticlesToJournalists {
    @FXML
    private ComboBox<String> statusFilterComboBox;
    @FXML
    private ComboBox<String> priorityFilterComboBox;
    @FXML
    private ListView<ArticleAssignment> assignmentListView;
    @FXML
    private TextField topicField;
    @FXML
    private TextArea descriptionArea;
    @FXML
    private DatePicker deadlinePicker;
    @FXML
    private ComboBox<String> priorityComboBox;
    @FXML
    private ComboBox<String> journalistComboBox;
    @FXML
    private Button createAssignmentButton;
    @FXML
    private Button updateAssignmentButton;
    @FXML
    private Button refreshButton;

    private User editor;
    private ObservableList<ArticleAssignment> assignments;
    private ObservableList<String> journalists;
    private static final String ASSIGNMENTS_FILE = "assignments.dat";

    public void initialize() {
        // Initialize lists
        assignments = FXCollections.observableArrayList();
        journalists = FXCollections.observableArrayList();

        // Set up combo boxes
        statusFilterComboBox.setItems(FXCollections.observableArrayList("All", "Pending", "In Progress", "Completed"));
        priorityFilterComboBox.setItems(FXCollections.observableArrayList("All", "High", "Medium", "Low"));
        priorityComboBox.setItems(FXCollections.observableArrayList("High", "Medium", "Low"));

        // Load existing assignments
        loadAssignments();
        loadJournalists();

        // Set up listeners
        assignmentListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                displayAssignmentDetails(newVal);
            }
        });

        // Set default values
        statusFilterComboBox.setValue("All");
        priorityFilterComboBox.setValue("All");
    }

    public void initData(User editor) {
        this.editor = editor;
    }

    private void loadAssignments() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ASSIGNMENTS_FILE))) {
            List<ArticleAssignment> loadedAssignments = (List<ArticleAssignment>) ois.readObject();
            assignments.setAll(loadedAssignments);
            assignmentListView.setItems(assignments);
        } catch (FileNotFoundException e) {
            // File doesn't exist yet, create empty list
            assignments.clear();
        } catch (IOException | ClassNotFoundException e) {
            showAlert("Error", "Failed to load assignments: " + e.getMessage());
        }
    }

    private void loadJournalists() {
        // TODO: Load journalists from your user management system
        // This is a placeholder - replace with actual journalist loading logic
        journalists.addAll("Journalist 1", "Journalist 2", "Journalist 3");
        journalistComboBox.setItems(journalists);
    }

    private void saveAssignments() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ASSIGNMENTS_FILE))) {
            oos.writeObject(new ArrayList<>(assignments));
        } catch (IOException e) {
            showAlert("Error", "Failed to save assignments: " + e.getMessage());
        }
    }

    private void displayAssignmentDetails(ArticleAssignment assignment) {
        topicField.setText(assignment.getTopic());
        descriptionArea.setText(assignment.getDescription());
        deadlinePicker.setValue(assignment.getDeadline());
        priorityComboBox.setValue(assignment.getPriority());
        journalistComboBox.setValue(assignment.getAssignedJournalist());
    }

    @FXML
    private void handleCreateAssignment() {
        if (validateInput()) {
            ArticleAssignment newAssignment = new ArticleAssignment(
                    topicField.getText(),
                    descriptionArea.getText(),
                    deadlinePicker.getValue(),
                    priorityComboBox.getValue(),
                    journalistComboBox.getValue(),
                    "Pending",
                    editor.getUsername());

            assignments.add(newAssignment);
            saveAssignments();
            clearFields();
            showAlert("Success", "Assignment created successfully!");
        }
    }

    @FXML
    private void handleUpdateAssignment() {
        ArticleAssignment selectedAssignment = assignmentListView.getSelectionModel().getSelectedItem();
        if (selectedAssignment != null && validateInput()) {
            selectedAssignment.setTopic(topicField.getText());
            selectedAssignment.setDescription(descriptionArea.getText());
            selectedAssignment.setDeadline(deadlinePicker.getValue());
            selectedAssignment.setPriority(priorityComboBox.getValue());
            selectedAssignment.setAssignedJournalist(journalistComboBox.getValue());

            saveAssignments();
            assignmentListView.refresh();
            showAlert("Success", "Assignment updated successfully!");
        } else {
            showAlert("Error", "Please select an assignment to update");
        }
    }

    @FXML
    private void handleRefresh() {
        String statusFilter = statusFilterComboBox.getValue();
        String priorityFilter = priorityFilterComboBox.getValue();

        ObservableList<ArticleAssignment> filteredAssignments = FXCollections.observableArrayList();
        for (ArticleAssignment assignment : assignments) {
            if ((statusFilter.equals("All") || assignment.getStatus().equals(statusFilter)) &&
                    (priorityFilter.equals("All") || assignment.getPriority().equals(priorityFilter))) {
                filteredAssignments.add(assignment);
            }
        }

        assignmentListView.setItems(filteredAssignments);
    }

    @FXML
    private void handleBack(ActionEvent event) {
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("EditorDashboard.fxml"));
//            Parent root = loader.load();
//
//            EditorDashboard controller = loader.getController();
//            controller.setEditor(editor);
//
//            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
//            stage.setScene(new Scene(root));
//        } catch (IOException e) {
//            showAlert("Error", "Failed to load dashboard: " + e.getMessage());
//        }
    }

    private boolean validateInput() {
        if (topicField.getText().isEmpty()) {
            showAlert("Error", "Please enter a topic");
            return false;
        }
        if (descriptionArea.getText().isEmpty()) {
            showAlert("Error", "Please enter a description");
            return false;
        }
        if (deadlinePicker.getValue() == null) {
            showAlert("Error", "Please select a deadline");
            return false;
        }
        if (deadlinePicker.getValue().isBefore(LocalDate.now())) {
            showAlert("Error", "Deadline cannot be in the past");
            return false;
        }
        if (priorityComboBox.getValue() == null) {
            showAlert("Error", "Please select a priority");
            return false;
        }
        if (journalistComboBox.getValue() == null) {
            showAlert("Error", "Please select a journalist");
            return false;
        }
        return true;
    }

    private void clearFields() {
        topicField.clear();
        descriptionArea.clear();
        deadlinePicker.setValue(null);
        priorityComboBox.setValue(null);
        journalistComboBox.setValue(null);
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}