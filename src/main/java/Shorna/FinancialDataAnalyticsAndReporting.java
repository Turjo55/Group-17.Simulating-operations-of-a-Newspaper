package Shorna;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextArea;
import java.io.FileWriter;
import java.io.IOException;
public class FinancialDataAnalyticsAndReporting {
    @FXML
        private LineChart<String, Number> revenueExpenseChart;

        @FXML
        private TextArea profitabilityReport;

        @FXML
        private TextArea predictiveInsights;

        @FXML
        public void handleLoadAnalytics() {
            // Real-time Revenue vs Expense
            XYChart.Series<String, Number> revenueSeries = new XYChart.Series<>();
            revenueSeries.setName("Revenue");
            revenueSeries.getData().add(new XYChart.Data<>("Jan", 12000));
            revenueSeries.getData().add(new XYChart.Data<>("Feb", 15000));
            revenueSeries.getData().add(new XYChart.Data<>("Mar", 18000));

            XYChart.Series<String, Number> expenseSeries = new XYChart.Series<>();
            expenseSeries.setName("Expense");
            expenseSeries.getData().add(new XYChart.Data<>("Jan", 9000));
            expenseSeries.getData().add(new XYChart.Data<>("Feb", 11000));
            expenseSeries.getData().add(new XYChart.Data<>("Mar", 13000));

            revenueExpenseChart.getData().clear();
            revenueExpenseChart.getData().addAll(revenueSeries, expenseSeries);

            // Profitability Report
            profitabilityReport.setText(
                    "Profitability Report:\n" +
                            "-------------------------\n" +
                            "Total Subscription Revenue: $25,000\n" +
                            "Total Ad Revenue: $10,000\n" +
                            "Operational Costs: $15,000\n" +
                            "Net Profit: $20,000"
            );

            // Predictive Insights
            predictiveInsights.setText(
                    "Based on historical trends, revenue is expected to grow 10% next quarter.\n" +
                            "Operational efficiency improvements could reduce costs by 8%."
            );
        }

        @FXML
        public void handleExportPDF() {
            try {
                FileWriter writer = new FileWriter("Financial_Report.pdf");
                writer.write(profitabilityReport.getText() + "\n\n" + predictiveInsights.getText());
                writer.close();
                System.out.println("Exported to PDF.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @FXML
        public void handleExportExcel() {
            try {
                FileWriter writer = new FileWriter("Financial_Report.csv");
                writer.write("Section,Details\n");
                writer.write("Profitability," + profitabilityReport.getText().replace("\n", " ") + "\n");
                writer.write("Predictions," + predictiveInsights.getText().replace("\n", " ") + "\n");
                writer.close();
                System.out.println("Exported to Excel.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public FinancialDataAnalyticsAndReporting(TextArea profitabilityReport, LineChart<String, Number> revenueExpenseChart, TextArea predictiveInsights) {
        this.profitabilityReport = profitabilityReport;
        this.revenueExpenseChart = revenueExpenseChart;
        this.predictiveInsights = predictiveInsights;
    }

    public LineChart<String, Number> getRevenueExpenseChart() {
        return revenueExpenseChart;
    }

    public void setRevenueExpenseChart(LineChart<String, Number> revenueExpenseChart) {
        this.revenueExpenseChart = revenueExpenseChart;
    }

    public TextArea getProfitabilityReport() {
        return profitabilityReport;
    }

    public void setProfitabilityReport(TextArea profitabilityReport) {
        this.profitabilityReport = profitabilityReport;
    }

    public TextArea getPredictiveInsights() {
        return predictiveInsights;
    }

    public void setPredictiveInsights(TextArea predictiveInsights) {
        this.predictiveInsights = predictiveInsights;
    }

    @Override
    public String toString() {
        return "FinancialDataAnalyticsAndReporting{" +
                "revenueExpenseChart=" + revenueExpenseChart +
                ", profitabilityReport=" + profitabilityReport +
                ", predictiveInsights=" + predictiveInsights +
                '}';
    }
}
