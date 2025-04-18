package Shorna.java;

public class RevenueReport {

    private String revenueDetails;
        private double subscriptionRevenue;
        private double advertisementRevenue;
        private double pendingPayments;
        private double receivedPayments;

        public RevenueReport(String revenueDetails, double subscriptionRevenue, double advertisementRevenue, double pendingPayments, double receivedPayments) {
            this.revenueDetails = revenueDetails;
            this.subscriptionRevenue = subscriptionRevenue;
            this.advertisementRevenue = advertisementRevenue;
            this.pendingPayments = pendingPayments;
            this.receivedPayments = receivedPayments;
        }

        public String getRevenueDetails() {
            return revenueDetails;
        }

        public double getSubscriptionRevenue() {
            return subscriptionRevenue;
        }

        public double getAdvertisementRevenue() {
            return advertisementRevenue;
        }

        public double getPendingPayments() {
            return pendingPayments;
        }

        public double getReceivedPayments() {
            return receivedPayments;
        }
    }

