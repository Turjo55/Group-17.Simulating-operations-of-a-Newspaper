package Shorna;

import Shorna.java.ArticlePerformance;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.util.Arrays;

public class SearchEngineOptimizationSEOAndDigitalPresence {

    @FXML
    private Label SearchEngineOptimizationDigitalPresenceLabel;

    @FXML
    private TextArea keywordSuggestions;

    @FXML
    private ListView<String> lowArticlesList;

    @FXML
    private TextArea outreachMessage;

    @FXML
    private DatePicker scheduleDate;

    @FXML
    private ListView<String> topArticlesList;

    @FXML
    public void initialize() {
        // Sample data - replace with actual dynamic content
        topArticlesList.getItems().addAll(
                new ArticlePerformance("10 SEO Tricks", true).toString(),
                new ArticlePerformance("Boosting Google Rank", true).toString()
        );

        lowArticlesList.getItems().addAll(
                new ArticlePerformance("Old Blog 2022", false).toString(),
                new ArticlePerformance("Outdated Trends", false).toString()
        );
    }

    @FXML
    void handleScheduleOutreach(ActionEvent event) {
        String message = outreachMessage.getText();
        LocalDate date = scheduleDate.getValue();

        if (message.isEmpty() || date == null) {
            System.out.println("Please fill out the message and date before scheduling.");
        } else {
            System.out.println("Outreach Scheduled!");
            System.out.println("Message: " + message);
            System.out.println("Scheduled Date: " + date);
        }
    }

    public SearchEngineOptimizationSEOAndDigitalPresence(Label searchEngineOptimizationDigitalPresenceLabel, TextArea keywordSuggestions, ListView<String> lowArticlesList, TextArea outreachMessage, DatePicker scheduleDate, ListView<String> topArticlesList) {
        SearchEngineOptimizationDigitalPresenceLabel = searchEngineOptimizationDigitalPresenceLabel;
        this.keywordSuggestions = keywordSuggestions;
        this.lowArticlesList = lowArticlesList;
        this.outreachMessage = outreachMessage;
        this.scheduleDate = scheduleDate;
        this.topArticlesList = topArticlesList;
    }

    public Label getSearchEngineOptimizationDigitalPresenceLabel() {
        return SearchEngineOptimizationDigitalPresenceLabel;
    }

    public void setSearchEngineOptimizationDigitalPresenceLabel(Label searchEngineOptimizationDigitalPresenceLabel) {
        SearchEngineOptimizationDigitalPresenceLabel = searchEngineOptimizationDigitalPresenceLabel;
    }

    public TextArea getKeywordSuggestions() {
        return keywordSuggestions;
    }

    public void setKeywordSuggestions(TextArea keywordSuggestions) {
        this.keywordSuggestions = keywordSuggestions;
    }

    public ListView<String> getLowArticlesList() {
        return lowArticlesList;
    }

    public void setLowArticlesList(ListView<String> lowArticlesList) {
        this.lowArticlesList = lowArticlesList;
    }

    public TextArea getOutreachMessage() {
        return outreachMessage;
    }

    public void setOutreachMessage(TextArea outreachMessage) {
        this.outreachMessage = outreachMessage;
    }

    public DatePicker getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(DatePicker scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public ListView<String> getTopArticlesList() {
        return topArticlesList;
    }

    public void setTopArticlesList(ListView<String> topArticlesList) {
        this.topArticlesList = topArticlesList;
    }

    @Override
    public String toString() {
        return "SearchEngineOptimizationSEOAndDigitalPresence{" +
                "SearchEngineOptimizationDigitalPresenceLabel=" + SearchEngineOptimizationDigitalPresenceLabel +
                ", keywordSuggestions=" + keywordSuggestions +
                ", lowArticlesList=" + lowArticlesList +
                ", outreachMessage=" + outreachMessage +
                ", scheduleDate=" + scheduleDate +
                ", topArticlesList=" + topArticlesList +
                '}';
    }
}
