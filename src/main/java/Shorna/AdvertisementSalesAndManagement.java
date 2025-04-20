package Shorna;

import Shorna.java.AdSlot;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.ArrayList;
import java.util.List;

public class AdvertisementSalesAndManagement {

    @FXML
    private Label AdvertisementSalesManagementLabel;

    @FXML
    private ListView<String> adSlotsList;

    @FXML
    private TextArea analyticsOutput;

    private List<AdSlot> adSlotData = new ArrayList<>();

    @FXML
    void handleBookAd(ActionEvent event) {
        String selected = adSlotsList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            showAlert("Ad Booked", "The ad slot '" + selected + "' has been booked.");
        } else {
            showAlert("Selection Missing", "Please select an ad slot to book.");
        }
    }

    @FXML
    void handleManageCampaign(ActionEvent event) {
        showAlert("Manage Campaign", "Opening campaign management interface...");
    }

    @FXML
    void handleScheduleAd(ActionEvent event) {
        String selected = adSlotsList.getSelectionModel().getSelectedItem();
        if (selected != null) {
            showAlert("Ad Scheduled", "Ad slot '" + selected + "' has been scheduled.");
        } else {
            showAlert("Selection Missing", "Please select an ad slot to schedule.");
        }
    }

    @FXML
    void handleSelectAdSales(ActionEvent event) {
        // Simulate loading ad slots
        adSlotData.clear();
        adSlotData.add(new AdSlot("Homepage Banner", "Top banner spot"));
        adSlotData.add(new AdSlot("Sidebar Ad", "Right sidebar section"));
        adSlotData.add(new AdSlot("Footer Slot", "Ad at bottom"));

        adSlotsList.getItems().clear();
        for (AdSlot slot : adSlotData) {
            adSlotsList.getItems().add(slot.getName());
        }

        analyticsOutput.clear();
        analyticsOutput.setText("Loaded " + adSlotData.size() + " ad slots.");
    }

    @FXML
    void handleSendInvoice(ActionEvent event) {
        showAlert("Invoice Sent", "Invoice and confirmation have been sent to the client.");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
