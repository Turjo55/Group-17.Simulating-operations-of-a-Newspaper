package com.example.simulatingoperationsofanewspaper;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EditorManagingEditorialWorkflow {
    @FXML
    private ComboBox<String> statusFilterComboBox;
    @FXML
    private ComboBox<String> journalistFilterComboBox;
    @FXML
    private ListView<EditorialWorkflow> articleListView;
    @FXML
    private Label titleLabel;
    @FXML
    private Label journalistLabel;
    @FXML
    private ComboBox<String> statusComboBox;
    @FXML
    private ComboBox<String> journalistComboBox;
    @FXML
    private TextArea commentsArea;
    @FXML
    private Button updateButton;
    @FXML
    private Button reassignButton;
    @FXML
    private Button refreshButton;

    private User user;
    private ObservableList<EditorialWorkflow> workflows;
    private final String[] statuses = {
            "Pending", "In Review", "Approved", "Published"
    };

    @FXML
    public void initialize() {
        // Initialize combo boxes
        String[] allStatuses = new String[statuses.length + 1];
        allStatuses[0] = "All";
        System.arraycopy(statuses, 0, allStatuses, 1, statuses.length);

        ObservableList<String> statusOptions = FXCollections.observableArrayList(allStatuses);
        statusFilterComboBox.setItems(statusOptions);
        statusFilterComboBox.getSelectionModel().selectFirst();

        ObservableList<String> statusList = FXCollections.observableArrayList(statuses);
        statusComboBox.setItems(statusList);
        statusComboBox.getSelectionModel().selectFirst();

        // Initialize workflows list
        workflows = FXCollections.observableArrayList();
        articleListView.setItems(workflows);

        // Set up article selection listener
        articleListView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                loadWorkflowDetails(newVal);
            }
        });

        // Load initial data
        loadWorkflows();
        loadJournalists();
    }

    public void initData(User user) {
        this.user = user;
    }

    private void loadWorkflows() {
        try {
            List<EditorialWorkflow> savedWorkflows = loadWorkflowsFromFile();
            workflows.clear();
            workflows.addAll(savedWorkflows);
        } catch (IOException | ClassNotFoundException e) {
            showAlert("Error", "Failed to load workflows: " + e.getMessage());
        }
    }

    private void loadJournalists() {
        // This would typically load from a user database
        // For now, using sample data
        ObservableList<String> journalists = FXCollections.observableArrayList("All", "Journalist 1", "Journalist 2",
                "Journalist 3");
        journalistFilterComboBox.setItems(journalists);
        journalistFilterComboBox.getSelectionModel().selectFirst();

        ObservableList<String> assignableJournalists = FXCollections.observableArrayList("Journalist 1", "Journalist 2",
                "Journalist 3");
        journalistComboBox.setItems(assignableJournalists);
        journalistComboBox.getSelectionModel().selectFirst();
    }

    private void loadWorkflowDetails(EditorialWorkflow workflow) {
        titleLabel.setText(workflow.getTitle());
        journalistLabel.setText(workflow.getJournalist());
        statusComboBox.setValue(workflow.getStatus());
        journalistComboBox.setValue(workflow.getJournalist());
        commentsArea.setText(workflow.getComments());
    }

    @FXML
    private void handleUpdate(ActionEvent event) {
        EditorialWorkflow selectedWorkflow = articleListView.getSelectionModel().getSelectedItem();
        if (selectedWorkflow == null) {
            showAlert("Error", "Please select an article to update");
            return;
        }

        selectedWorkflow.setStatus(statusComboBox.getValue());
        selectedWorkflow.setComments(commentsArea.getText());

        try {
            saveWorkflowsToFile();
            showAlert("Success", "Workflow updated successfully");
            loadWorkflows();
        } catch (IOException e) {
            showAlert("Error", "Failed to save workflow: " + e.getMessage());
        }
    }

    @FXML
    private void handleReassign(ActionEvent event) {
        EditorialWorkflow selectedWorkflow = articleListView.getSelectionModel().getSelectedItem();
        if (selectedWorkflow == null) {
            showAlert("Error", "Please select an article to reassign");
            return;
        }

        selectedWorkflow.setJournalist(journalistComboBox.getValue());

        try {
            saveWorkflowsToFile();
            showAlert("Success", "Article reassigned successfully");
            loadWorkflows();
        } catch (IOException e) {
            showAlert("Error", "Failed to save workflow: " + e.getMessage());
        }
    }

    @FXML
    private void handleRefresh(ActionEvent event) {
        loadWorkflows();
    }

    private List<EditorialWorkflow> loadWorkflowsFromFile() throws IOException, ClassNotFoundException {
        File file = new File("editorial_workflows.bin");
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<EditorialWorkflow>) ois.readObject();
        }
    }

    private void saveWorkflowsToFile() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("editorial_workflows.bin"))) {
            oos.writeObject(new ArrayList<>(workflows));
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