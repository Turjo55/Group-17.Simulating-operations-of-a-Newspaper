package Shorna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CompetitorMarketAnalysis {

    @FXML
    private AnchorPane CompetitorMarketAnalysisLabel;

    @FXML
    private ListView<String> adCampaignList;

    @FXML
    private ListView<String> engagementStatsList;

    @FXML
    private TextArea recommendationArea;

    @FXML
    private ListView<String> socialMediaList;

    @FXML
    void handleLogin(ActionEvent event) {
        System.out.println("Login successful.");
    }

    @FXML
    void handleLoadDashboard(ActionEvent event) {
        System.out.println("Dashboard loaded.");
    }

    @FXML
    void handleCompetitorAnalysis(ActionEvent event) {
        // Simulate loading competitor data
        ObservableList<String> socialData = FXCollections.observableArrayList(
                "Competitor A: 12k Instagram followers",
                "Competitor B: 8k Facebook likes"
        );

        ObservableList<String> adData = FXCollections.observableArrayList(
                "Competitor A: Spring Sale Campaign",
                "Competitor B: YouTube Ads - April"
        );

        ObservableList<String> engagementData = FXCollections.observableArrayList(
                "CTR: 5.6%",
                "Bounce Rate: 35%",
                "Avg Session: 2m 30s"
        );

        socialMediaList.setItems(socialData);
        adCampaignList.setItems(adData);
        engagementStatsList.setItems(engagementData);

        recommendationArea.setText("Boost Instagram Reels\nRun YouTube Ads for Q2\nTarget younger demographics.");
    }

    public CompetitorMarketAnalysis(AnchorPane competitorMarketAnalysisLabel, ListView<String> adCampaignList, ListView<String> engagementStatsList, TextArea recommendationArea, ListView<String> socialMediaList) {
        CompetitorMarketAnalysisLabel = competitorMarketAnalysisLabel;
        this.adCampaignList = adCampaignList;
        this.engagementStatsList = engagementStatsList;
        this.recommendationArea = recommendationArea;
        this.socialMediaList = socialMediaList;
    }

    public AnchorPane getCompetitorMarketAnalysisLabel() {
        return CompetitorMarketAnalysisLabel;
    }

    public void setCompetitorMarketAnalysisLabel(AnchorPane competitorMarketAnalysisLabel) {
        CompetitorMarketAnalysisLabel = competitorMarketAnalysisLabel;
    }

    public ListView<String> getAdCampaignList() {
        return adCampaignList;
    }

    public void setAdCampaignList(ListView<String> adCampaignList) {
        this.adCampaignList = adCampaignList;
    }

    public ListView<String> getEngagementStatsList() {
        return engagementStatsList;
    }

    public void setEngagementStatsList(ListView<String> engagementStatsList) {
        this.engagementStatsList = engagementStatsList;
    }

    public TextArea getRecommendationArea() {
        return recommendationArea;
    }

    public void setRecommendationArea(TextArea recommendationArea) {
        this.recommendationArea = recommendationArea;
    }

    public ListView<String> getSocialMediaList() {
        return socialMediaList;
    }

    public void setSocialMediaList(ListView<String> socialMediaList) {
        this.socialMediaList = socialMediaList;
    }

    @Override
    public String toString() {
        return "CompetitorMarketAnalysis{" +
                "CompetitorMarketAnalysisLabel=" + CompetitorMarketAnalysisLabel +
                ", adCampaignList=" + adCampaignList +
                ", engagementStatsList=" + engagementStatsList +
                ", recommendationArea=" + recommendationArea +
                ", socialMediaList=" + socialMediaList +
                '}';
    }
}
